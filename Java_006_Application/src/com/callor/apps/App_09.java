package com.callor.apps;

import java.util.Random;

public class App_09 {

	public static void main(String[] args) {

		String[] strNames = {"홍길동", "이몽룡", "성춘향", "장영실","이순신"};
		
		int[] intNum = new int[strNames.length];
		int[] intKor = new int[strNames.length];
		int[] intEng = new int[strNames.length];
		int[] intMath = new int[strNames.length];
		
		int[] intTotal = new int[strNames.length];
		float[] floatAvg = new float[strNames.length];
		
		Random rd = new Random();
		
		for(int i = 0 ; i < strNames.length ; i++) {

			intNum[i] = i + 1;
			intKor[i] = rd.nextInt(51) + 50;
			intEng[i] = rd.nextInt(51) + 50;
			intMath[i] = rd.nextInt(51) + 50;
			
		}
		for(int i = 0 ; i < strNames.length ; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float)intTotal[i] / 3;
			
		}
		System.out.println("빛나라 고교 성적처리");
		System.out.println("===============================");
		System.out.println("학번 이름 국어 영어 수학");
		System.out.println("-------------------------------");
		for(int i = 0 ; i < strNames.length ; i++) {
			System.out.printf("%3d\t",intNum[i]);
			System.out.printf("%s\t",strNames[i]);
			
			System.out.printf("%3d\t",intKor[i]);
			System.out.printf("%3d\t",intEng[i]);
			System.out.printf("%3d\t",intMath[i]);
			
			System.out.printf("%5d\t",intTotal[i]);
			System.out.printf("%3.2f\t\n",floatAvg[i]);
			
		}
		
		
		
		
	}

}
