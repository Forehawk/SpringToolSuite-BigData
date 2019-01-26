package com.gaohan.ssm.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaohan.ssm.beans.Department;
import com.gaohan.ssm.beans.Employee;
import com.gaohan.ssm.mapper.EmployeeMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	@Override
	public List<Employee> getAllEmps() {
		List<Employee> employees = employeeMapper.getAllEmps();
		return employees;
	}
	@Override
	public void deleteEmployeeById(Integer Id) {
		employeeMapper.deleteEmployee(Id);	
	}
	@Override
	public void insertEmployee(Employee employee) {
		employeeMapper.insertEmployee(employee);
	}

	
}
