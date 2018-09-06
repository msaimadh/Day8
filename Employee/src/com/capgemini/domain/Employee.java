package com.capgemini.domain;

public class Employee {
	private String employeeId;
	private String employeeName;
	private Double employeeSalary;
	private String department;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String employeeId, String employeeName, Double employeeSalary, String department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
