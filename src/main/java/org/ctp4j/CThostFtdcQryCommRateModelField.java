/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcQryCommRateModelField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryCommRateModelField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryCommRateModelField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcQryCommRateModelField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryCommRateModelField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryCommRateModelField_BrokerID_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcQryCommRateModelField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return ThostFtdcCtpApiJNI.CThostFtdcQryCommRateModelField_CommModelID_get(swigCPtr, this);
  }

  public CThostFtdcQryCommRateModelField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcQryCommRateModelField(), true);
  }

}