package com.spring.boot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class EmployeeModel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int Id;
String name;
@DateTimeFormat(pattern="yyyy-MM-dd")
LocalDate date;
String salary;


public int getId() {
	return Id;
}


public void setId(int id) {
	Id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public LocalDate getDate() {
	return date;
}


public void setDate(LocalDate date) {
	this.date = date;
}


public String getSalary() {
	return salary;
}


public void setSalary(String salary) {
	this.salary = salary;
}


public EmployeeModel(String name, LocalDate date, String salary) {
	super();
	this.name = name;
	this.date = date;
	this.salary = salary;
}


@Override
public String toString() {
	return "EmployeeModel [Id=" + Id + ", name=" + name + ", date=" + date + ", salary=" + salary + "]";
}


public EmployeeModel() {
	// TODO Auto-generated constructor stub
}
}
