package com.capgemini.employeeapp.dao;
import java.util.List;

import com.capgemini.employeeapp.model.Employee;


public interface EmployeeDao {
	public List<Employee> findAllEmployees();
	public boolean findEmployeeById(int employeeId);
	public boolean deleteemployee(int employeeId);
	public boolean addemployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	

}
