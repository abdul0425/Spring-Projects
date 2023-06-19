package edu.jspider.ApplicationEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.jspider.Constant.AppConstant;

@Entity
@Table(name=AppConstant.application_info)
public class Application implements Serializable{

	@Id
	@GenericGenerator(name="app_info",strategy = "increment")
	@GeneratedValue(generator = "app_info")
	@Column(name="")
	private int appId;
	@Column(name="app_name")
	private String appName;
	@Column(name="app_size")
	private String appSize;
	@Column(name="os")
	private String os;
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppSize() {
		return appSize;
	}
	public void setAppSize(String appSize) {
		this.appSize = appSize;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	@Override
	public String toString() {
		return "Application [appId=" + appId + ", appName=" + appName + ", appSize=" + appSize + ", os=" + os + "]";
	}
	
}
