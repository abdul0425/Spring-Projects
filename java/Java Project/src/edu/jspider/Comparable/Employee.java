package edu.jspider.Comparable;

public class Employee implements Comparable<Employee>{

	private String empName;
	private int empId;
	private double empSalary;
	public Employee(String empName, int empId, double empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public int compareTo(Employee o) {
		
		return empName.compareTo(o.empName);
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
	}
	
	
}
