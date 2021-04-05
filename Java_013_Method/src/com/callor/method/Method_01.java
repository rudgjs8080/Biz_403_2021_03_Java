package com.callor.method;

import java.util.Random;
import java.util.Scanner;

public class Method_01 {
	/*
	 * Random(난수) 수를 1개 생성하여 3의 배수인가?
	 */
	public static void main(String[] args) {
		
		/*
		 * Random 클래스를 사용하여 rd 객체를 선언하고
		 * Random() 생성자 method를 호출하여
		 * 객체를 생성(초기화) 하는 코드
		 * 
		 * 객체를 선언만 하고 생성(초기화)을 하지 않고
		 * 객체.method()를 호출하면
		 * NullPointerException이 발생한다
		 * 
		 * NullPointerException >> 객체가 아직 실체가 없다
		 * 
		 * 
		 */
		Random rd = null;
		rd = new Random();
		
		/*
		 * Scanner 클래스를 사용하여 scan 객체를 선언하고
		 * Scanner() 생성자 method를 호출하여 
		 * scan 객체를 생성한다
		 * Scanner() 생성자는 객체를 생성할 때
		 * System.in(키보드 입력 장치)를 연결할 수 있도록
		 * 매개변수에 정보를 전달해줘야한다
		 */
		
		Scanner scan = new Scanner(System.in);
		
		Integer intNum = rd.nextInt(100)+1;
		
		/*
		 * String 클래스를 사용하여 str1 객체를 생성한다
		 * String 클래스는 클래스이면서 변수적인 성질을 갖는 특별한 클래스이다
		 * 사용법이 클래스 방식이면서 
		 * 일반적인 변수처럼 사용할 수 있다
		 * wrapper 클래스들도 그러한 성질을 갖는다
		 * 
		 */
		String str1 = new String();// 저장되는 값이 ""
		String str2 = new String("대한민국");// 저장되는 값이 "대한민국"
		String str3 = "우리나라";
		
		/*
		 * int 형 변수와 
		 * Integer wrapper 를 사용하여 만든 변수
		 * 사용하는 기본 방법은 동일하다
		 * Integer는 클래스 적인 특성을 갖고 있다보니
		 * new Integer() 생성자를 사용하여 변수를 만들면 
		 * 다소 엉뚱하게 작동되는 경우가 있다
		 * 지금은 Integer() 생성자를 사용하여 변수를 만들지 못하도록 하고 있다
		 * 
		 * 숫자형 변수는 생성자를 사용하여 변수를
		 * 만들지 않도록 해야한다
		 */
//		Integer int1 = new Integer(); (X)
		
		Integer int1 = 30;
		
		int1 = rd.nextInt(100) + 1;
		
		/*
		 * if 조건문을 사용하여 어떤 조건을 검사했을때
		 * 조건에 완전히 일치하는 경우에는 
		 * ~~하다. ~~다 라고 표현하고
		 * 조건에 일치하지 않는 else를 사용하여
		 * 표현할 때는 딱 맞아 떨어지는 어떤 조건을
		 * 찾기가 어렵기 때문에 
		 * ~~ 가 아니다 라고 표현하는 것이 좋다
		 */
		if(int1  % 3 == 0) {
			System.out.println(int1 + " 은 3의 배수");
		} else {
			System.out.println(int1 + " 은 3의 배수가 아니다");
		}
		
		
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
