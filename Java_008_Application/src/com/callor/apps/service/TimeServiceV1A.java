package com.callor.apps.service;

/*
 * 1. 8개의 정수형 배열을 선언하고 2~9까지 정수를 저장
 * 2. 8개의 배열에 저장된 정수에 해당하는 구구단을 출력합니다
 * 
 */

public class TimeServiceV1A {

	// int[] nums;
	int nums[];

	public TimeServiceV1A() {

		nums = new int[8];

	}

	/*
	 * 배열은 총 8개 배열에 저장할 값은 2~??
	 */
	public void makeTimes() {

		for (int i = 0; i < nums.length; i++) {

			int num = i + 2;
			nums[i] = num;
		}
	}

	/*
	 * 배열에 담긴 값(2~??) = 단에 해당
	 */
	public void printTimes() {

		for (int i = 0; i < nums.length; i++) {

			// method에 return ?? 명령문이 있으면
			// 변수 = method() 형식으로 코드를 작성하고
			// method가 return 해준 결과값을
			// 변수에 저장할 수 있다
			String dLines = LinesService.dLines(50);
			String sLines = LinesService.sLines(50);

			System.out.println(dLines);
			System.out.printf("%d 단 구구단\n", nums[i]);
			System.out.println(sLines);

			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", nums[i], j, nums[i] * j);
			}
		}

	}

}
