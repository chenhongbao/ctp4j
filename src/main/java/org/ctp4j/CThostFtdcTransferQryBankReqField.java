/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcTransferQryBankReqField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferQryBankReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryBankReqField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcTransferQryBankReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferQryBankReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferQryBankReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferQryBankReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferQryBankReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferQryBankReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferQryBankReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferQryBankReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferQryBankReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryBankReqField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcTransferQryBankReqField(), true);
  }

}
