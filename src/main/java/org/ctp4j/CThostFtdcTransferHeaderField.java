/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcTransferHeaderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferHeaderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferHeaderField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcTransferHeaderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_Version_set(swigCPtr, this, value);
  }

  public String getVersion() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_Version_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_TradeCode_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeSerial(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_TradeSerial_set(swigCPtr, this, value);
  }

  public String getTradeSerial() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_TradeSerial_get(swigCPtr, this);
  }

  public void setFutureID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_FutureID_set(swigCPtr, this, value);
  }

  public String getFutureID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_FutureID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_BankBrchID_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_OperNo_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_DeviceID_get(swigCPtr, this);
  }

  public void setRecordNum(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_RecordNum_set(swigCPtr, this, value);
  }

  public String getRecordNum() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_RecordNum_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_SessionID_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTransferHeaderField_RequestID_get(swigCPtr, this);
  }

  public CThostFtdcTransferHeaderField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcTransferHeaderField(), true);
  }

}