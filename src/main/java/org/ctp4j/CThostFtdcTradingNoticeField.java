/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcTradingNoticeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingNoticeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingNoticeField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcTradingNoticeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_InvestorID_get(swigCPtr, this);
  }

  public void setSequenceSeries(short value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_SequenceSeries_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_UserID_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_SendTime_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_SequenceNo_get(swigCPtr, this);
  }

  public void setFieldContent(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_FieldContent_set(swigCPtr, this, value);
  }

  public String getFieldContent() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_FieldContent_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingNoticeField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcTradingNoticeField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcTradingNoticeField(), true);
  }

}