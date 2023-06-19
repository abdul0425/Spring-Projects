package com.jspider.PersonEntity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.jspider.AadharEntity.Aadhar;
import com.jspider.Constant.AppConstant;

@Entity
@Table(name = AppConstant.PERSON_INFO)
public class Person implements Serializable {

	@Id
	@GenericGenerator(name = "primary_key", strategy = "increament")
	@GeneratedValue(generator = "primary_key")
	//@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String personName;
	@Column(name = "age")
	private int personAge;
	@Column(name = "contact_number")
	private Long contactNumber;
	@Column(name = "gender")
	private String personGender;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "foreign_key")
	private Aadhar aadhar;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPersonGender() {
		return personGender;
	}

	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", contactNumber=" + contactNumber
				+ ", personGender=" + personGender + "]";
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

}
