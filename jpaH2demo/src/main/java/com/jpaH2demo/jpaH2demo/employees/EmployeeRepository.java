package com.jpaH2demo.jpaH2demo.employees;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,String> {
	

}
