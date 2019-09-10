package com.spring.boot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.EmployeeModel;
import com.spring.boot.service.EmployeeService;
@RestController
@RequestMapping("/api")
public class RestEmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public List<EmployeeModel> getAllEmployee(){
		return service.getAllEmployee();
		
	}
	
	@GetMapping("/employees/{empId}")
	public EmployeeModel getOne(@PathVariable("empId") int empId) {
		return service.getEmployee(empId);
	}
	
	@PostMapping("/employees")
	public EmployeeModel saveEmployee(@RequestBody EmployeeModel employeeModel) throws Exception {
	return service.save(employeeModel);
	}

	@DeleteMapping("/employees/{empId}")
	public boolean  deleteEmp(@PathVariable("empId") int empId)
	{
	return service.delete(empId);
	}
	@PutMapping("/employees/{empId}")
	public EmployeeModel upEmployee(@RequestBody EmployeeModel employeeModel) throws Exception {

	return service.updateemp(employeeModel);
	}
	}
