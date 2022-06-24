package com.tcs.ProcessPensionModule.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tcs.ProcessPensionModule.model.PensionDetail;
import com.tcs.ProcessPensionModule.model.PensionerDetail;
import com.tcs.ProcessPensionModule.model.PensionerInput;
import com.tcs.ProcessPensionModule.service.ProcessPensionService;

@RestController
@RequestMapping("/process")
public class ProcessPensionController {

	@Autowired
	private ProcessPensionService processPensionService;
	
	@Autowired
	private RestTemplate restTemplate;
	

	
	@RequestMapping(value = "/pensionerInput", method = RequestMethod.POST)
	public PensionerDetail getPensionerDetail(@RequestBody PensionerInput pensionerInput) throws Exception {

		PensionDetail pensionDetail = null;
		
		String adhar = pensionerInput.getAadhaarNumber();
		System.out.println("aadhar no"+adhar);
		try {
			pensionDetail = this.restTemplate.getForObject("http://PROCESSPENSIONDETAILS/details/pensionerDetail/" + adhar, PensionDetail.class);
			
			
		} catch (Exception e) {
			e.printStackTrace();

			throw new Exception("Pensioner Detail not coreect");
		}
		// return processPensionService.savePensionDetail(pensionDetail);
		return processPensionService.getPensionerDetail(pensionDetail, pensionerInput);

	}

}
