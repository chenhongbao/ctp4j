/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcCurrTransferIdentityField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCurrTransferIdentityField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCurrTransferIdentityField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcCurrTransferIdentityField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIdentityID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcCurrTransferIdentityField_IdentityID_set(swigCPtr, this, value);
  }

  public int getIdentityID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCurrTransferIdentityField_IdentityID_get(swigCPtr, this);
  }

  public CThostFtdcCurrTransferIdentityField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcCurrTransferIdentityField(), true);
  }

}