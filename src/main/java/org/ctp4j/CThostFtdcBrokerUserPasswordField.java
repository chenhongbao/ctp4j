/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcBrokerUserPasswordField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserPasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserPasswordField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcBrokerUserPasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_Password_get(swigCPtr, this);
  }

  public void setLastUpdateTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_LastUpdateTime_set(swigCPtr, this, value);
  }

  public String getLastUpdateTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_LastUpdateTime_get(swigCPtr, this);
  }

  public void setLastLoginTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_LastLoginTime_set(swigCPtr, this, value);
  }

  public String getLastLoginTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_LastLoginTime_get(swigCPtr, this);
  }

  public void setExpireDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_ExpireDate_set(swigCPtr, this, value);
  }

  public String getExpireDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_ExpireDate_get(swigCPtr, this);
  }

  public void setWeakExpireDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_WeakExpireDate_set(swigCPtr, this, value);
  }

  public String getWeakExpireDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcBrokerUserPasswordField_WeakExpireDate_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserPasswordField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcBrokerUserPasswordField(), true);
  }

}