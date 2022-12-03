package com.abhi.departmentservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.departmentservice.entity.Department;
import com.abhi.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	private static Logger LOG=LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService service;
	
	
	@GetMapping("/{id}")
	public Department getDepartmentByID(@PathVariable Integer id) {
		
		LOG.info("You are in getDepartmentByID  Method");
		return service.getDepartmentByID(id);
	}
	
	@GetMapping("/")
	public List<Department> getAllDepartment() {
		LOG.info("You are in getAllDepartment  Method");
		return service.getAllDepartment();
	}
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department dept) {
		LOG.info("You are in saveDepartment  Method");
		return service.saveDepartment(dept);
	}
	
	
	

}
