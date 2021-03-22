package com.callor.controller;

/*
 * 1~100까지 숫자 중에서
 * 3의 배수의 합
 * 4의 배수의 합
 * 3의 배수이면서 5의 배수의 합
 */
public class Controller_04 {

	public static void main(String[] args) {

		int intSum1 = 0;
		int intSum2 = 0;
		int intSum3 = 0;
		
		for(int i = 1 ; i < 101 ; i++) {
			if(i % 3 == 0) {
				intSum1 += i;
			}
			if(i % 4 == 0) {
				intSum2 += i;
		}
			if(i % 3 == 0 && i % 5 == 0) {
				intSum3 += i;
			}
		}
		System.out.println(intSum1);
		System.out.println(intSum2);
		System.out.println(intSum3);
		
	}
		

}
