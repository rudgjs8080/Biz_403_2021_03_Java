package com.callor.apps.service;

import java.util.Random;

public class PrimeServiceV2 {

	int[] intNum;

	public PrimeServiceV2() {

		intNum = new int[20];

	}

	public void makeNum() {

		Random rd = new Random();
		for (int i = 0; i < intNum.length; i++) {

			intNum[i] = rd.nextInt(51) + 50;

		}

	}

	public void printPrime() {
		
		for(int num : intNum) {
			
			int index = 0;
			for(index = 2; index < num ; index++) {
				if(num % index == 0) {
					break;
				}
			}
			// 중간에 break를 만났다
			// index == num 로 할 수 있지만 >= 로 하는게 오류를 막을 수 있다
			if(index >= num) {
				System.out.println(num+" 는 소수");
			} 
		}
	}

}














