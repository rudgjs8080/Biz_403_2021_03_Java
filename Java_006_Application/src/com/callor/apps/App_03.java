package com.callor.apps;

import java.util.Random;

/*
 * 1. 정수형 배열 20개를 선언합니다
 * 2. Random 클래스를 사용하여 1~100까지 난수를 생성하여 배열에 저장합니다
 * 3. 배열에 저장된 정수 중 짝수들이 몇번 위치(첨자)에 저장되어 있는지 리스트를 출력합니다
 * 
 * 요소 : 배열의 몇번째 값인지
 * 위치 : 배열의 몇번째인지
 */
public class App_03 {

	public static void main(String[] args) {

		int n = 20;
		int[] intNum = new int[n];
		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			intNum[i] = rd.nextInt(100) + 1;
			if (intNum[i] % 2 == 0) {
				System.out.printf("%3d번째 값은 짝수 %3d 입니다\n", i + 1, intNum[i]);
			}
		}

	}

}
