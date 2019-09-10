package com.spring.boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.model.EmployeeModel;


	@Repository
	public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer>{

		
		
	}


