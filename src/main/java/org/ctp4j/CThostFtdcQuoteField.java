/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcQuoteField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQuoteField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setQuoteRef(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_QuoteRef_set(swigCPtr, this, value);
  }

  public String getQuoteRef() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_QuoteRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_UserID_get(swigCPtr, this);
  }

  public void setAskPrice(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskPrice_set(swigCPtr, this, value);
  }

  public double getAskPrice() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskPrice_get(swigCPtr, this);
  }

  public void setBidPrice(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidPrice_set(swigCPtr, this, value);
  }

  public double getBidPrice() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidPrice_get(swigCPtr, this);
  }

  public void setAskVolume(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskVolume_set(swigCPtr, this, value);
  }

  public int getAskVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskVolume_get(swigCPtr, this);
  }

  public void setBidVolume(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidVolume_set(swigCPtr, this, value);
  }

  public int getBidVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidVolume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BusinessUnit_get(swigCPtr, this);
  }

  public void setAskOffsetFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskOffsetFlag_set(swigCPtr, this, value);
  }

  public char getAskOffsetFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskOffsetFlag_get(swigCPtr, this);
  }

  public void setBidOffsetFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidOffsetFlag_set(swigCPtr, this, value);
  }

  public char getBidOffsetFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidOffsetFlag_get(swigCPtr, this);
  }

  public void setAskHedgeFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskHedgeFlag_set(swigCPtr, this, value);
  }

  public char getAskHedgeFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskHedgeFlag_get(swigCPtr, this);
  }

  public void setBidHedgeFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidHedgeFlag_set(swigCPtr, this, value);
  }

  public char getBidHedgeFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidHedgeFlag_get(swigCPtr, this);
  }

  public void setQuoteLocalID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_QuoteLocalID_set(swigCPtr, this, value);
  }

  public String getQuoteLocalID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_QuoteLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InstallID_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_NotifySequence_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_SettlementID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_QuoteSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_CancelTime_get(swigCPtr, this);
  }

  public void setQuoteStatus(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_QuoteStatus_set(swigCPtr, this, value);
  }

  public char getQuoteStatus() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_QuoteStatus_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_SequenceNo_get(swigCPtr, this);
  }

  public void setAskOrderSysID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskOrderSysID_set(swigCPtr, this, value);
  }

  public String getAskOrderSysID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskOrderSysID_get(swigCPtr, this);
  }

  public void setBidOrderSysID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidOrderSysID_set(swigCPtr, this, value);
  }

  public String getBidOrderSysID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidOrderSysID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerQuoteSeq(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BrokerQuoteSeq_set(swigCPtr, this, value);
  }

  public int getBrokerQuoteSeq() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BrokerQuoteSeq_get(swigCPtr, this);
  }

  public void setAskOrderRef(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskOrderRef_set(swigCPtr, this, value);
  }

  public String getAskOrderRef() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AskOrderRef_get(swigCPtr, this);
  }

  public void setBidOrderRef(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidOrderRef_set(swigCPtr, this, value);
  }

  public String getBidOrderRef() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BidOrderRef_get(swigCPtr, this);
  }

  public void setForQuoteSysID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ForQuoteSysID_set(swigCPtr, this, value);
  }

  public String getForQuoteSysID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_ForQuoteSysID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_CurrencyID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcQuoteField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcQuoteField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcQuoteField(), true);
  }

}