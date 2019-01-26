package com.gaohan.ssm.UserService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gaohan.ssm.beans.Department;
import com.gaohan.ssm.beans.Employee;

@Service
public interface EmployeeService {
	
	public List<Employee> getAllEmps();
	
	public void deleteEmployeeById(Integer Id);
	
	public void insertEmployee(Employee employee);
}
