package edu.mehmed.userlocation.dto;

import java.io.Serializable;

public class StateDto implements Serializable{

	private String name;
	private String capital;
	private String population;
	private String area;
	private String language;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "StateDto [name=" + name + ", capital=" + capital + ", population=" + population + ", area=" + area
				+ ", language=" + language + "]";
	}
	
	
}
