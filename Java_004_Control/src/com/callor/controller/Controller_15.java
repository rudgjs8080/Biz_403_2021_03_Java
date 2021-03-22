package com.callor.controller;

import java.util.Random;

/*
 * 학생 10명의 국어 점수를 저장할 변수 선언
 * 
 * 1~ 100 까지의 범위의 임의 점수를 생성하여 변수에 저장
 * 
 * 총점과 평균을 계산하여 출력합니다
 */
public class Controller_15 {

	public static void main(String[] args) {

		Random rd = new Random();
		
		int stu1 = rd.nextInt(100)+1;
		int stu2 = rd.nextInt(100)+1;
		int stu3 = rd.nextInt(100)+1;
		int stu4 = rd.nextInt(100)+1;
		int stu5 = rd.nextInt(100)+1;
		int stu6 = rd.nextInt(100)+1;
		int stu7 = rd.nextInt(100)+1;
		int stu8 = rd.nextInt(100)+1;
		int stu9 = rd.nextInt(100)+1;
		int stu10 = rd.nextInt(100)+1;
		int intSum = stu1 + stu2 + stu3 + stu4 + stu5 + stu6 + stu7 + stu8 + stu9 + stu10;
		float floatAvg = (float) intSum/10f;
		
		System.out.println("=====================");
		System.out.println("학생1 : " + stu1);
		System.out.println("학생2 : " + stu2);
		System.out.println("학생3 : " + stu3);
		System.out.println("학생4 : " + stu4);
		System.out.println("학생5 : " + stu5);
		System.out.println("학생6 : " + stu6);
		System.out.println("학생7 : " + stu7);
		System.out.println("학생8 : " + stu8);
		System.out.println("학생9 : " + stu9);
		System.out.println("학생10 : " + stu10);
		System.out.println("---------------------");
		System.out.printf("총점 : %3d 평균 : %.2f\n",intSum,floatAvg);
		System.out.println("=====================");
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
