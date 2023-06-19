package edu.jspider.MobileEntity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.jspider.ApplicationEntity.Application;
import edu.jspider.Constant.AppConstant;

@Entity
@Table(name=AppConstant.mobile_info)
public class Mobile implements Serializable{

	@Id
	@GenericGenerator(name="mobile_info",strategy = "increment")
	@GeneratedValue(generator = "mobile_info")
	@Column(name="")
	private int mobileId;
	@Column(name="mobile_name")
	private String mobileName;
	@Column(name="ram")
	private String ram;
	@Column(name="rom")
	private String rom;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Application> appList;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public List<Application> getAppList() {
		return appList;
	}
	public void setAppList(List<Application> appList) {
		this.appList = appList;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", ram=" + ram + ", rom=" + rom
				+ ", appList=" + appList + "]";
	}
	
}
