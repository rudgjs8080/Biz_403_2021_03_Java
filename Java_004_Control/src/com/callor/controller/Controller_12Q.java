package com.callor.controller;

import java.util.Random;

/*
 * 1~100까지 범위의 난수 10개를 만들고
 * 그 수가 3의 배수인지 출력한 후
 * 수들의 합계를 계산하여 출력합니다
 * 
 */
public class Controller_12Q {

	public static void main(String[] args) {
		Random rd = new Random();
		for (int i = 0; i < 10; ++i) {
			int num = rd.nextInt(100) + 1;
			if (num % 3 == 0) {
				int sum = 0;
				sum += num;
				System.out.println(num + " / 3의 배수");
				System.out.println(sum);
			} 
			
		}

	}

}
