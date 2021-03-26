package com.callor.apps.service;

import java.util.Scanner;

public class NumServiceV1 {
	int intNum = 0;
	Scanner scan;
	public void inputNum() {
		
		
		System.out.println("정수 1개를 입력합니다");
		System.out.println(">> ");
		intNum = scan.nextInt();// 이 부분 오류나는데 확인해보자
		

		// main method가 아닌 곳에서 scan을 했을 때 close로 닫아주는게 좋다
		// 이제는 Scanner 사용이 끝났으니 Resource(자원)을 반납하겠다는 의미
	}
	public void checkEven() {
		System.out.println(LinesService.dLines(40));
		
		if(intNum % 2 == 0) {
			System.out.printf("입력한 정수 %d는 짝수\n",intNum);
		} else {
			System.out.printf("입력한 정수 %d는 짝수가 아님\n",intNum);
		}
	}
	public void checkPrime() {
		System.out.println(LinesService.dLines(40));
		
		int num = 0;
		for(num = 2 ; num < intNum ; num++) {
			if(intNum % num == 0) {
				break;
			}
		}
		if(num < intNum) {
			System.out.printf("입력한 정수 %d는 소수가 아님\n",intNum);
		} else {
			System.out.printf("입력한 정수 %d는 소수이다\n",intNum);
		}
	}
	
	
	
	
	
}
