package com.callor.controller;

public class Controller_03 {

	public static void main(String[] args) {

		int intNum1 = 30;
		int intNum2 = 40;
		
		// 20 < intNum1 < 50 => 이렇게 표현이 안된다 꼭 관계연산자를 포함해서 만들어야한다
		boolean bYes = intNum1 > 20 && intNum1 < 50;
		System.out.println(bYes);
		
		bYes = intNum1 > 20 || intNum1 > 50;
		System.out.println(bYes);
		
		
		
		
		
	}

}
