/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ctp4j;

public class CThostFtdcReserveOpenAccountConfirmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReserveOpenAccountConfirmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReserveOpenAccountConfirmField obj) {
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
        ThostFtdcCtpApiJNI.delete_CThostFtdcReserveOpenAccountConfirmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankPassWord_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_CurrencyID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setTID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_TID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_Password_get(swigCPtr, this);
  }

  public void setBankReserveOpenSeq(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankReserveOpenSeq_set(swigCPtr, this, value);
  }

  public String getBankReserveOpenSeq() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BankReserveOpenSeq_get(swigCPtr, this);
  }

  public void setBookDate(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BookDate_set(swigCPtr, this, value);
  }

  public String getBookDate() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BookDate_get(swigCPtr, this);
  }

  public void setBookPsw(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BookPsw_set(swigCPtr, this, value);
  }

  public String getBookPsw() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_BookPsw_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ThostFtdcCtpApiJNI.CThostFtdcReserveOpenAccountConfirmField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcReserveOpenAccountConfirmField() {
    this(ThostFtdcCtpApiJNI.new_CThostFtdcReserveOpenAccountConfirmField(), true);
  }

}
