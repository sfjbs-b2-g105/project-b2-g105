package com.tcs.ProcessPensionModule.model;

public class ProcessPensionResponse {
	private int processPensionStatusCode;

	public ProcessPensionResponse(int processPensionStatusCode) {
		super();
		this.processPensionStatusCode = processPensionStatusCode;
	}

	public ProcessPensionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProcessPensionStatusCode() {
		return processPensionStatusCode;
	}

	public void setProcessPensionStatusCode(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}
	
	

}