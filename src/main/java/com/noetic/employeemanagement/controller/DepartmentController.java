package com.noetic.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.noetic.employeemanagement.model.Department;
import com.noetic.employeemanagement.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@RequestMapping(method = RequestMethod.POST, value = "/department")
	public void addDepartment(@RequestBody Department department) {
		departmentService.addDepartment(department);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/department")
	public Department getDepartment(@RequestParam String depId) {
		return departmentService.getDepartment(depId);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/allDepartment")
	public List<Department> getDepartmentList() {
		return departmentService.getDepartmentList();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/department")
	public void updateDepartment(@RequestBody Department department) {
		departmentService.updateDepartment(department);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/department")
	public void removeDepartment(@RequestParam String depId) {
		departmentService.removeDepartment(depId);
	}

}
