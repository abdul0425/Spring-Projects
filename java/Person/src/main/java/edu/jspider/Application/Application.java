package edu.jspider.Application;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import edu.jspider.Constant.AppConstant;

@Entity
@Table(name = AppConstant.APP_INFO)
public class Application implements Serializable {

	@Id
	@GenericGenerator(name = "app", strategy = "increment")
	@GeneratedValue(generator = "app")
	@Column(name = "")
	private int id;
	@Column(name = "app_name")
	private String appName;
	@Column(name = "os_type")
	private String osType;
	@Column(name = "version")
	private String version;
	@Column(name = "size")
	private int size;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Application [id=" + id + ", appName=" + appName + ", osType=" + osType + ", version=" + version
				+ ", size=" + size + "]";
	}

}
