package com.spring.boot.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.boot.model.EmployeeModel;
import com.spring.boot.service.EmployeeService;
@Controller
public class EmployeeController {

	@Autowired 
	EmployeeService service;
	
	@PostMapping("/AddEmployee")
	public String addemp(@ModelAttribute EmployeeModel employeeModel, Model m) {
	
		EmployeeModel add=service.save(employeeModel);	
		
		m.addAttribute("Employee",add);
		
		return "AddEmployee";
		
	}
	
	@PostMapping("/GetEmployee")
	public String getemp(@RequestParam("empId") int empId , Model m) {
	
		EmployeeModel get=service.getEmployee(empId);	
		
		m.addAttribute("emp",get);
		
		return "GetEmployee";
		

	}
	@PostMapping("/delete")
	public String deleteemp(@RequestParam("empId") int empId , Model m) {
	
		service.deleteEmployee(empId);	
		
		m.addAttribute("emp","success");
		
		return "DeleteEmployee";
		
	}

	
	
	@GetMapping("/AllEmployee")
	public String getAllEmp(Model m) {
	
		List<EmployeeModel> empList=service.getAllEmployee();
		m.addAttribute("AllEmployee", empList);
		return "AllEmployees";
		
	}
	@PostMapping("/update")
	public String update(@RequestParam("id") int Id,Model m)
	{
	EmployeeModel employeeModel=service.getEmployee(Id);
	if(employeeModel!=null)
	{
	m.addAttribute("empid",Id);
	    return "UpdateEmployee";
	}
	else
	return "failure";

	}


	@GetMapping("/UpdateEmployee")
	public String updateemp(@ModelAttribute("emp")EmployeeModel employeeModel,@RequestParam("name")String name,@RequestParam("salary")String salary,@RequestParam("Id")int Id,@RequestParam("date")@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate date,Model m)
	{
	employeeModel.setId(Id);
	employeeModel.setName(name);
	employeeModel.setSalary(salary);
	employeeModel.setDate(date);
	service.update(employeeModel, Id);
	return "Success";

	}

	
	
	
	
	
	
}
