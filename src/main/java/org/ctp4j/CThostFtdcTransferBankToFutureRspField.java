/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcTransferBankToFutureRspField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferBankToFutureRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferBankToFutureRspField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcTransferBankToFutureRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRetCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_RetCode_set(swigCPtr, this, value);
  }

  public String getRetCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_RetCode_get(swigCPtr, this);
  }

  public void setRetInfo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_RetInfo_set(swigCPtr, this, value);
  }

  public String getRetInfo() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_RetInfo_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_TradeAmt_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_CustFee_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferBankToFutureRspField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferBankToFutureRspField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcTransferBankToFutureRspField(), true);
  }

}