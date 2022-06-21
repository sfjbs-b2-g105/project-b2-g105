package com.pension.entity;

public class BankDetails {
	private String BankName;					
	private String AccountNumber;				
	private String BankType;
	public BankDetails(String bankName, String accountNumber, String bankType) {
		super();
		this.BankName = bankName;
		this.AccountNumber = accountNumber;
		this.BankType = bankType;
	}
	public BankDetails() {
		super();
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getBankType() {
		return BankType;
	}
	public void setBankType(String bankType) {
		BankType = bankType;
	}
	

	
}
