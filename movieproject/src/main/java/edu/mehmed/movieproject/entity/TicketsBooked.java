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
@Table(name=AppConstant.TICKETS_BOOKED)
public class TicketsBooked implements Serializable{

	@Id
	@GenericGenerator(name="tb_info",strategy = "increment")
	@GeneratedValue(generator = "tb_info")
	@Column(name="tickets_booked_id")
	private int theatreId;
	@Column(name="movie_id")
	private int movieId;
	private String showTime;
	@Column(name="created_date")
	private String createdDate;
	@Column(name="status")
	private String status;
	@Column(name="total_price")
	private double totalPrice;
	@Column(name="no_of_tickets")
	private int noOfTickets;
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	@Override
	public String toString() {
		return "TicketsBooked [theatreId=" + theatreId + ", movieId=" + movieId + ", showTime=" + showTime
				+ ", createdDate=" + createdDate + ", status=" + status + ", totalPrice=" + totalPrice
				+ ", noOfTickets=" + noOfTickets + "]";
	}
	
	
}
