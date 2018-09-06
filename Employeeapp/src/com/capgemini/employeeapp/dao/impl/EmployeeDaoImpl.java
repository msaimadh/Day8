package com.capgemini.employeeapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.employeeapp.dao.EmployeeDao;
import com.capgemini.employeeapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private List<Employee> employees = new ArrayList<>();
	
	@Override
	public List<Employee> findAllEmployees(){
		return null;
	}
@Override
public boolean findEmployeeById(int employeeId) {
	return false;
}
@Override
public boolean deleteemployee(int employeeId) {
	for(Employee employee : employees) {
		if(employee.getEmployeeId()==employeeId) {
			employees.remove(employee);
		}
	}
	return true;
	
}
@Override
public boolean addemployee(Employee employee) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public Employee updateEmployee(Employee employee) {
	// TODO Auto-generated method stub
	return null;
}
}
