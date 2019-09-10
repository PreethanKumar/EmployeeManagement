package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.Repository.EmployeeRepository;
import com.spring.boot.model.EmployeeModel;

@Service
public class EmployeeService {
	
	
@Autowired
EmployeeRepository rep;


public EmployeeModel save(EmployeeModel employeeModel) {
return rep.save(employeeModel);

}
public EmployeeModel getEmployee(int empId) {
	return rep.getOne(empId);
}
public void deleteEmployee(int empId) {
 rep.deleteById(empId);
 
}


public List<EmployeeModel> getAllEmployee(){
	return rep.findAll();
}
public boolean delete(int empId) {
	// TODO Auto-generated method stub
	rep.deleteById(empId);
	return true;
}
public EmployeeModel update( EmployeeModel employeeModel,int Id)
{

EmployeeModel emp1=rep.getOne(employeeModel.getId());
emp1.setId(Id);
emp1.setDate(employeeModel.getDate());
emp1.setName(employeeModel.getName());
emp1.setSalary(employeeModel.getSalary());
return rep.save(emp1);

}
public EmployeeModel updateemp(EmployeeModel employeeModel) {
	// TODO Auto-generated method stub
	EmployeeModel emp1=rep.getOne(employeeModel.getId());
	emp1.setId(employeeModel.getId());
	emp1.setDate(employeeModel.getDate());
	emp1.setName(employeeModel.getName());
	emp1.setSalary(employeeModel.getSalary());
	return rep.save(emp1);
	}
}
