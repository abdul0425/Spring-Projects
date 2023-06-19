package edu.jspider.entity;

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

import edu.jspider.constant.AppConstant;

@SuppressWarnings("serial")
@Entity
@Table(name = AppConstant.BUS_INFO)
public class Bus implements Serializable {

	@Id
	@GenericGenerator(name = "bus_info", strategy = "increment")
	@GeneratedValue(generator = "bus_info")
	@Column(name = "")
	private int busId;
	@Column(name = "bus_name")
	private String busName;
	@Column(name = "bus_number")
	private String busNumber;
	@Column(name = "bus_route")
	private String busRoute;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Passenger> passengerList;


	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusRoute() {
		return busRoute;
	}

	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", busNumber=" + busNumber + ", busRoute=" + busRoute
				+ ", passengerList=" + passengerList + "]";
	}

}
