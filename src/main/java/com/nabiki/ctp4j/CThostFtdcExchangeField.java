/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcExchangeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcExchangeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeName(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeField_ExchangeName_set(swigCPtr, this, value);
  }

  public String getExchangeName() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeField_ExchangeName_get(swigCPtr, this);
  }

  public void setExchangeProperty(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcExchangeField_ExchangeProperty_set(swigCPtr, this, value);
  }

  public char getExchangeProperty() {
    return ThostFtdcCtpApiJNI.CThostFtdcExchangeField_ExchangeProperty_get(swigCPtr, this);
  }

  public CThostFtdcExchangeField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcExchangeField(), true);
  }

}
