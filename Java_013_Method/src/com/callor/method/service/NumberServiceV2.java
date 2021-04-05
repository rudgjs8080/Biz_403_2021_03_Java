package com.callor.method.service;

import java.util.Scanner;

/*
 * 1. NumberServiceV2 클래스에
 * 2. inputNum() method를 선언합니다
 * 3. Scanner 클래스를 사용하여 0 ~ 100 까지 중 정수를 입력 받는다
 * 4. 입력을 취소하고 싶으면 QUIT를 입력합니다
 * 5. QUIT를 입력했으면 null을
 *		정수를 입력했으면 입력한 값을 return 합니다
 */
public class NumberServiceV2 {
	
	public Integer inputNum() {
		Integer num1 = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("1 ~ 100까지 정수를 입력해주세요");
		System.out.println("입력을 취소하고 싶으면 QUIT를 입력해주세요");
		System.out.print(" >> ");
		String str1 = scan.nextLine();
		
		try {
			num1 = Integer.valueOf(str1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(str1.equals("QUIT")) {
			return null;
		}else {
			return num1;
		}
	}
}
