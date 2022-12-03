package com.abhi.departmentservice.exception;

public class ErrorBaseModel {

	private String status;
	private String errorMsg;
	
	
	
	public ErrorBaseModel() {
		
	}
	public ErrorBaseModel(String status, String errorMsg) {
		
		this.status = status;
		this.errorMsg = errorMsg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
}
