package edu.mehmed.employeerecords.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.mehmed.employeerecords.constant.AppConstant;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	@Id
	@Column(name = "employee_id")
	private Long employeeId;
	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "employee_salary")
	private Double employeeSalary;
	@Column(name = "address")
	private String address;

	public Employee(Long employeeId, String employeeName, Double employeeSalary, String address) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", address=" + address + "]";
	}

}
