package com.callor.apps.service;

import java.util.Random;

/*
 * 1. 정수형 배열 100개를 선언
 * 2. 1~100까지의 난수를 만들어 정수형 배열에 저장
 * 3. 배열에 저장된 수들 중에서 짝수들 리스트를 출력
 * 4. 짝수들의 합을 구하여 출력
 * 5. EvenServiceV1 클래스에 method를 선언하여 코드 작성
 * 6. App_05의 main() 메서드에서 객체생성, method호출 하여 실행
 */
public class EvenServiceV1 {

	int[] intNum;
	int n = 100;

	public EvenServiceV1() {

		intNum = new int[n];

	}

	public void makeNum() {

		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			intNum[i] = rd.nextInt(n) + 1;

		}

	}

	public void printNum() {

		int intSum = 0;
		int intCount = 0;
		for (int j = 0; j < n; j++) {
			if (intNum[j] % 2 == 0) {
				System.out.println((j + 1) + "번째 수 [" + intNum[j] + "]");
				intSum += intNum[j];
				intCount++;
			}

		}
		System.out.println("=================");
		System.out.println("짝수들의 합 : " + intSum);
		System.out.println("총 짝수의 개수 : " + intCount + "개");

	}

}
