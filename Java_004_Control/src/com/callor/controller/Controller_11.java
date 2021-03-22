package com.callor.controller;

import java.util.Random;

/*
 * 1~100까지의 임의의 숫자 5개를 만들고
 * 그 수가 3의 배수인지 아닌지를 판별하여 출력하시오
 */
public class Controller_11 {

	public static void main(String[] args) {

		Random rd = new Random();
		
		
		for (int i = 0; i < 5; i++) {
			int num = rd.nextInt(100)+1;
			if (num % 3 == 0) {
				System.out.println(num + " / 3의 배수");
			} else {
				System.out.println(num + " / 3의 배수가 아님");
			}

		}
		
		
		
		
		
		
		
		
	}

}
