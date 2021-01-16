/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcSyncingInvestorField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingInvestorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInvestorField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcSyncingInvestorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setInvestorName(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_InvestorName_set(swigCPtr, this, value);
  }

  public String getInvestorName() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_InvestorName_get(swigCPtr, this);
  }

  public void setIdentifiedCardType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_set(swigCPtr, this, value);
  }

  public char getIdentifiedCardType() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_IsActive_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_Telephone_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_Address_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_OpenDate_get(swigCPtr, this);
  }

  public void setMobile(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_Mobile_set(swigCPtr, this, value);
  }

  public String getMobile() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_Mobile_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_CommModelID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return ThostFtdcCtpApiJNI.CThostFtdcSyncingInvestorField_MarginModelID_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInvestorField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcSyncingInvestorField(), true);
  }

}