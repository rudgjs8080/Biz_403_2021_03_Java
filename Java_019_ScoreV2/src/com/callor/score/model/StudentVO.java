package com.callor.score.model;

public class StudentVO {
	private String num;
	private String name;
	private String grade;
	private String dept;
	private String address;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentVO [num=" + num + ", name=" + name + ", grade=" + grade + ", dept=" + dept + ", address="
				+ address + "]";
	}
	
	
	
	
}
