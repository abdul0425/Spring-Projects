package com.jspider.AadharEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.jspider.Constant.AppConstant;

@Entity
@Table(name = AppConstant.AADHAR_INFO)
public class Aadhar implements Serializable {

	@Id
	@GenericGenerator(name = "primary_key", strategy = "increament")
	@GeneratedValue(generator = "primary_key")
	@Column(name="id")
	private int id;
	@Column(name = "aadhar_number")
	private String aadharNumber;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;
	@Column(name = "pincode")
	private String pincode;

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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Aadhar [aadharNumber=" + aadharNumber + ", city=" + city + ", country=" + country + ", pincode="
				+ pincode + "]";
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

}
