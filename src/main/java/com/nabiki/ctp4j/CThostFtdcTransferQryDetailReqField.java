/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcTransferQryDetailReqField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferQryDetailReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryDetailReqField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcTransferQryDetailReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferQryDetailReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferQryDetailReqField_FutureAccount_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryDetailReqField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcTransferQryDetailReqField(), true);
  }

}
