package com.abhi.userservice.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abhi.userservice.entity.Department;
import com.abhi.userservice.entity.Users;
import com.abhi.userservice.repository.UserRepository;
import com.abhi.userservice.vo.ResponseTempleteVO;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	@Autowired
	private RestTemplate restTemplate;

	public Users getUserById(Long id) {

		return repo.findById(id).orElseThrow(()->new NoSuchElementException("NO CUSTOMER PRESENT WITH ID = " + id));
	}

	public Users saveUser(Users user) {

		return repo.save(user);
	}

	public List<Users> getAllUseres() {

		return repo.findAll();
	}

	public ResponseTempleteVO getUserWithDepartment(Long userID) {

		ResponseTempleteVO vo = new ResponseTempleteVO();

		Users user = repo.findById(userID).orElse(null);

		if (user == null) {
			
			   vo.setErrorMsg("NO CUSTOMER PRESENT WITH ID = " + userID);
			   vo.setStatus("Failure");
				
		} else {

			System.out.println("UserId " + user.getId());

			Department department = restTemplate
					.getForObject("http://DEPARTMENT-SERVICE/department/" + user.getDeptID(), Department.class);

			vo.setUser(user);
			vo.setDepartment(department);
		}

		return vo;
	}

}
