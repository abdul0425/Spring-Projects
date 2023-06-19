package edu.jspider.SpringBasics.JavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Music {

	@Value("Telugu")
	private String language;
	@Value("Marchela")
	private String movieName;
	@Autowired
	private TeluguSong song;
	
	public Music()
	{
		System.out.println("Playlist Created !.");
	}
	
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public TeluguSong getSong() {
		return song;
	}
	public void setSong(TeluguSong song) {
		this.song = song;
	}
	@Override
	public String toString() {
		return "Music [language=" + language + ", movieName=" + movieName + ", song=" + song + "]";
	}
	
	
}
