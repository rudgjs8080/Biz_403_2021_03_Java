package com.callor.fine;

import java.util.Random;

public class MainEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		num1 = 30;
		num2 = 40;
		
		int sum = num1 + num2;
		System.out.println(sum);
		
		// 변수를 선언하고 초기화 하지 않으면 절대 읽을수 없다
		//int num;
		//System.out.println(num);
		
		Random rd = new Random();
		
		int rdNum = rd.nextInt(100)+1;
		if(rdNum % 2 == 0) {
			System.out.println(rdNum + " 2의 배수다");
			System.out.println(rdNum + " 는 짝수이다");
		} else {
			System.out.println(rdNum + " 는 2의 배수가 아니다");
			System.out.println(rdNum + " 는 홀수이다");
			System.out.println(rdNum + " 는 짝수가 아니다");
		}
		
		int intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int intNum = i +1;
			intSum += intNum;
		}
		System.out.println("1 ~ 100까지 덧셈결과 : " + intSum);
		
		intSum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			intSum += i;
		}
		System.out.println("1 ~ 100까지 덧셈결과 : " + intSum);
		
	}

}
