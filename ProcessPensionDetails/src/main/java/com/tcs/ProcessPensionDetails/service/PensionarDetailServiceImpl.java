package com.tcs.ProcessPensionDetails.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.tcs.ProcessPensionDetails.model.PensionerDetail;
@Service
public class PensionarDetailServiceImpl {

	
	public PensionerDetail findPensionByAadhar(String AadharNo) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("src/main/resources/details.csv"));
		String line = "";
		PensionerDetail pensionerDetail = new PensionerDetail();
		while ((line = br.readLine()) != null) {
			String[] data = line.split(",");
			if(AadharNo.equalsIgnoreCase(data[0]))
			{
				
				pensionerDetail.setAadhaarNumber(data[0]);
				pensionerDetail.setName(data[1]);
				pensionerDetail.setDateOfBirth(data[2]);
				pensionerDetail.setPanNumber(data[3]);
				pensionerDetail.setSalary(Double.parseDouble(data[4]));
				pensionerDetail.setAllowance(Double.parseDouble(data[5]));
				pensionerDetail.setPensionType(data[6]);
				pensionerDetail.setBankName(data[7]);
				pensionerDetail.setAccountNumber(data[8]);
				pensionerDetail.setBankType(data[9]);
			}
	}
		return pensionerDetail;
	}
}