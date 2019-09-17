package com.noetic.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noetic.employeemanagement.CrudRepository.DepartmentRepository;
import com.noetic.employeemanagement.model.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public void addDepartment(Department department) {
		departmentRepository.save(department);
	}

	public Department getDepartment(String depId) {
		return departmentRepository.findBydepId(depId);
	}

	public List<Department> getDepartmentList() {

		List<Department> depList = new ArrayList<Department>();

		departmentRepository.findAll().forEach(depList::add);

		return depList;
	}

	public void updateDepartment(Department department) {
		departmentRepository.save(department);
	}

	public void removeDepartment(String depId) {
		departmentRepository.deleteById(depId);
	}

}
