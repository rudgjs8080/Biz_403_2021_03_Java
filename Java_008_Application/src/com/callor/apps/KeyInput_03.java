package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

/*
 * 1. 키보드를 통하여 2개의 정수를 입력받아 변수에 각각 저장
 * 2. 변수에 저장된 정수의 4칙 연산을 수행하여 출력
 * 3. 키보드로 입력 받기 전에 prompt를 출력
 */
public class KeyInput_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(LinesService.dLines(40));
		System.out.println("정수값 2개를 입력 후 Enter를 눌러주세요");
		System.out.print("정수 1 >>");
		int num = scan.nextInt();
		System.out.print("정수 2 >>");
		int num1 = scan.nextInt();
		System.out.println(LinesService.sLines(40));
		System.out.println("두 수의 합은 : " + (num + num1));
		System.out.println("두 수의 차는 : " + (num - num1));
		System.out.println("두 수의 곱은 : " + (num * num1));
		System.out.println("두 수의 몫은 : " + (num / num1) + " , 두 수를 나눈 나머지는 : " + (num % num1));
		
		
		

	}

}
