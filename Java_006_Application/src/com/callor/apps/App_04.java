package com.callor.apps;

/*
 * 배열에 저장된 값중에서 짝수가 저장된
 * 최초의 위치는 어디인가
 */
import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
		int n = 20;
		int[] intNum = new int[n];
		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			intNum[i] = rd.nextInt(100) + 1;
			if (intNum[i] % 2 == 0) {
				System.out.printf("최초의 짝수 값은 %d번째의 %d 입니다\n", i + 1, intNum[i]);
				break;
			}
		}

	}

}
