/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcSyncDelaySwapField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDelaySwapField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDelaySwapField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcSyncDelaySwapField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDelaySwapSeqNo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_DelaySwapSeqNo_set(swigCPtr, this, value);
  }

  public String getDelaySwapSeqNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_DelaySwapSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_InvestorID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setFromAmount(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_FromAmount_set(swigCPtr, this, value);
  }

  public double getFromAmount() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_FromAmount_get(swigCPtr, this);
  }

  public void setFromFrozenSwap(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_FromFrozenSwap_set(swigCPtr, this, value);
  }

  public double getFromFrozenSwap() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_FromFrozenSwap_get(swigCPtr, this);
  }

  public void setFromRemainSwap(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_FromRemainSwap_set(swigCPtr, this, value);
  }

  public double getFromRemainSwap() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_FromRemainSwap_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_ToCurrencyID_get(swigCPtr, this);
  }

  public void setToAmount(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_ToAmount_set(swigCPtr, this, value);
  }

  public double getToAmount() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_ToAmount_get(swigCPtr, this);
  }

  public void setIsManualSwap(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_IsManualSwap_set(swigCPtr, this, value);
  }

  public int getIsManualSwap() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_IsManualSwap_get(swigCPtr, this);
  }

  public void setIsAllRemainSetZero(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_IsAllRemainSetZero_set(swigCPtr, this, value);
  }

  public int getIsAllRemainSetZero() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncDelaySwapField_IsAllRemainSetZero_get(swigCPtr, this);
  }

  public CThostFtdcSyncDelaySwapField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcSyncDelaySwapField(), true);
  }

}
