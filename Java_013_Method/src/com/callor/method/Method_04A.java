package com.callor.method;

import java.util.Scanner;

public class Method_04A {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 입력을 받는데 정수 0 ~ 100
		 * 또는 문자열 QUIT
		 * 다른 type의 데이터를 동시에 취급하기 위해서는
		 * 기본 type을 String 형으로 설정하는 것이 편하다
		 */
		System.out.println("0 ~ 100 까지 중 정수 입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.println(">> ");
		
		 
		// 모든 입력을 문자열 type으로 하라
		// 입력 받은 문자열을 strNum에 저장하라
		// int num = scan.nextInt();
		String strNum = scan.nextLine();
		if(strNum.equals("QUIT")) {
			System.out.println("종료합니다");
		}else {
			
			// QUIT가 아닌 다른 값이 입력됐으면
			// 일단 입력된 값을 정수형으로 변환해보자
			
			Integer intNum = Integer.valueOf(strNum);
			
			System.out.println("입력된 정수 : " + intNum);
		}
		
		
		
	}

}
