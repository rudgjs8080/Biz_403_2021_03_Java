package com.callor.app.service;

import java.util.Scanner;

/*
 * 1. inputValue(String title)
 * 		inputValue(String title, int start)
 * 		inputValue(String title, int start, int end) method를 선언
 * 2. title + "값을 입력하세요" prompt를 보여주고
 * 3. 정수 또는 QUIT를 키보드를 통해 입력 받는다.
 * 4. 입력 값이 QUIT 이면 null을 return하고
 * 5. 정수이면 입력한 정수 값을 return 한다
 * 6. Exception이 발생할 경우 적절한 예외 처리를 수행한다
 */
public class InputServiceV1 {

	Scanner scan;

	public InputServiceV1() {

		scan = new Scanner(System.in);

	}

	public Integer inputValue(String title) {

		String strNum = null;
		Integer intNum = 0;
		while (true) {
			System.out.println(title + " 값을 입력하세요 (입력 중단 : QUIT)");
			System.out.print(" >> ");
			strNum = scan.nextLine();
			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					// TODO 유효성 검사
					System.out.println("정수 또는 QUIT을 입력해주세요");
					continue;
				}
			}
			return intNum;
		}
	}

	public Integer inputValue(String title, int start, int end) {

		String msgTitle = String.format("%s (%d ~ %d) 범위의", title, start, end);

		while (true) {
			Integer intNum = this.inputValue(msgTitle);
			if (intNum != null) {
				if (intNum < start || intNum > end) {
					System.out.printf("%d ~ %d 까지 정수를 입력해주세요", start, end);
					continue;
				}
			}
			return intNum;
		}

	}

	public Integer inputValue(String title, int start) {

		String msgTitle = String.format("%s는 %d 이상의 값을 입력해주세요", title, start);

		while (true) {

			Integer intNum = this.inputValue(msgTitle);
			if (intNum != null) {
				if (intNum < start) {
					System.out.printf("%s는 %d 이상의 값을 입력해주세요", title, start);
					continue;
				}
			}
			return intNum;
		}

	}

}
