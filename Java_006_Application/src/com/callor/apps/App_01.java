package com.callor.apps;

import java.util.Random;

/*
 * 1. 정수형 배열 20개를 선언합니다
 * 2. Random 클래스를 사용하여 1~100까지 난수를 생성하여 배열에 저장합니다
 * 3. 배열에 저장된 정수 중 짝수들의 리스트를 출력하고 짝수들의 합을 계산하여 출력합니다
 * 
 * {} 내에 있는 코드는 최소화 하자
 * 작은 일들로 분해하기
 * 나누어서 정복하라 : Divide and Conquer
 * 
 */
public class App_01 {

	public static void main(String[] args) {
		int[] intNum = new int[20];
		Random rd = new Random();
		int intSum = 0;
		System.out.println("===================");
		System.out.println("난수 중 짝수의 값들");

		for (int i = 0; i < 20; i++) {
			intNum[i] = rd.nextInt(100) + 1;
			if (intNum[i] % 2 == 0) {
				System.out.println(intNum[i]);
				intSum += intNum[i];
			}
		}
		System.out.println("===================");
		System.out.println("짝수값의 합 : " + intSum);

		int[] intNum2 = new int[20];
		int intSum2 = 0;
		System.out.println("=================");
		System.out.println("난수 중 홀수의 값들");

		int n = 0;
		while (n < 20) {
			intNum2[n] = rd.nextInt(100) + 1;
			if (intNum2[n] % 2 == 1) {
				System.out.println(intNum2[n]);
				intSum2 += intNum2[n];
			}
			++n;
		}
		System.out.println("=================");
		System.out.println("홀수값의 합 : " + intSum2);

		System.out.println("===================");
		System.out.println("난수 중 짝수의 값들");
		int[] intNum3 = new int[20];
		int intSum3 = 0;

		for (int i = 0; i < 20; i++) {
			intNum3[i] = rd.nextInt(100) + 1;
		}
		for (int i = 0; i < 20; i++) {
			if (intNum3[i] % 2 == 0) {
				System.out.println(intNum3[i]);
			}
		}
		for (int i = 0; i < 20; i++) {
			if (intNum3[i] % 2 == 0) {
				intSum3 += intNum3[i];
			}

		}
		System.out.println("===================");
		System.out.println("짝수값의 합 : " + intSum3);
	}

}
