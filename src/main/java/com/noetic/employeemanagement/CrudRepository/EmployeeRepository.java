package com.noetic.employeemanagement.CrudRepository;


import org.springframework.data.repository.CrudRepository;

import com.noetic.employeemanagement.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	public Employee findByEmpId(String empId);
	
	public Employee findByFirstName(String name);
}
