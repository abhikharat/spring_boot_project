package com.abhi.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.userservice.entity.Users;


public interface UserRepository extends JpaRepository<Users, Long>{

	

}
