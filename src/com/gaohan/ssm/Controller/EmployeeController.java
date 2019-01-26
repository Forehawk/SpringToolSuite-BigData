package com.gaohan.ssm.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gaohan.ssm.DepartmentService.DepartmentService;
import com.gaohan.ssm.UserService.EmployeeService;
import com.gaohan.ssm.beans.Department;
import com.gaohan.ssm.beans.Employee;
import com.gaohan.ssm.mapper.DepartmentMapper;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentservice;
	/*
	 * 显示所有员工信息
	 */
	@RequestMapping(value = "/emps",method=RequestMethod.GET)
	public String ListAllEmps(Map<String,Object> map){
		List<Employee> emps = employeeService.getAllEmps();
		map.put("emps", emps);
		return "list";
	}
	
	@RequestMapping(value = "/emp/{id}",method=RequestMethod.GET)
	public String deleteEmployee(@PathVariable (value = "id") Integer id){
		employeeService.deleteEmployeeById(id);
		System.out.println("132123123123412");
		return "redirect:/emps";
	}

	@RequestMapping(value = "/edit/{emp.id}")
	public String EditEmployee(Map<String, Object> map){
		map.put("department", departmentservice.selectAllDept());
		map.put("employee",   new Employee());
		return "input";
	}
	
	@RequestMapping(value="/save/{emp.id}")
	public String SaveEmployee(Employee employee,Map<String, Object> map){
		employeeService.insertEmployee(employee);
		return "redirect:/emps";
	}
}
