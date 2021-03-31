package com.callor.classes;

public class String_01 {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 30;
		boolean bYes = num1 == num2;
		
		String str1 = "대한민국";
		String str2 = "우리나라";
		
		bYes = str1 == str2;
		str2 = "대한민국";
		
		bYes = str1 == str2;
		if(str1 == str2) {
			System.out.println("맞아!");
		}
		
		str1 = "우리나라";
		str2 = new String("우리나라");
		/*
		 * 위의 개념을 잘 이해해야한다 
		 */
		
		System.out.println(str1);
		System.out.println(str2);
		
		/*
		 * 문자열 변수에 담긴 문자열이 같은가를 확인할 때
		 * 동등연산자(==)를 사용해서는 안된다
		 * 문자열 변수는 변수에 문자열을 저장하는 방법에 따라 다른 특성을 갖게된다
		 * 문자열의 독특한 특성 때문에 문자열에 저장된 값이 같은지 확인이 안되는 경우가 있다
		 * 
		 * 문자열 변수에 저자오딘 값이 같은가 비교를 할 때는
		 *  문자열.equals("비교대상") method를 사용해야 한다
		 */
		
		bYes = str1 == str2;
		System.out.println(bYes); // false
	
		/*
		 * 영문 문자열이 다른 경우 다른 데이터로 인식한다
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		int num3 = 3;
	
		Integer num4 = new Integer(3);
		System.out.println(num3);
		System.out.println(num4);
		bYes = num3 == num4;
		System.out.println(bYes);
		
		
		
		
		
		
		
		
		
		

	}

}
