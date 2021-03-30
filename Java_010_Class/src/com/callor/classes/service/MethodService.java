package com.callor.classes.service;

public class MethodService {

	
	
	
	
	// 변수는 같은 { } 구역내에서는 같은 이름으로 중복 선언할 수 없다
	
	
	// method는 같은 클래스의 { } 구역내에서는 
	// 같은 이름으로 원칙적으로 중복 선언할 수 없다
	// 예외 상황 1
	// method에 매개변수 존재의 유무 차이
	// 매개변수의 개수 차이
	// 매개변수의 type의 차이
	public void method(int num) {
		System.out.println("여기는 1번 method");
	}
	
	public void method(int num, int num1) {
		System.out.println("여기는 2번 method");
	}
	
	public void method() {
		System.out.println("여기는 3번 method");
	}
	/*
	 * method 코드를 작성할때 매개변수를 선언하면 
	 * 이 method를 호출할때 반드시 매개변수에 해당하는 
	 * 값을 전달해야 한다
	 * 서언된 매개변수의 개수, type이 일치하도록
	 * 값을 전달해야만 한다
	 * 그렇지 않으면 method를 호출한 곳에 오류가 발생
	 * 객체.method(30, 30.0f);
	 * 
	 */
	
	public void method(int num, float num1) {
		System.out.println("여기는 4번 method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
