package com.hiberspring.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hiberspring.model.Employee;



@Repository
public class EmployeeRepository {

	@Autowired
	SessionFactory sf;
	
	@Transactional
	public boolean saveEmployee(Employee emp) {
		
		Session ssn= sf.openSession();
		//Transaction Tx= ssn.beginTransaction();
		ssn.save(emp);
		return true;
		}
	@Transactional
	public Employee getEmployee(int empId){
		
		Session ssn=sf.openSession();
		
		return ssn.get(Employee.class, empId);
		
			
		}
public List<Employee> getAllEmployee(){
		
		Session ssn=sf.openSession();
		Criteria ctr=ssn.createCriteria(Employee.class);
		return (ctr.list());
		
			
		}
}
