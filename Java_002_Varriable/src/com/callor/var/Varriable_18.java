package com.callor.var;

public class Varriable_18 {

	public static void main(String[] args) {

		
		// 3과목의 점수를 각각 변수에 저장
		int intKor = 90;
		int intEng = 88;
		int intMath = 77;
		
		int intSum = 0;
		intSum = intKor;
		intSum += intEng;// 국어 + 영어
		intSum += intMath; // 국어 + 영어+ 수학
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + intSum/3);

	}

}
