/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcRspUserLogin2Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspUserLogin2Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspUserLogin2Field obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcRspUserLogin2Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_TradingDay_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_LoginTime_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_UserID_get(swigCPtr, this);
  }

  public void setSystemName(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_SystemName_set(swigCPtr, this, value);
  }

  public String getSystemName() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_SystemName_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_SessionID_get(swigCPtr, this);
  }

  public void setMaxOrderRef(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_MaxOrderRef_set(swigCPtr, this, value);
  }

  public String getMaxOrderRef() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_MaxOrderRef_get(swigCPtr, this);
  }

  public void setSHFETime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_SHFETime_set(swigCPtr, this, value);
  }

  public String getSHFETime() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_SHFETime_get(swigCPtr, this);
  }

  public void setDCETime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_DCETime_set(swigCPtr, this, value);
  }

  public String getDCETime() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_DCETime_get(swigCPtr, this);
  }

  public void setCZCETime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_CZCETime_set(swigCPtr, this, value);
  }

  public String getCZCETime() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_CZCETime_get(swigCPtr, this);
  }

  public void setFFEXTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_FFEXTime_set(swigCPtr, this, value);
  }

  public String getFFEXTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_FFEXTime_get(swigCPtr, this);
  }

  public void setINETime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_INETime_set(swigCPtr, this, value);
  }

  public String getINETime() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_INETime_get(swigCPtr, this);
  }

  public void setRandomString(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_RandomString_set(swigCPtr, this, value);
  }

  public String getRandomString() {
    return ThostFtdcCtpApiJNI.CThostFtdcRspUserLogin2Field_RandomString_get(swigCPtr, this);
  }

  public CThostFtdcRspUserLogin2Field() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcRspUserLogin2Field(), true);
  }

}
