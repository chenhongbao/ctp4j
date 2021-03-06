/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcUserSystemInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcUserSystemInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserSystemInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ThostFtdcCtpApiJNI.delete_CThostFtdcUserSystemInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_UserID_get(swigCPtr, this);
  }

  public void setClientSystemInfoLen(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientSystemInfoLen_set(swigCPtr, this, value);
  }

  public int getClientSystemInfoLen() {
    return ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientSystemInfoLen_get(swigCPtr, this);
  }

  public void setClientSystemInfo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientSystemInfo_set(swigCPtr, this, value);
  }

  public String getClientSystemInfo() {
    return ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientSystemInfo_get(swigCPtr, this);
  }

  public void setClientPublicIP(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientPublicIP_set(swigCPtr, this, value);
  }

  public String getClientPublicIP() {
    return ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientPublicIP_get(swigCPtr, this);
  }

  public void setClientIPPort(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientIPPort_set(swigCPtr, this, value);
  }

  public int getClientIPPort() {
    return ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientIPPort_get(swigCPtr, this);
  }

  public void setClientLoginTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientLoginTime_set(swigCPtr, this, value);
  }

  public String getClientLoginTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientLoginTime_get(swigCPtr, this);
  }

  public void setClientAppID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientAppID_set(swigCPtr, this, value);
  }

  public String getClientAppID() {
    return ThostFtdcCtpApiJNI.CThostFtdcUserSystemInfoField_ClientAppID_get(swigCPtr, this);
  }

  public CThostFtdcUserSystemInfoField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcUserSystemInfoField(), true);
  }

}
