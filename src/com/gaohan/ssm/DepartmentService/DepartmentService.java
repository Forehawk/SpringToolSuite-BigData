package com.gaohan.ssm.DepartmentService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gaohan.ssm.beans.Department;

@Service
public interface DepartmentService {
	
	public List<Department> selectAllDept();
}
