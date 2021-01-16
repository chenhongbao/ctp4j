/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcMMOptionInstrCommRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMMOptionInstrCommRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMMOptionInstrCommRateField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcMMOptionInstrCommRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_InvestorID_get(swigCPtr, this);
  }

  public void setOpenRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_OpenRatioByMoney_set(swigCPtr, this, value);
  }

  public double getOpenRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_OpenRatioByMoney_get(swigCPtr, this);
  }

  public void setOpenRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_OpenRatioByVolume_set(swigCPtr, this, value);
  }

  public double getOpenRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_OpenRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_CloseRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_CloseRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_CloseRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_CloseRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_CloseTodayRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_CloseTodayRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_CloseTodayRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_CloseTodayRatioByVolume_get(swigCPtr, this);
  }

  public void setStrikeRatioByMoney(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_StrikeRatioByMoney_set(swigCPtr, this, value);
  }

  public double getStrikeRatioByMoney() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_StrikeRatioByMoney_get(swigCPtr, this);
  }

  public void setStrikeRatioByVolume(double value) {
    ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_StrikeRatioByVolume_set(swigCPtr, this, value);
  }

  public double getStrikeRatioByVolume() {
    return ThostFtdcCtpApiJNI.CThostFtdcMMOptionInstrCommRateField_StrikeRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcMMOptionInstrCommRateField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcMMOptionInstrCommRateField(), true);
  }

}