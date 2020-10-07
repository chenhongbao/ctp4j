/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nabiki.ctp4j;

public class CThostFtdcCancelAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCancelAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCancelAccountField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcCancelAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setCashExchangeCode(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_CashExchangeCode_set(swigCPtr, this, value);
  }

  public char getCashExchangeCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_CashExchangeCode_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_OperNo_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_TID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_UserID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_ErrorMsg_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return ThostFtdcCtpApiJNI.CThostFtdcCancelAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcCancelAccountField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcCancelAccountField(), true);
  }

}