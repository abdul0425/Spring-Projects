package edu.jspider.Department;

import java.io.Serializable;
import java.util.List;

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
import edu.jspider.Employee.Employee;

@Entity
@Table(name = AppConstant.DEPT_INFO)
public class Department implements Serializable {

	@Id
	@GenericGenerator(name = "dept", strategy = "increment")
	@GeneratedValue(generator = "dept")
	@Column(name = "")
	private int deptId;
	@Column(name = "dept_name")
	private String deptName;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}
