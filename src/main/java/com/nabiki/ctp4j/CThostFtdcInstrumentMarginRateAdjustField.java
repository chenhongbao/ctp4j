/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcInstrumentMarginRateAdjustField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentMarginRateAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentMarginRateAdjustField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcInstrumentMarginRateAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateAdjustField_IsRelative_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentMarginRateAdjustField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcInstrumentMarginRateAdjustField(), true);
  }

}
