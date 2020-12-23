package com.jpaH2demo.jpaH2demo.employees;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/Employees")
    public List<Employee> getAllEmployees() {
	return employeeservice.getAllEmployees();
	}
	
	@GetMapping("/Employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable String id){
		return employeeservice.getEmployee(id);
	}
		
		@PostMapping("/Employees")
		public void addEmployee(@RequestBody Employee Employee)
		{
			
			employeeservice.addEmployee(Employee);
		}
		
		@PutMapping("/Employees/{id}")
		public void updateEmployee(@RequestBody Employee Employee,@PathVariable String id)
		{
			
			employeeservice.updateEmployee(id,Employee);
		}
		
		@DeleteMapping("/Employees/{id}")
		public void deleteEmployee(@PathVariable String id) {
	     employeeservice.deleteEmployee(id);
		}
		
		
		
	}

	
	


