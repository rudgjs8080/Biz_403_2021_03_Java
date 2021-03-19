package com.callor.controller;

public class Score_01 {
	public static void main(String[] args) {
		
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		intKor = 80;
		intEng = 77;
		intMath = 65;
//		int intSum = intKor + intEng + intMath;
		
		int intSum = 0;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		int intAvg = intSum/3;
		
		String bigBar = "==================";
		String smallBar = "------------------";
				
		System.out.println(bigBar);
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println(smallBar);
		System.out.printf("총점 : %3d 평균 : %3d\n",intSum,intAvg);
		System.out.println(bigBar);
		
		/*
		 * printf() 사용하여 출력할 때
		 * %d : 정수(십진수)
		 * %f : 실수(float)
		 * 		%3.2f : 소수점이하 2째자리까지 표시
		 * %s : 문자열
		 * 
		 * \n : Enter를 누른것 처럼 줄바꿈을 실행
		 * \t : Tab 키를 누른것 처럼 사이띄기를 일정하게 맞춘다
		 * 
		 */
		
		
		
		
		
		
		
		
	}
}
