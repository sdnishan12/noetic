package com.noetic.employeemanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	private String depId;
	private String departmentName;

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", departmentName=" + departmentName + "]";
	}

}
