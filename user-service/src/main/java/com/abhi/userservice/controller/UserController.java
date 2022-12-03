package com.abhi.userservice.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.userservice.entity.Users;
import com.abhi.userservice.service.UserService;
import com.abhi.userservice.vo.ResponseTempleteVO;




@RestController
@RequestMapping("/users")
public class UserController {
	
	private static Logger LOG=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@GetMapping("/{id}")
	public Users getUserById(@PathVariable Long id) {
		
		LOG.info("in getUserById method");
		
		return userService.getUserById(id);
	}
	
	@GetMapping("/")
	public List<Users> getAllUser() {
		
		LOG.info("in getAllUser method");
		
		return userService.getAllUseres();
	}
	
	
	@PostMapping("/")
	public Users saveUser(@RequestBody Users user) {
		
		LOG.info("in saveUser method");
		
		return userService.saveUser(user);
	}
	
	@GetMapping("/userdept/{id}")
	public ResponseTempleteVO getUserWithDepartment(@PathVariable Long id) {
		LOG.info("in getUserWithDepartment method");
		return userService.getUserWithDepartment(id);
	}
	

}
