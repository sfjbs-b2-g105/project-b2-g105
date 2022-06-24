package com.tcs.ProcessPensionDetails.controler;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.ProcessPensionDetails.model.PensionerDetail;
import com.tcs.ProcessPensionDetails.service.PensionarDetailServiceImpl;

@RestController
@RequestMapping("/details")
public class PensionerDetailsController {
	
	@Autowired
	PensionarDetailServiceImpl pensionarDetailServiceImpl;

	
	
	@GetMapping("/pensionerDetail/{aadhaarNumber}")
	public PensionerDetail findByAadhaarNumber(@PathVariable String aadhaarNumber) throws NumberFormatException, IOException {
		
		return pensionarDetailServiceImpl.findPensionByAadhar(aadhaarNumber);

		
			
	}

	/*
	 * // all pensioner details
	 * 
	 * @GetMapping("/allDetails") public List<PensionerDetail> getAllDetail() {
	 * List<PensionerDetail> demo = null; return demo;
	 * 
	 * }
	 */
}