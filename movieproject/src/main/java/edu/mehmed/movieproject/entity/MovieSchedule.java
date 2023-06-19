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
@Table(name=AppConstant.MOVIE_SCHEDULE)
public class MovieSchedule implements Serializable{

	@Id
	@GenericGenerator(name="ts_info",strategy = "increment")
	@GeneratedValue(generator = "ts_info")
	@Column(name="schedule_id")
	private int scheduleId;
	@Column(name="theatre_id")
	private int theatreId;
	@Column(name="movie_id")
	private int movieId;
	@Column(name="show_timings")
	private String showTimings;
	@Column(name="total_tickets")
	private int totalTickets;
	@Column(name="price")
	private double price;
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
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
	public String getShowTimings() {
		return showTimings;
	}
	public void setShowTimings(String showTimings) {
		this.showTimings = showTimings;
	}
	public int getTotalTickets() {
		return totalTickets;
	}
	public void setTotalTickets(int totalTickets) {
		this.totalTickets = totalTickets;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MovieSchedule [scheduleId=" + scheduleId + ", theatreId=" + theatreId + ", movieId=" + movieId
				+ ", showTimings=" + showTimings + ", totalTickets=" + totalTickets + ", price=" + price + "]";
	}
	
	
}
