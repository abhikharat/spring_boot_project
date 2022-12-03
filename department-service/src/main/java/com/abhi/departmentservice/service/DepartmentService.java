package com.abhi.departmentservice.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.departmentservice.entity.Department;
import com.abhi.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repo;
	
	public Department getDepartmentByID(Integer id) {
		
		return repo.findById(id).orElseThrow(()->new NoSuchElementException("No Department Finde for id "+id));
	}
	
	public Department saveDepartment(Department dept) {
		
		return repo.save(dept);
	}
	
	public List<Department> getAllDepartment(){
		
		return repo.findAll();
	}
	
}
