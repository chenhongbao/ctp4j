/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcSuperUserFunctionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSuperUserFunctionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSuperUserFunctionField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcSuperUserFunctionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSuperUserFunctionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcSuperUserFunctionField_UserID_get(swigCPtr, this);
  }

  public void setFunctionCode(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcSuperUserFunctionField_FunctionCode_set(swigCPtr, this, value);
  }

  public char getFunctionCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcSuperUserFunctionField_FunctionCode_get(swigCPtr, this);
  }

  public CThostFtdcSuperUserFunctionField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcSuperUserFunctionField(), true);
  }

}