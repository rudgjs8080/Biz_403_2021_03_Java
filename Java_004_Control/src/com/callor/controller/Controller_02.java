package com.callor.controller;

public class Controller_02 {

	public static void main(String[] args) {
		
		/*
		 * boolean type
		 * True, False 2가지 경우의 값을 갖는 특별한 형태
		 * 대입연산자(=) 오른쪽의 연산을 수행한다
		 * 3 == 3 ( == : 동등연산자, 일치연산자 )
		 * 결과를 bYes 변수에 담아라
		 * 
		 * 동등연산자 : 두 값이 같은지 물어보는 것
		 * 결과는 true 또는 false 가 된다.
		 */
		boolean bYes = 3 == 3; //오른쪽 먼저 연산 true
		
		bYes = 15 % 3 == 0; // true
		
		int intNum = 15;
		System.out.println(intNum % 3 == 0); // true
		System.out.println(intNum % 5 == 0); // true
		System.out.println(intNum % 6 == 0); // true
		System.out.println(intNum % 3 == 0 && intNum % 5 == 0); 
		// 3의 배수이면서 5의 배수
		System.out.println(intNum % 3 == 0 || intNum % 5 == 0);
		// 3의 배수이거나 5의 배수 => 둘 중 하나만 true 면 결과는 true 이다
		
		/*
		 * 관계연산자
		 * 2가지 이상의 비교연산(==, <, >, <=, >=, !=)
		 * 동시에 수행하기 위한 연산 ( &&, ||)
		 * 
		 */
		bYes = true && true; // true
		bYes = true && false; // false
		bYes = false && true; // false
		bYes = false && false; // false
		
		bYes = true || true; // true
		bYes = true || false; // true
		bYes = false || true; // true
		bYes = false || false; // false
		
		
	}
}
