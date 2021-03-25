package com.callor.apps.service;

import java.util.Random;

/*
 * 1. 10명 학생의 국어, 영어, 수학 점수를 배열에 저장하고
 * 2. 학생들의 총점, 평균을 계산하여
 * 3. 성적리스트를 출력합니다
 * 4. ScoreServiceV1 에 method를 구현하고
 * 5. App_08 클래스의 main() method에서 호출하여 구현합니다
 */

public class ScoreServiceV1 {
	
	int n = 10;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intSum;
	float[] floatAvg;
	int intKorSum;
	int intEngSum;
	int intMathSum;
	

	public ScoreServiceV1() {

		intKor = new int[n];
		intEng = new int[n];
		intMath = new int[n];
		intSum = new int[n];
		floatAvg = new float[n];
		intKorSum = 0;
		intEngSum = 0;
		intMathSum = 0;

	}

	public void makeScore() {
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			intKor[i] = rd.nextInt(51) + 50;
			intEng[i] = rd.nextInt(51) + 50;
			intMath[i] = rd.nextInt(51) + 50;
			intKorSum += intKor[i];
			intEngSum += intEng[i];
			intMathSum += intMath[i];
		}

	}

	public void sumScore() {

		for (int i = 0; i < n; i++) {
			intSum[i] = intKor[i] + intEng[i] + intMath[i];
		}

	}

	public void avgScore() {

		for (int i = 0; i < n; i++) {
			floatAvg[i] = (intKor[i] + intEng[i] + intMath[i]) / 3f;
		}

	}

	public void printScore() {
		System.out.println("=========================================================");
		System.out.println("학생 번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=========================================================");
		for (int i = 0; i < n; i++) {
			System.out.printf("%2d번 학생\t %d\t%d\t%d\t%d\t%.2f\n", i + 1, intKor[i], 
					intEng[i], intMath[i], intSum[i],floatAvg[i]);
		}
		System.out.println("=========================================================");
		System.out.printf("%d\t%d\t%d\t",intKorSum,intEngSum,intMathSum);
		
		
		
	}	
	
	

}







