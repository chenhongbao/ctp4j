/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcQryExchangeRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryExchangeRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeRateField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcQryExchangeRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryExchangeRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryExchangeRateField_BrokerID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryExchangeRateField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryExchangeRateField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryExchangeRateField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryExchangeRateField_ToCurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeRateField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcQryExchangeRateField(), true);
  }

}