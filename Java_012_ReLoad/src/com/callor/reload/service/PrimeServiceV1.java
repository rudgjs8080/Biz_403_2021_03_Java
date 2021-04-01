package com.callor.reload.service;

import java.util.Random;

/*
 * 1. PrimeServiceV1 class의 클래스 영역에
 * Random rnd 객체를 선언
 * 2. 클래스 생성자에서 rnd 객체 생성(초기화)
 * 3. PrimeNum() method를 선언하고
 * 50 ~ 100 까지 중 임의의 난수를 생성하고
 * 난수가 소수인가를 판별하여 출력하는 코드 작성
 */

// 못풀었다
public class PrimeServiceV1 {
	Random rd;
	int num;
	int prime;

	public PrimeServiceV1() {
		rd = new Random();
	}

	public void primeNum() {
		prime = num;
		num = rd.nextInt(51) + 50;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				break;
			}
		}

	}

	public void printNum() {

		System.out.println(prime);
		System.out.println(num);
		if (prime >= num) {
			System.out.println("소수");
		} else {
			System.out.println("소수가 아님");
		}
	}

}
