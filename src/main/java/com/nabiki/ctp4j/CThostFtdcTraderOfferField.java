/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcTraderOfferField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTraderOfferField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTraderOfferField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcTraderOfferField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_TraderID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ParticipantID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_OrderLocalID_get(swigCPtr, this);
  }

  public void setTraderConnectStatus(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_TraderConnectStatus_set(swigCPtr, this, value);
  }

  public char getTraderConnectStatus() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_TraderConnectStatus_get(swigCPtr, this);
  }

  public void setConnectRequestDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ConnectRequestDate_set(swigCPtr, this, value);
  }

  public String getConnectRequestDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ConnectRequestDate_get(swigCPtr, this);
  }

  public void setConnectRequestTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ConnectRequestTime_set(swigCPtr, this, value);
  }

  public String getConnectRequestTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ConnectRequestTime_get(swigCPtr, this);
  }

  public void setLastReportDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_LastReportDate_set(swigCPtr, this, value);
  }

  public String getLastReportDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_LastReportDate_get(swigCPtr, this);
  }

  public void setLastReportTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_LastReportTime_set(swigCPtr, this, value);
  }

  public String getLastReportTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_LastReportTime_get(swigCPtr, this);
  }

  public void setConnectDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ConnectDate_set(swigCPtr, this, value);
  }

  public String getConnectDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ConnectDate_get(swigCPtr, this);
  }

  public void setConnectTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ConnectTime_set(swigCPtr, this, value);
  }

  public String getConnectTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_ConnectTime_get(swigCPtr, this);
  }

  public void setStartDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_StartDate_set(swigCPtr, this, value);
  }

  public String getStartDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_StartDate_get(swigCPtr, this);
  }

  public void setStartTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_StartTime_set(swigCPtr, this, value);
  }

  public String getStartTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_StartTime_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_BrokerID_get(swigCPtr, this);
  }

  public void setMaxTradeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_MaxTradeID_set(swigCPtr, this, value);
  }

  public String getMaxTradeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_MaxTradeID_get(swigCPtr, this);
  }

  public void setMaxOrderMessageReference(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_MaxOrderMessageReference_set(swigCPtr, this, value);
  }

  public String getMaxOrderMessageReference() {
    return ThostFtdcCtpApiJNI.CThostFtdcTraderOfferField_MaxOrderMessageReference_get(swigCPtr, this);
  }

  public CThostFtdcTraderOfferField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcTraderOfferField(), true);
  }

}
