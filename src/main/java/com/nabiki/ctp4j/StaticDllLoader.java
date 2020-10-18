package com.nabiki.ctp4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class StaticDllLoader {
  /* Library names may change across different versions. */
  private final static String[] DLLS = new String[]{
      "thostmduserapi_se",
      "thosttraderapi_se",
      "thost-v6.3.19-P1-ctp4j-1.0.2"
  };

  private static final Logger LOGGER = Logger.getLogger(ThostFtdcCtpApi.Version);
  private static final Collection<Path> DLL_SEARCH_PATHS = new HashSet<>();

  static {
    try {
      logger();
      path();
      for (var name : DLLS) {
        library(name);
      }
    } catch (Throwable th) {
      th.printStackTrace();
      LOGGER.severe(th.getMessage());
    }
  }

  public static Collection<Path> getDllSearchPaths(Path root) {
    var r = new LinkedList<Path>();
    if (root == null || !Files.isDirectory(root)) {
      return r;
    }
    var dirs = root.toFile().listFiles(File::isDirectory);
    if (dirs == null) {
      return r;
    }
    for (var d : dirs) {
      var p = d.toPath();
      r.add(p);
      r.addAll(getDllSearchPaths(p));
    }
    return r;
  }

  public static File search(String fileName, Path current) {
    if (fileName == null || current == null) {
      return null;
    }
    if (Files.isDirectory(current)) {
      var files = current.toFile().listFiles(File::isFile);
      if (files != null) {
        for (var f : files) {
          var r = search(fileName, f.toPath());
          if (r != null) {
            return r;
          }
        }
      }
      return null;
    } else {
      if (fileName.equals(current.getFileName().toString())) {
        return current.toFile();
      } else {
        return null;
      }
    }
  }

  public static Path getCurrentPath() {
    return Path.of(new File("").getAbsolutePath());
  }

  public static Path getJarPath(Class<?> clz) {
    try {
      var p = clz.getProtectionDomain()
          .getCodeSource()
          .getLocation()
          .getPath();
      return new File(p).toPath();
    } catch (Throwable ignored) {
      return getCurrentPath();
    }
  }

  public static String getLibraryExtension() {
    var os = System.getProperty("os.name");
    if (os == null) {
      return "";
    }
    os = os.toLowerCase();
    if (os.contains("win")) {
      return ".dll";
    } else {
      return ".so";
    }
  }

  private static void logger() throws IOException {
    var fh = new FileHandler(ThostFtdcCtpApi.Version.concat(".log"));
    fh.setFormatter(new SimpleFormatter());
    fh.setEncoding(StandardCharsets.UTF_8.name());
    LOGGER.addHandler(fh);
  }

  public static void path() {
    DLL_SEARCH_PATHS.add(getCurrentPath());
    DLL_SEARCH_PATHS.add(getJarPath(StaticDllLoader.class).getParent());
  }

  public static void library(String soleName) {
    boolean loaded = false;
    var ext = getLibraryExtension();
    String[] dlls = new String[]{
        soleName + ext.toUpperCase(),
        soleName + ext.toLowerCase()
    };
    for (var path : DLL_SEARCH_PATHS) {
      for (var dll : dlls) {
        var f = search(dll, path);
        if (f != null) {
          loaded = true;
          System.load(f.getAbsolutePath());
          break;
        }
      }
      if (loaded) {
        break;
      }
    }
    if (!loaded) {
      tryExportLoad(dlls);
    }
  }

  private static void tryExportLoad(String[] dlls) {
    boolean loaded = false;
    for (var dll : dlls) {
      var f = export(dll);
      if (f != null) {
        loaded = true;
        System.load(f.getAbsolutePath());
      }
    }
    if (!loaded) {
      LOGGER.severe(String.format(
          "Can't load %s from %s",
          conjunct(Arrays.asList(dlls.clone())),
          conjunctPath(DLL_SEARCH_PATHS)));
    }
  }

  private static File export(String dll) {
    var ins = StaticDllLoader.class.getResourceAsStream("/DLL/" + dll);
    if (ins == null) {
      return null;
    }
    File file = new File(getCurrentPath() + "/" + dll);
    try (FileOutputStream os = new FileOutputStream(file, false)) {
      os.write(ins.readAllBytes());
      os.flush();
    } catch (IOException e) {
      LOGGER.severe(String.format(
          "Can't create DLL: %s, %s", file.getAbsolutePath(), e.getMessage()));
      return null;
    }
    file.deleteOnExit();
    return file;
  }

  private static String conjunct(Collection<String> s) {
    if (s == null || s.isEmpty()) {
      return "[]";
    } else if (s.size() == 1) {
      return "[" + s.iterator().next() + "]";
    } else {
      var iterator = s.iterator();
      var r = "[" + iterator.next();
      while (iterator.hasNext()) {
        r += ", " + iterator.next();
      }
      r += "]";
      return r;
    }
  }

  private static String conjunctPath(Collection<Path> p) {
    var s = new LinkedList<String>();
    if (p == null) {
      return conjunct(new LinkedList<>());
    } else {
      for (var p0 : p) {
        s.add(p0.toAbsolutePath().toString());
      }
      return conjunct(s);
    }
  }
}
