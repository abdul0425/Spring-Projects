package edu.jspider.AadharEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.jspider.Constant.AppConstant;

@Entity
@Table(name=AppConstant.AADHAR_INFO)
public class Aadhar implements Serializable{

	@Id
	@GenericGenerator(name="p_Key", strategy = "increament")
	@GeneratedValue(generator = "p_key")
	@Column(name="")
	private int id;
	@Column(name="aadhar_number")
	private String aadharNumber;
	@Column(name="city")
	private String city;
	@Column(name="country")
	private String country;
	@Column(name="pincode")
	private String pinCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", aadharNumber=" + aadharNumber + ", city=" + city + ", country=" + country
				+ ", pinCode=" + pinCode + "]";
	}
	
}
