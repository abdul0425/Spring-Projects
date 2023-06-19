package edu.mehmed.userlocation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.mehmed.userlocation.constant.AppConstant;

@Entity
@Table(name=AppConstant.STATE_INFO)
public class StateEntity implements Serializable{

	@Id
	@GenericGenerator(name="s_info",strategy = "increment")
	@GeneratedValue(generator = "s_info")
	@Column(name="")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="capital")
	private String capital;
	@Column(name="population")
	private String population;
	@Column(name="area")
	private String area;
	@Column(name="language")
	private String language;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		return "StateEntity [id=" + id + ", name=" + name + ", capital=" + capital + ", population=" + population
				+ ", area=" + area + ", language=" + language + "]";
	}
	
	
	
}
