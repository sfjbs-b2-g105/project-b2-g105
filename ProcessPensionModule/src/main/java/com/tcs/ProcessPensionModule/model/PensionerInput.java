package com.tcs.ProcessPensionModule.model;

public class PensionerInput {

	private String name;
	private String dateOfBirth;
	private String panNumber;
	private String aadhaarNumber;
	private String pensionType;
	public PensionerInput(String name, String dateOfBirth, String panNumber, String aadhaarNumber, String pensionType) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.panNumber = panNumber;
		this.aadhaarNumber = aadhaarNumber;
		this.pensionType = pensionType;
	}
	public PensionerInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}

}
