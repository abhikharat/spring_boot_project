package com.abhi.userservice.exception;

public class BaseException {

	private String status;
	private String errorMsg;

	public BaseException(String status, String errorMsg) {

		this.status = status;
		this.errorMsg = errorMsg;
	}

	public BaseException() {

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
