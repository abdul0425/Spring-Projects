package edu.jspider.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

import edu.jspider.constant.AppConstant;

@SuppressWarnings("serial")
@Entity
@Table(name=AppConstant.PASSENGER_INFO)
public class Passenger implements Serializable{

	@Id
	@GenericGenerator(name="passenger_info",strategy = "increment")
	@GeneratedValue(generator = "passenger_info")
	@Column(name="")
	private int passengerId;
	@Column(name="passenger_name")
	private String passengerName;
	@Column(name="contact_number")
	private String contactNumber;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Bus> busList;
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public List<Bus> getBusList() {
		return busList;
	}
	public void setBusList(List<Bus> busList) {
		this.busList = busList;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", contactNumber="
				+ contactNumber + ", busList=" + busList + "]";
	}
	
	
	
	
	
	
	
}
