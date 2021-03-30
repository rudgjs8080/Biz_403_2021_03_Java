package com.callor.classes.model;

public class AddressVO {

	private String name;
	private String addr;
	private String tel;
	private Integer age;
	
	public void setAge(Integer age) {
		if(age > 1 && age < 120) {
			this.age = age;
		} else {
			this.age = null;
		}
		
	}
	
	public Integer getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// private 으로 선언된 변수를 외부에서 읽을수 있도록
	// 일부 제한적으로 개방하기
	public String getName() {
		return this.name;
	}
	public String getAddr() {
		return this.addr;
		
	}
	public String getTel() {
		return this.tel;
	}
	
	
	
	
	
	
	
	
	
	
}
