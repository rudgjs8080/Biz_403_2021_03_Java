package com.callor.classes.model;
/*
 * 1. 매입매출 관리 프로젝트를 시작하려고 합니다
 * 2. 매입매출 프로젝트에서 사용할 VO 클래스를 설계합니다
 * 3. 매일 : 회사에서 판매를 목적으로 물품을 구입하는 것
 * 4. 매출 : 회사에서 상품을 고객에게 판매하는 것
 * 5. 매입매출 관리를 하기 위해
 * "상품이름", "거래처", "매입매출구분", "수량", "매입단가", "매출단가" 데이터가 필요합니다
 * 6. 수량, 매입단가, 매출단가를 곱센연산이 필요한 데이터입니다
 * 7. 적절한 데이터 type을 선정하여 클래스를 만듭니다
 * 
 * 날짜형 데이터형식은 따로 있다 but 많은 이슈를 가지고 있다
 * 
 */
public class IolistVO {
	
	// 객체지향 이론(특징)에서 정보의 은닉하기 (private를 사용하는 것)
	
	private String name;
	private String com;
	private String sellNBuy;
	private Integer value;
	private Integer buyCost;
	private Integer sellCost;
	private String date;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getSellNBuy() {
		return sellNBuy;
	}
	public void setSellNBuy(String sellNBuy) {
		this.sellNBuy = sellNBuy;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getBuyCost() {
		return buyCost;
	}
	public void setBuyCost(Integer butCost) {
		this.buyCost = butCost;
	}
	public Integer getSellCost() {
		return sellCost;
	}
	public void setSellCost(Integer sellCost) {
		this.sellCost = sellCost;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
