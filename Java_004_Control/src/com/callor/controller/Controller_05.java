package com.callor.controller;

public class Controller_05 {

	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 4;
		
		boolean bYes = num1 % 3 == 0 && num2++ % 5 == 0;
		System.out.println(bYes);
		
		bYes = num1 > 4 && ++num2 > 5;
		System.out.println(num2); // num2 => 5
		/*
		 * && 관계연산자에서 앞에 나오는 식이 false 이면 뒤의 식은 아예 실행되지 않는다
		 * 그렇기 때문에 num2 는 5가 되는 것이다
		 */
		
		bYes = num1 < 4 || ++num2 > 5;
		System.out.println(num2); // num2 => 5
		/*
		 * || 관계연산자 또한 마찬가지로 앞에 나오는 식이 true 이면 무조건 값은 true 값을
		 * 출력하기 때문에 뒤의 식은 연산하지 않는다
		 * 그렇기 때문에 num2는 그대로 5를 유지하게 된다
		 */
		
		/*
		 * 선행되는 코드에서 결과가 뚜렷하여
		 * 이후 코드가 실행될 필요가 없으면
		 * 코드 실행을 멈추는 기능
		 * 
		 * 이러한 기능때문에 가끔 ++ 연산, +=(*=,-+...) 연산에서
		 * 원하는 결과가 이후에 반영이 안되는 경우가 있기 때문에
		 * 사용하는데 상당히 주의를 기울여야한다
		 */
		
		
		
		
		
		
		
		
		
		
		
	}

}
