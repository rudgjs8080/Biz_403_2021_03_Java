package com.callor.controller;

import java.util.Random;

/*
 * 0~100까지의 중의 임의의 정수 5개를 만들어서
 * 그 수가 짝수인지 아닌지를 출력하라
 */
public class Controller_10 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println(rnd.nextInt(100));
		}
		/*
		 * 반복문을 사용하여 임의 정수 100을 만들고
		 * 그 수가 짝수인지 아닌지 판별하는 코드
		 */
		System.out.println("==================");
		for(int i = 0 ; i < 10 ; i++) {
			int num = rnd.nextInt(10);
			if(num % 2 == 0) {
				System.out.println(num + " 짝수");
			} else {
				System.out.println(num + " 짝수 아님");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
