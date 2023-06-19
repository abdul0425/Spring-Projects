package edu.jspider.Zomato;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.jspider.Constant.AppConstant;
import edu.jspider.Customer.Customer;

@Entity
@Table(name = AppConstant.ZOMATO_DETAILS)
public class Zomato implements Serializable {

	@Id
	@GenericGenerator(name = "zomato_id", strategy = "increment")
	@GeneratedValue(generator = "zomato_id")
	@Column(name = "")
	private int branchId;
	@Column(name = "branch_name")
	private String branchName;
	@Column(name = "manager")
	private String manager;
	@Column(name = "address")
	private String address;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "zomatoList")
	private List<Customer> customerList;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	@Override
	public String toString() {
		return "Zomato [branchId=" + branchId + ", branchName=" + branchName + ", manager=" + manager + ", address="
				+ address + ", customerList=" + customerList + "]";
	}

}
