package com.callor.apps;

import java.util.Random;

/*
 * 1. 정수형 배열 intScores를 n개 선언(생성)
 * 2. Random 클래스를 사용하여 50~100까지 정수를 만들어
 * 3. intScores 각 배열에 저장
 * 4. intScores 배열에 저장된 점수를 이용하여
 * 5. 전체총점, 평균을 계산한 후 출력 (평균은 소수점 2째자리)
 */
public class App_03 {

	public static void main(String[] args) {
		int n = 10;
		int[] intScores = new int[n];
		Random rd = new Random();
		int intSum = 0;
		float floatAvg = 0;
		for (int i = 0; i < n; i++) {
			intScores[i] = rd.nextInt(51) + 50;
			System.out.printf("[%d]번 학생 점수 : %d점\n", i + 1, intScores[i]);
			intSum += intScores[i];
		}
		floatAvg = (float) intSum / n;
		System.out.println("=======================");
		System.out.printf("총점 : %3d 평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("=======================");
	}

}
