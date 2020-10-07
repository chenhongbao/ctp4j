/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcReqDayEndFileReadyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqDayEndFileReadyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqDayEndFileReadyField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcReqDayEndFileReadyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_SessionID_get(swigCPtr, this);
  }

  public void setFileBusinessCode(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_FileBusinessCode_set(swigCPtr, this, value);
  }

  public char getFileBusinessCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_FileBusinessCode_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqDayEndFileReadyField_Digest_get(swigCPtr, this);
  }

  public CThostFtdcReqDayEndFileReadyField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcReqDayEndFileReadyField(), true);
  }

}