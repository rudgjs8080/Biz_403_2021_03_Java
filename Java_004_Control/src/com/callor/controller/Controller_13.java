package com.callor.controller;

import java.util.Random;

/*
 * 1~100까지 범위의 랜덤 수 10개를 만들고
 * 짝수인지 검사하여 짝수인 값들만 합산하여 출력합니다
 * 
 * 
 * intSum 변수를 어디에 선언할까?
 * 짝수들은 어디에서 합산(누적)할까
 * 어디에서 출력할까
 * 3가지를 고민
 */
public class Controller_13 {

	public static void main(String[] args) {

		Random rd = new Random();
		int numSum = 0;
		for (int i = 0; i < 10; ++i) {
			int num = rd.nextInt(100) + 1;
			if (num % 2 == 0) {
				System.out.println(num + " 짝수");
				numSum += num;
			}

		}
		System.out.println("===============");
		System.out.println("합계 : " + numSum);
		System.out.println("===============");

	}

}
