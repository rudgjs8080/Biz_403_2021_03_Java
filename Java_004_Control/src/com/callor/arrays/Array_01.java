package com.callor.arrays;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {
		Random rd = new Random();

		// 정수값 10개를 저장할 변수를 선언하라 [] 사용
		// 정수형 "배열" 10개를 선언하라는 의미
		int[] intKors = new int[100];

		for (int i = 0; i < 100; i++) {
			// intKors[0] = rd.nextInt(100) + 1;
			// :
			// intKors[99] = rd.nextInt(100) + 1;
			intKors[i] = rd.nextInt(100) + 1;
		}
		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			// intSum += intKors[0]
			// :
			// intSum += intKors{99]
			intSum += intKors[i];
		}
		for (int i = 0; i < 100; i++) {
			System.out.printf("학생 %d : %d\n", i + 1, intKors[1]);
		}
	}

}
