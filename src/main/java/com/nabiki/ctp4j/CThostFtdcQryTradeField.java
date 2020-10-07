/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcQryTradeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryTradeField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcQryTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_TradeID_get(swigCPtr, this);
  }

  public void setTradeTimeStart(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_TradeTimeStart_set(swigCPtr, this, value);
  }

  public String getTradeTimeStart() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_TradeTimeStart_get(swigCPtr, this);
  }

  public void setTradeTimeEnd(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_TradeTimeEnd_set(swigCPtr, this, value);
  }

  public String getTradeTimeEnd() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_TradeTimeEnd_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryTradeField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQryTradeField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcQryTradeField(), true);
  }

}