package com.tcs.ProcessPensionModule.service;

import org.springframework.stereotype.Service;

import com.tcs.ProcessPensionModule.model.PensionDetail;
import com.tcs.ProcessPensionModule.model.PensionerDetail;
import com.tcs.ProcessPensionModule.model.PensionerInput;
import com.tcs.ProcessPensionModule.model.ProcessPensionResponse;

@Service
public class ProcessPensionService {

	
	

	// calculating pension detail and saving to database

	public PensionerDetail getPensionerDetail(PensionDetail pensionDetail, PensionerInput pensionerInput) {
		
		double pensionAmount = 0;

		ProcessPensionResponse processPensionResponse = new ProcessPensionResponse();

		if (pensionDetail.getPensionType().equalsIgnoreCase("self")) {
			pensionAmount = (0.8 * pensionDetail.getSalary() + pensionDetail.getAllowance());
		} else if (pensionDetail.getPensionType().equalsIgnoreCase("family")) {
			pensionAmount = (0.5 * pensionDetail.getSalary() + pensionDetail.getAllowance());
		}

		if (pensionDetail.getBankType().equalsIgnoreCase("private")) {
			pensionAmount = pensionAmount - 550;

			processPensionResponse.setProcessPensionStatusCode(10);

		} else if (pensionDetail.getBankType().equalsIgnoreCase("public")) {
			pensionAmount = pensionAmount - 500;
			processPensionResponse.setProcessPensionStatusCode(10);

		}

		PensionerDetail pensionerDetail = new PensionerDetail(pensionDetail.getName(), pensionDetail.getDateOfBirth(),
				pensionDetail.getPanNumber(), pensionDetail.getPensionType(), pensionAmount);

		
		return pensionerDetail;

	}

	public PensionDetail savePensionDetail(PensionDetail pensionDetail) {
		
		
		return null;

	}

}
