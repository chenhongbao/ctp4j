/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcInstrumentStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentStatusField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcInstrumentStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setSettlementGroupID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_SettlementGroupID_set(swigCPtr, this, value);
  }

  public String getSettlementGroupID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_SettlementGroupID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_InstrumentID_get(swigCPtr, this);
  }

  public void setInstrumentStatus(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_InstrumentStatus_set(swigCPtr, this, value);
  }

  public char getInstrumentStatus() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_InstrumentStatus_get(swigCPtr, this);
  }

  public void setTradingSegmentSN(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_TradingSegmentSN_set(swigCPtr, this, value);
  }

  public int getTradingSegmentSN() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_TradingSegmentSN_get(swigCPtr, this);
  }

  public void setEnterTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_EnterTime_set(swigCPtr, this, value);
  }

  public String getEnterTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_EnterTime_get(swigCPtr, this);
  }

  public void setEnterReason(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_EnterReason_set(swigCPtr, this, value);
  }

  public char getEnterReason() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentStatusField_EnterReason_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentStatusField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcInstrumentStatusField(), true);
  }

}
