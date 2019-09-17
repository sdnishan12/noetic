
package com.noetic.employeemanagement.CrudRepository;

import org.springframework.data.repository.CrudRepository;

import com.noetic.employeemanagement.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, String> {
	Department findBydepId(String depId);

}
