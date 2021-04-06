package com.callor.method.service;

import java.util.Scanner;

/*
 * 1. inputValue(String title) method를 선언
 * 2. title + " 값을 입력하세요 " prompt를 보여주고
 * 3. 정수 또는 QUIT를 키보드를 통해 입력 받는다
 * 4. 입력 값이 QUIT 이면 null을 return하고
 * 5. 정수이면 정수 값을 return 한다
 */
public class InputNumberV1 {
	private Scanner scan;

	public InputNumberV1() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {
		int intNum = 0;
		
		while (true) {
			System.out.println(title + " 값을 입력하세요");
			System.out.println("QUIT : 입력중단");
			System.out.print(" >> ");
			String strNum = scan.nextLine();

			if (strNum.trim().equals("QUIT")) {
				System.out.println("입력을 중단하였습니다");
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("정수 또는 QUIT를 입력해주세요");
					System.out.println();
					continue;
				}
			}
			return intNum;

		}

	}

}
