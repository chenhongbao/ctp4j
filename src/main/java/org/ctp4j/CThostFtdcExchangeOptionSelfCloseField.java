/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcExchangeOptionSelfCloseField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeOptionSelfCloseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOptionSelfCloseField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcExchangeOptionSelfCloseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVolume(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_BusinessUnit_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_HedgeFlag_get(swigCPtr, this);
  }

  public void setOptSelfCloseFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_OptSelfCloseFlag_set(swigCPtr, this, value);
  }

  public char getOptSelfCloseFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_OptSelfCloseFlag_get(swigCPtr, this);
  }

  public void setOptionSelfCloseLocalID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseLocalID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseLocalID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_SettlementID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_SequenceNo_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeOptionSelfCloseField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOptionSelfCloseField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcExchangeOptionSelfCloseField(), true);
  }

}
