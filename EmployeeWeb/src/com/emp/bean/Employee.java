package com.emp.bean;

public class Employee {
	private String empId;
	private String firstName;
	private String lastName;
	public Employee(){}
	public Employee(String empId) {
		// TODO Auto-generated constructor stub
		this.empId=empId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
