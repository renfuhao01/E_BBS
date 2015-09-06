package com.ebbs.bean;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = -4415990281535582814L;
	private Integer id;
	private String stuName;
	private String stuSex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	   return "User [id=" + id + ", stuName=" + stuName + ", stuSex=" + stuSex + "]";
	}
	


	

}
