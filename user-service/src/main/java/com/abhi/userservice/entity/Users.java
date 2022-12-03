package com.abhi.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String userName;
	private String address;
	private String emailID;
	private Integer deptID;
	
	public Users() {
		
	}
	
	
	public Users(Long id, String userName, String address, String emailID,Integer deptID) {
		
		this.id = id;
		this.userName = userName;
		this.address = address;
		this.emailID = emailID;
		this.deptID=deptID;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	public Integer getDeptID() {
		return deptID;
	}


	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}
	
	
	
	
	

}
