/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcQryExchangeQuoteActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryExchangeQuoteActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeQuoteActionField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcQryExchangeQuoteActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryExchangeQuoteActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryExchangeQuoteActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryExchangeQuoteActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryExchangeQuoteActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryExchangeQuoteActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryExchangeQuoteActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryExchangeQuoteActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryExchangeQuoteActionField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeQuoteActionField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcQryExchangeQuoteActionField(), true);
  }

}
