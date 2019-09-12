package com.hiberspring.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiberspring.model.Employee;
import com.hiberspring.repository.EmployeeRepository;


@Service

public class EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	
	public boolean saveEmployee(Employee emp){
	
		
		return repo.saveEmployee(emp);
		
	}
public Employee getEmployee(int empId){
			
	return repo.getEmployee(empId);
		
	}
	

public List<Employee> getAllEmployee(){
	return repo.getAllEmployee();
}
}
