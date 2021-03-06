/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcForQuoteField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcForQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcForQuoteField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcForQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setForQuoteRef(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ForQuoteRef_set(swigCPtr, this, value);
  }

  public String getForQuoteRef() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ForQuoteRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_UserID_get(swigCPtr, this);
  }

  public void setForQuoteLocalID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ForQuoteLocalID_set(swigCPtr, this, value);
  }

  public String getForQuoteLocalID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ForQuoteLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InstallID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InsertTime_get(swigCPtr, this);
  }

  public void setForQuoteStatus(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ForQuoteStatus_set(swigCPtr, this, value);
  }

  public char getForQuoteStatus() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ForQuoteStatus_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_SessionID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerForQutoSeq(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_BrokerForQutoSeq_set(swigCPtr, this, value);
  }

  public int getBrokerForQutoSeq() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_BrokerForQutoSeq_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcForQuoteField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcForQuoteField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcForQuoteField(), true);
  }

}
