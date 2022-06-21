package com.pension.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PensionerDetails {
	
	@Id
	private String AdhaarNumber;						
	private String PensionerName;								
	private String dateOfBirth;							
	private String PanNumber;							
	private double Salary;								
	private double Allowance;						
	private String PensionType;							
	
	public PensionerDetails(String adhaarNumber, String pensionerName, String dateOfBirth, String panNumber,
			double salary, double allowance, String pensionType) {
		super();
		this.AdhaarNumber = adhaarNumber;
		PensionerName = pensionerName;
		this.dateOfBirth = dateOfBirth;
		PanNumber = panNumber;
		Salary = salary;
		Allowance = allowance;
		PensionType = pensionType;
	}
	public PensionerDetails() {
		super();
	}
	public String getAdhaarNumber() {
		return AdhaarNumber;
	}
	public void setAadhaarNumber(String adhaarNumber) {
		this.AdhaarNumber = adhaarNumber;
	}
	public String getPensionerName() {
		return PensionerName;
	}
	public void setPensionerName(String pensionerName) {
		PensionerName = pensionerName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPanNumber() {
		return PanNumber;
	}
	public void setPanNumber(String panNumber) {
		PanNumber = panNumber;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public double getAllowance() {
		return Allowance;
	}
	public void setAllowance(double allowance) {
		Allowance = allowance;
	}
	public String getPensionType() {
		return PensionType;
	}
	public void setPensionType(String pensionType) {
		PensionType = pensionType;
	}
	
	

}
