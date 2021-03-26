package com.callor.apps.service;

/*
 * 1. 8개의 정수형 배열을 선언하고 2~9까지 정수를 저장
 * 2. 8개의 배열에 저장된 정수에 해당하는 구구단을 출력합니다
 * 
 */

public class TimeServiceV1A2 {

	int nums[];

	public TimeServiceV1A2() {

		nums = new int[8];

	}

	public void makeTimes() {

		for (int i = 0; i < nums.length; i++) {

			int num = i + 2;
			nums[i] = num;
		}
	}

	public void printTimes() {

		for (int i = 0; i < nums.length; i++) {

			
			System.out.println(LinesService.dLines(50));
			System.out.printf("%d 단 구구단\n", nums[i]);
			System.out.println(LinesService.sLines(50));

			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", nums[i], j, nums[i] * j);
			}
		}

	}

}
