/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcReqVerifyApiKeyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqVerifyApiKeyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqVerifyApiKeyField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcReqVerifyApiKeyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setApiHandshakeDataLen(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqVerifyApiKeyField_ApiHandshakeDataLen_set(swigCPtr, this, value);
  }

  public int getApiHandshakeDataLen() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqVerifyApiKeyField_ApiHandshakeDataLen_get(swigCPtr, this);
  }

  public void setApiHandshakeData(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReqVerifyApiKeyField_ApiHandshakeData_set(swigCPtr, this, value);
  }

  public String getApiHandshakeData() {
    return ThostFtdcCtpApiJNI.CThostFtdcReqVerifyApiKeyField_ApiHandshakeData_get(swigCPtr, this);
  }

  public CThostFtdcReqVerifyApiKeyField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcReqVerifyApiKeyField(), true);
  }

}
