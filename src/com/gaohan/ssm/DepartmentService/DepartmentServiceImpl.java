package com.gaohan.ssm.DepartmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gaohan.ssm.beans.Department;
import com.gaohan.ssm.mapper.DepartmentMapper;

public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@Override
	public List<Department> selectAllDept() {
		List<Department> depts = departmentMapper.getAllDepts();
		return depts;
	}
	
}
