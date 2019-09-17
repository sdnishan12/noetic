package com.noetic.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.noetic.employeemanagement.model.Employee;
import com.noetic.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@RequestMapping(method = RequestMethod.POST, value = "/employee")
	public void addEmployee(@RequestBody Employee addEmployee) {
		empService.addEmployee(addEmployee);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employee")
	public Employee getEmployee(@RequestParam String id) {
		System.out.println(id);
		return empService.getEmployee(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/allEmployee")
	public List<Employee> getEmployeeList() {
		return empService.getEmployeeList();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employee")
	public void updateEmployee(@RequestBody Employee addEmployee) {
		empService.updateEmployee(addEmployee);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employee")
	public void removeEmployee(@RequestParam String id) {
		empService.removeEmployee(id);
	}
}
