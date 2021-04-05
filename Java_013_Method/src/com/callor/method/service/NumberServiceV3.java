package com.callor.method.service;

import java.util.Scanner;

/*
 * 1. NumberServiceV3 클래스에
 * 2. inputNum() method를 선언합니다
 * 3. Scanner 클래스를 사용하여 0 ~ 100 까지 중 정수를 입력 받는다
 * 4. 입력을 취소하고 싶으면 QUIT를 입력합니다
 * 5. QUIT를 입력했으면 null을
 *		정수를 입력했으면 입력한 값을 return 합니다
 * 6. 입력 오류에 대한 예외처리를 추가합니다
 * 7. 정수 값의 유효성 검사를 수행합니다
 */
public class NumberServiceV3 {

	public Integer inputNum() {
		Integer num1 = null;
		Scanner scan = new Scanner(System.in);
		String strNum;
		while (true) {

			System.out.println("1 ~ 100까지 정수를 입력해주세요");
			System.out.println("입력을 취소하고 싶으면 QUIT를 입력해주세요");
			System.out.print(" >> ");
			strNum = scan.nextLine();

			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					num1 = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("숫자가 아닌 값을 입력하셨습니다");
					
				}
				return num1;
			}

		}
		
	}

}
