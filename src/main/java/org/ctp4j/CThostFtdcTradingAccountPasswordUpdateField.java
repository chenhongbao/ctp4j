/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcTradingAccountPasswordUpdateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingAccountPasswordUpdateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingAccountPasswordUpdateField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcTradingAccountPasswordUpdateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingAccountPasswordUpdateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingAccountPasswordUpdateField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingAccountPasswordUpdateField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingAccountPasswordUpdateField_AccountID_get(swigCPtr, this);
  }

  public void setOldPassword(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingAccountPasswordUpdateField_OldPassword_set(swigCPtr, this, value);
  }

  public String getOldPassword() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingAccountPasswordUpdateField_OldPassword_get(swigCPtr, this);
  }

  public void setNewPassword(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingAccountPasswordUpdateField_NewPassword_set(swigCPtr, this, value);
  }

  public String getNewPassword() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingAccountPasswordUpdateField_NewPassword_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcTradingAccountPasswordUpdateField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostFtdcCtpApiJNI.CThostFtdcTradingAccountPasswordUpdateField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcTradingAccountPasswordUpdateField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcTradingAccountPasswordUpdateField(), true);
  }

}