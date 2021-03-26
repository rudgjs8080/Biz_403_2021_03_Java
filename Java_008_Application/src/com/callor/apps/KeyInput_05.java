package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

/*
 * 1. 키보를 통해서 정수를 1개 입력 받습니다.
 * 2. 입력한 정수가 짝수인가 판별하여 출력합니다.
 * 3. 입력한 정수가 Prime(소수)인지 판별하여 출력합니다.
 */
public class KeyInput_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println(LinesService.dLines(25));
		System.out.println("정수를 입력하세요");
		System.out.print(" >> ");
		
		num = scan.nextInt();
		System.out.println(LinesService.dLines(25));
		if(num % 2 == 0) {
			System.out.println(num + " 은(는) 짝수입니다");
		} else {
			System.out.println(num + " 은(는) 짝수가 아닙니다");
		}
		
		int numP = 0;
		int i = 0;
		numP = num;
		
		for(i = 2 ; i < num ; i++) {
			if(numP % i == 0) {
				break;
			}
		}
		if(i < numP) {
			System.out.println(numP + " 은(는) 소수가 아닙니다");
		} else {
			System.out.println(numP + " 은(는) 소수입니다");
		}

	}

}
