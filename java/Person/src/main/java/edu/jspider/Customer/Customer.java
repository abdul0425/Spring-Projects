package edu.jspider.Customer;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.jspider.Constant.AppConstant;
import edu.jspider.Zomato.Zomato;

@Entity
@Table(name=AppConstant.CUSTOMER_DETAILS)
public class Customer implements Serializable{

	@Id
	@GenericGenerator(name="customer_id",strategy = "increment")
	@GeneratedValue(generator = "customer_id")
	@Column(name="")
	private int customerId;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="contact_number")
	private String contactNumber;
	@Column(name="address")
	private String address;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="f_key")
	private List<Zomato> zomatoList;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Zomato> getZomatoList() {
		return zomatoList;
	}
	public void setZomatoList(List<Zomato> zomatoList) {
		this.zomatoList = zomatoList;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", address=" + address + ", zomatoList=" + zomatoList + "]";
	}
	
}
