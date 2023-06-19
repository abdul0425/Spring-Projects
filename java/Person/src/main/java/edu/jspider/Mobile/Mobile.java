package edu.jspider.Mobile;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import edu.jspider.Application.Application;
import edu.jspider.Constant.AppConstant;

@Entity
@Table(name = AppConstant.MOBILE_INFO)
public class Mobile implements Serializable {

	@Id
	@GenericGenerator(name = "mobile", strategy = "increment")
	@GeneratedValue(generator = "mobile")
	@Column(name = "")
	private int id;
	@Column(name = "mobile_name")
	private String mobileName;
	@Column(name = "color")
	private String color;
	@Column(name = "ram")
	private String ram;
	@Column(name = "memory")
	private String memory;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "f_key")
	private List<Application> appList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public List<Application> getAppList() {
		return appList;
	}

	public void setAppList(List<Application> appList) {
		this.appList = appList;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileName=" + mobileName + ", color=" + color + ", ram=" + ram + ", memory="
				+ memory + ", appList=" + appList + "]";
	}

}
