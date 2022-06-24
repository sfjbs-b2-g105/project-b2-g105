package com.tcs.ProcessPensionModule.model;

public class ProcessPensionInput {

	private String aadhaarNumber;
	private double pensionAmount;
	private double bankCharge;
	public ProcessPensionInput(String aadhaarNumber, double pensionAmount, double bankCharge) {
		super();
		this.aadhaarNumber = aadhaarNumber;
		this.pensionAmount = pensionAmount;
		this.bankCharge = bankCharge;
	}
	public ProcessPensionInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public double getPensionAmount() {
		return pensionAmount;
	}
	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}
	public double getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(double bankCharge) {
		this.bankCharge = bankCharge;
	}
	
	

}