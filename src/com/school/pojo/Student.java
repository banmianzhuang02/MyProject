package com.school.pojo;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private String college;
	private String classl;
	private Date date;
	private String isContact;
	private String isWuhan;
	private String isHubei;
	private String isYiSi;
	private String isQueZhen;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String college, String classl, Date date, String isContact, String isWuhan,
			String isHubei, String isYiSi, String isQueZhen) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.classl = classl;
		this.date = date;
		this.isContact = isContact;
		this.isWuhan = isWuhan;
		this.isHubei = isHubei;
		this.isYiSi = isYiSi;
		this.isQueZhen = isQueZhen;
	}
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getClassl() {
		return classl;
	}
	public void setClassl(String classl) {
		this.classl = classl;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getIsContact() {
		return isContact;
	}
	public void setIsContact(String isContact) {
		this.isContact = isContact;
	}
	public String getIsWuhan() {
		return isWuhan;
	}
	public void setIsWuhan(String isWuhan) {
		this.isWuhan = isWuhan;
	}
	public String getIsHubei() {
		return isHubei;
	}
	public void setIsHubei(String isHubei) {
		this.isHubei = isHubei;
	}
	public String getIsYiSi() {
		return isYiSi;
	}
	public void setIsYiSi(String isYiSi) {
		this.isYiSi = isYiSi;
	}
	public String getIsQueZhen() {
		return isQueZhen;
	}
	public void setIsQueZhen(String isQueZhen) {
		this.isQueZhen = isQueZhen;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classl == null) ? 0 : classl.hashCode());
		result = prime * result + ((college == null) ? 0 : college.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((isContact == null) ? 0 : isContact.hashCode());
		result = prime * result + ((isHubei == null) ? 0 : isHubei.hashCode());
		result = prime * result + ((isQueZhen == null) ? 0 : isQueZhen.hashCode());
		result = prime * result + ((isWuhan == null) ? 0 : isWuhan.hashCode());
		result = prime * result + ((isYiSi == null) ? 0 : isYiSi.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (classl == null) {
			if (other.classl != null)
				return false;
		} else if (!classl.equals(other.classl))
			return false;
		if (college == null) {
			if (other.college != null)
				return false;
		} else if (!college.equals(other.college))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (isContact == null) {
			if (other.isContact != null)
				return false;
		} else if (!isContact.equals(other.isContact))
			return false;
		if (isHubei == null) {
			if (other.isHubei != null)
				return false;
		} else if (!isHubei.equals(other.isHubei))
			return false;
		if (isQueZhen == null) {
			if (other.isQueZhen != null)
				return false;
		} else if (!isQueZhen.equals(other.isQueZhen))
			return false;
		if (isWuhan == null) {
			if (other.isWuhan != null)
				return false;
		} else if (!isWuhan.equals(other.isWuhan))
			return false;
		if (isYiSi == null) {
			if (other.isYiSi != null)
				return false;
		} else if (!isYiSi.equals(other.isYiSi))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", classl=" + classl + ", date=" + date
				+ ", isContact=" + isContact + ", isWuhan=" + isWuhan + ", isHubei=" + isHubei + ", isYiSi=" + isYiSi
				+ ", isQueZhen=" + isQueZhen + "]";
	}
	
}
