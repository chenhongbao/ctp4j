/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcReqAuthenticateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqAuthenticateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqAuthenticateField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcReqAuthenticateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqAuthenticateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqAuthenticateField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqAuthenticateField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqAuthenticateField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqAuthenticateField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqAuthenticateField_UserProductInfo_get(swigCPtr, this);
  }

  public void setAuthCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqAuthenticateField_AuthCode_set(swigCPtr, this, value);
  }

  public String getAuthCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqAuthenticateField_AuthCode_get(swigCPtr, this);
  }

  public void setAppID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqAuthenticateField_AppID_set(swigCPtr, this, value);
  }

  public String getAppID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqAuthenticateField_AppID_get(swigCPtr, this);
  }

  public CThostFtdcReqAuthenticateField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcReqAuthenticateField(), true);
  }

}
