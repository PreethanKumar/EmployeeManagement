package com.hiberspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hiberspring.model.Employee;
import com.hiberspring.service.EmployeeService;

@Controller
public class EmployeeController {
    
	@Autowired 
	EmployeeService employeeService;
	
	
	@PostMapping("/add")
	public String addEmployee(@ModelAttribute Employee emp,Model m) {
		String msg="fail";
		if(employeeService.saveEmployee(emp))
			msg="success";
		m.addAttribute("msg", msg);
		return "view.jsp";
		
		
	}
@GetMapping("/employee")
public String getEmployee(@RequestParam("empId")int empId,Model m)
{
	Employee emp=employeeService.getEmployee(empId);
	m.addAttribute("emp",emp);
	return "viewmp.jsp";
	
	
}

@GetMapping("/allemployee")
public String getEmployee(Model m)
{
	List<Employee> emplist=employeeService.getAllEmployee();
	m.addAttribute("emplist",emplist);
	return "viewAll.jsp";

}

}

