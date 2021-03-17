package com.callor.values.var;

public class Varriable_02 {
	public static void main(String[] args) {
		// int == Integer == 정수
		/*
		 * 변수의 선언
		 * 변수는 사용(저장, 읽기) 하기 전에 
		 * 반드시 선언을 해야 한다.
		 * 선언키워드 변수명; ex) int numbers;
		 * 어떤 기억장소에 값을 저장할 수 있도록
		 * 예약하는 절차
		 */
		int num1 = 100;
		int num2 = 200;
		/*
		 * 이미 선언된 변수이름은 같은 이름으로
		 * 또 다시 선언할 수 없다
		 */
		int numbers;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		
	}
}
