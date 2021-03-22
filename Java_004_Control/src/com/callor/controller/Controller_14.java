package com.callor.controller;

import java.util.Random;

/*
 * 1~100까지의 범위의 랜덤 수로
 * 국어, 영어, 수학 과목의 점수를 생성합니다
 * 
 * 각 과목의 점수를 변수에 저장하고
 * 
 * 총점과 평균을 계산하여 출력합니다.
 */
public class Controller_14 {

	public static void main(String[] args) {

		Random rd = new Random();
		int Kor = rd.nextInt(100)+1;
		int Eng = rd.nextInt(100)+1;
		int Math = rd.nextInt(100)+1;
		int intSum = 0;
		intSum = Kor;
		intSum += Eng;
		intSum += Math;
		float floatAvg = (float)intSum /3;
		
		System.out.println("=====================");
		System.out.println("국어 : " + Kor);
		System.out.println("영어 : " + Eng);
		System.out.println("수학 : " + Math);
		System.out.println("---------------------");
		System.out.printf("총점 : %d  평균 : %.2f%n",intSum,floatAvg);
		System.out.println("=====================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
