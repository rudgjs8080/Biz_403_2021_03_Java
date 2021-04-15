package com.team.blackjack.model;

public class CardVO {

	private String pattern;  // [스페이드,하트,다이아,클로버]
	private String number; // [A12345678910JQK]
	private Integer value; // [12345678910101010]
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "<" + pattern + " " + number + ">";
	}
}