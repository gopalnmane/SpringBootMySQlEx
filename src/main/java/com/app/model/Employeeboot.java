package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employeeboot {
	@Id
	private int empId;
	private String empName;
	
	public Employeeboot() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employeeboot(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	

}
