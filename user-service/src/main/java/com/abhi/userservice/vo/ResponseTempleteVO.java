package com.abhi.userservice.vo;

import com.abhi.userservice.entity.Department;
import com.abhi.userservice.entity.Users;
import com.abhi.userservice.exception.BaseException;


public class ResponseTempleteVO extends BaseException {
	
	private Users user;
	private Department department;
	
	
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
