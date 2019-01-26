package com.gaohan.ssm.mapper;

import java.util.List;

import com.gaohan.ssm.beans.Employee;

public interface EmployeeMapper {
	
	public List<Employee> getAllEmps();
	
	public void deleteEmployee(Integer Id);
	
	public void insertEmployee(Employee employee);
}
