/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcQryBrokerUserEventField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryBrokerUserEventField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryBrokerUserEventField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcQryBrokerUserEventField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryBrokerUserEventField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryBrokerUserEventField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryBrokerUserEventField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryBrokerUserEventField_UserID_get(swigCPtr, this);
  }

  public void setUserEventType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryBrokerUserEventField_UserEventType_set(swigCPtr, this, value);
  }

  public char getUserEventType() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryBrokerUserEventField_UserEventType_get(swigCPtr, this);
  }

  public CThostFtdcQryBrokerUserEventField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcQryBrokerUserEventField(), true);
  }

}