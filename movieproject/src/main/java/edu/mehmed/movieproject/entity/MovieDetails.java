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
@Table(name=AppConstant.MOVIE_DETAILS)
public class MovieDetails implements Serializable{

	@Id
	@GenericGenerator(name="m_info",strategy = "increment")
	@GeneratedValue(generator = "m_info")
	@Column(name="movie_id")
	private int movieId;
	@Column(name="movie_name")
	private String movieName;
	@Column(name="actor_name")
	private String actorName;
	@Column(name="actress_name")
	private String actressName;
	@Column(name="release_date")
	private String releaseDate;
	@Column(name="rating")
	private String rating;
	@Column(name="budget")
	private String budget;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActressName() {
		return actressName;
	}
	public void setActressName(String actressName) {
		this.actressName = actressName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "MovieDetails [movieId=" + movieId + ", movieName=" + movieName + ", actorName=" + actorName
				+ ", actressName=" + actressName + ", releaseDate=" + releaseDate + ", rating=" + rating + ", budget="
				+ budget + "]";
	}
	
	
}
