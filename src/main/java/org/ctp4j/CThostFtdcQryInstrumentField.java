/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcQryInstrumentField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryInstrumentField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInstrumentField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcQryInstrumentField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryInstrumentField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryInstrumentField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryInstrumentField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryInstrumentField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryInstrumentField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryInstrumentField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryInstrumentField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryInstrumentField_ProductID_get(swigCPtr, this);
  }

  public CThostFtdcQryInstrumentField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcQryInstrumentField(), true);
  }

}
