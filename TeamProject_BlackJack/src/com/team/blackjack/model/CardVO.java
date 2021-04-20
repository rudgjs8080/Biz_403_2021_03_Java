package com.team.blackjack.model;

public class CardVO {

	private String pattern;  // [스페이드,하트,다이아,클로버]
	private String denomination; // [A12345678910JQK]
	private Integer value; // [12345678910101010]
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getNumber() {
		return denomination;
	}
	public void setNumber(String number) {
		this.denomination = number;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	// 카드의 벨류값은 숨김 : 잘되나 체크하려면 밑에 " " + value +  추가 후 toString 프린트
	@Override
	public String toString() { 
		return "<" + pattern + " " + denomination + ">"; 
	}
}