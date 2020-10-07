/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcReqUserLoginField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqUserLoginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqUserLoginField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcReqUserLoginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_Password_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_MacAddress_get(swigCPtr, this);
  }

  public void setOneTimePassword(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_OneTimePassword_set(swigCPtr, this, value);
  }

  public String getOneTimePassword() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_OneTimePassword_get(swigCPtr, this);
  }

  public void setClientIPAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_ClientIPAddress_set(swigCPtr, this, value);
  }

  public String getClientIPAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_ClientIPAddress_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_LoginRemark_get(swigCPtr, this);
  }

  public void setClientIPPort(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_ClientIPPort_set(swigCPtr, this, value);
  }

  public int getClientIPPort() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqUserLoginField_ClientIPPort_get(swigCPtr, this);
  }

  public CThostFtdcReqUserLoginField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcReqUserLoginField(), true);
  }

}
