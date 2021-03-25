package com.callor.apps;

import java.util.Random;

/*
 * 1. 정수형 배열 20개를 선언합니다
 * 2. Random 클래스를 사용하여 50~100까지 난수를 생성하여 배열에 저장합니다
 * 3. 배열에 저장된 정수 중 Prime(소수)인 수들의 리스트를 출력합니다
 */
public class App_01A2 {

	public static void main(String[] args) {

		Random rd = new Random();
		int[] intNum = new int[20];

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rd.nextInt(51) + 50;
		}

		for (int arr = 0; arr < intNum.length; arr++) {
			int num = 0;
			int numP = intNum[arr];

			for (num = 2; num < intNum[arr]; num++) {
				if (numP % num == 0) {
					break;
				}

			}
			if (num < numP) {
				System.out.println(numP + " 는 소수가 아님");
			} else {
				System.out.println(numP + "는 소수");
			}
		}
	}

}
