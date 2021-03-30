package com.callor.classes;

public class Value_04 {
	
	public static void main(String[] args) {
		System.out.println(3/0);
		Integer result = divid(30,40);
		
	}
	
	private static Integer divid(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			return null;
		} else {
			return num1 / num2;	
		}
	}
	/*
	 * 0과 0을 나눗셈연산을 수행하면 문제가 발생한다
	 * divid() method에 2개의 정수를 매개변수로 전달하고
	 * 전달한 숫자가 0이 아니면 나눗셈 연산을 하여 return
	 * 전달한 숫자가 한 개라도 0이면 나눗셈 연산을 수행하지 않고
	 * null 값을 return 한다 
	 */
		
	
	
}
