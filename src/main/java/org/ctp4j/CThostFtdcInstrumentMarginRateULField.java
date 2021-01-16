/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcInstrumentMarginRateULField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentMarginRateULField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentMarginRateULField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcInstrumentMarginRateULField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcInstrumentMarginRateULField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentMarginRateULField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcInstrumentMarginRateULField(), true);
  }

}