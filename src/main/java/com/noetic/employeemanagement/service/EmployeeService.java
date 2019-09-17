package com.noetic.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noetic.employeemanagement.CrudRepository.EmployeeRepository;
import com.noetic.employeemanagement.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void addEmployee(Employee emp) {

		employeeRepository.save(emp);
	}

	public Employee getEmployee(String id) {

		return employeeRepository.findByEmpId(id);
	}

	public List<Employee> getEmployeeList() {

		List<Employee> empList = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(empList::add);

		return empList;
	}

	public void updateEmployee(Employee emp) {

		employeeRepository.save(emp);
	}

	public void removeEmployee(String id) {

		employeeRepository.deleteById(id);
	}
}
