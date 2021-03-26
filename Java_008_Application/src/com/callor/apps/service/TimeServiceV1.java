package com.callor.apps.service;

/*
 * 1. 8개의 정수형 배열을 선언하고 2~9까지 정수를 저장
 * 2. 8개의 배열에 저장된 정수에 해당하는 구구단을 출력합니다
 * 
 */

public class TimeServiceV1 {
	int[] intTime;
	int[] intNum;
	int num = 2;
	int num1 = 0;

	public TimeServiceV1() {

		intTime = new int[8];
		intNum = new int[8];
	}

	public void makeNum() {

		for (int i = 0; i < intTime.length; i++) {
			intTime[i]++;
			for (int j = 0; j < intTime.length; j++) {
				intNum[j]++;

			}
		}
	}

	public void printTime() {

	}

}
