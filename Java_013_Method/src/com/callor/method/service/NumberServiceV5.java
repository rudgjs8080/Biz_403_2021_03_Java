package com.callor.method.service;

import java.util.Scanner;

/*
 * 1. NumberServiceV5 클래스 선언
 * 2. inputNum(String title) method를 선언
 * 3. title 변수에 담긴 문자열을 연결하여 다음과 같은
 * prompt를 보여줍니다
 * 		** 값을 입력하세요
 * 		>>
 * 4. NumberServiceV4 클래스의 inputNum() method를 참조하여
 * 5. 입력 오류에 대한 예외처리
 * 6. 정수 0 ~ 100 범위의 유효성 검사를 수행하고 정수 return
 * 7. 입력중 QUIT를 입력하면 null 을 return
 */
public class NumberServiceV5 {

	public Integer inputNum(String title) {

		Scanner scan = new Scanner(System.in);
		Integer intNum = 0;
		String strNum = null;

		while (true) {
			System.out.println(title + " 값을 입력하세요");
			System.out.println("QUIT : 입력 중단");
			System.out.print(">> ");
			strNum = scan.nextLine();
			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("숫자가 아닌 값을 입력하였습니다");
					continue;
				}

			}
			if (intNum < 0 || intNum > 100) {
				System.out.println("0 ~ 100 까지의 정수를 입력하세요");
				continue;
			}
			return intNum;
		}

	}
}
