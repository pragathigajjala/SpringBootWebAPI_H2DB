package com.jpaH2demo.jpaH2demo.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepo;
	
public List<Employee> getAllEmployees()
{
	List<Employee> employees=new ArrayList<>();
	employeerepo.findAll().forEach(employees::add);
	return employees;
}

public Optional<Employee> getEmployee(String id) {                //Why Optional
	return employeerepo.findById(id);

}

public void addEmployee(Employee employee) {
employeerepo.save(employee);
}

public void updateEmployee(String id, Employee employee) {
	employeerepo.save(employee);
}
public void deleteEmployee(String id) {
	
employeerepo.deleteById(id);

}

}