package com.jpaH2demo.jpaH2demo.employees;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private String id;
	private String name;
	private String designation;
	private String email;
	private double salary;
	
	
	public Employee() {
		super();
	}
	public Employee(String id, String name, String designation, String email, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.email = email;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
	
	
}
