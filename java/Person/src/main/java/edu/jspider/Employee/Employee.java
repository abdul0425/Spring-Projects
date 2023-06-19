package edu.jspider.Employee;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.jspider.Constant.AppConstant;
import edu.jspider.Department.Department;

@Entity
@Table(name=AppConstant.EMP_INFO)
public class Employee implements Serializable{

	
	@Id
	@GenericGenerator(name="emp",strategy = "increment")
	@GeneratedValue(generator = "emp")
	@Column(name="")
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="contact_number")
	private String contactNumber;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="f_key")
	private Department dept;
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}
	
	
}
