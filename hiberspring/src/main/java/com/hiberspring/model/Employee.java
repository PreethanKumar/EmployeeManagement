package com.hiberspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class Employee {



@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int empId;
String empName;
int age;
public Employee(String empName, int age) {
	super();
	this.empName = empName;
	this.age = age;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + "]";
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


	
	
}
