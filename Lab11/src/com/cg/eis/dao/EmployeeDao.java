package com.cg.eis.dao;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface EmployeeDao {
	public String addEmployee(Employee e);
	public String insuranceScheme(double salary, String designation);
	public List<Employee> AllEmployee();
	

}
