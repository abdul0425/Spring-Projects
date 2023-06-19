package edu.mehmed.movieproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.mehmed.movieproject.constant.AppConstant;

@Entity
@Table(name=AppConstant.THEATRE_INFO)
public class TheatreInfo implements Serializable{

	@Id
	@GenericGenerator(name="t_info",strategy = "increment")
	@GeneratedValue(generator = "t_info")
	@Column(name="theatre_id")
	private int theatreId;
	@Column(name="theatre_name")
	private String theatreName;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="address")
	private String address;
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "TheatreInfo [theatreId=" + theatreId + ", theatreName=" + theatreName + ", city=" + city + ", state="
				+ state + ", address=" + address + "]";
	}
	
	
}
