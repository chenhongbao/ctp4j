/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcBrokerTradingAlgosField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerTradingAlgosField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerTradingAlgosField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcBrokerTradingAlgosField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_InstrumentID_get(swigCPtr, this);
  }

  public void setHandlePositionAlgoID(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_HandlePositionAlgoID_set(swigCPtr, this, value);
  }

  public char getHandlePositionAlgoID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_HandlePositionAlgoID_get(swigCPtr, this);
  }

  public void setFindMarginRateAlgoID(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_FindMarginRateAlgoID_set(swigCPtr, this, value);
  }

  public char getFindMarginRateAlgoID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_FindMarginRateAlgoID_get(swigCPtr, this);
  }

  public void setHandleTradingAccountAlgoID(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_HandleTradingAccountAlgoID_set(swigCPtr, this, value);
  }

  public char getHandleTradingAccountAlgoID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerTradingAlgosField_HandleTradingAccountAlgoID_get(swigCPtr, this);
  }

  public CThostFtdcBrokerTradingAlgosField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcBrokerTradingAlgosField(), true);
  }

}