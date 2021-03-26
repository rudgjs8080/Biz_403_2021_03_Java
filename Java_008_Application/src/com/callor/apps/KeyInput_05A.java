package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05A {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("정수 1개를 입력하세요");
		System.out.print(">> ");

		int num1 = scan.nextInt();

		System.out.println(LinesService.dLines(30));

		if (num1 % 2 == 0) {
			System.out.println("입력한 정수" + num1 + " 은 짝수입니다");
		} else {
			System.out.println("입력한 정수" + num1 + " 은 짝수가 아닙니다");
		}
		int i = 0;
		for (i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				break;
			}

		}
		if (i < num1) {
			System.out.println(num1 + " 은 소수가 아니다");
		} else {
			System.out.println(num1 + " 은 소수이다");
		}

	}

}
