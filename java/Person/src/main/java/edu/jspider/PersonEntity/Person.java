package edu.jspider.PersonEntity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.jspider.AadharEntity.Aadhar;
import edu.jspider.Constant.AppConstant;

@Entity
@Table(name=AppConstant.PERSON_INFO)
public class Person implements Serializable{

	@Id
	@GenericGenerator(name="p_Key", strategy = "increament")
	@GeneratedValue(generator = "p_key")
	@Column(name="")
	private int id;
	@Column(name="person_name")
	private String personName;
	@Column(name="contact_number")
	private Long contactNumber;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="f_key")
	private Aadhar aadhar;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + ", contactNumber=" + contactNumber + ", age=" + age
				+ ", gender=" + gender + ", aadhar=" + aadhar + "]";
	}
	
}
