package com.gaohan.ssm.beans;

import java.util.List;

public class Department {
	
	public Integer id;
	
	public String departmentName;

	private List<Employee> emps;

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", emps=" + emps + "]";
	}

	

	
	
}
