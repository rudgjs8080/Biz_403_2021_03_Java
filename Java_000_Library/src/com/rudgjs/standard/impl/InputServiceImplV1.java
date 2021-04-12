package com.rudgjs.standard.impl;

import java.util.Scanner;

import com.rudgjs.standard.InputService;

public class InputServiceImplV1 implements InputService {

	protected Scanner scan;

	public InputServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer inputValue(String title) {
		// TODO Prompt 타이틀을 보여주고 정수 입력 받기
		while (true) {

			System.out.println(title + " 값을 입력하세요(QUIT : 입력중단)");
			System.out.println(" >> ");
			String strNum = scan.nextLine();
			if (strNum.trim().equals("QUIT")) {
				System.out.println("입력 취소");
				return null;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("정수 또는 QUIT 만 입력하세요");
				continue;
			}
			return intNum;
		} // end while

	}

	@Override
	public Integer inputValue(String title, int start) {
		// TODO 시작값을 갖는 유효성 검사 추가한 method

		title = String.format("%s ( %d 이상)",title, start);

		while (true) {
			Integer intNum = this.inputValue(title);
			if (intNum != null) {
				if (intNum < start) {
					System.out.printf("%s값은 %d 이상으로 입력해주세요\n", title, start);
					continue;
				}
			}
			return intNum;
		} // end while

	}

	@Override
	public Integer inputValue(String title, int start, int end) {
		// TODO 제목, 시작값, 종료값으로 유효성 검사 method

		title = String.format("%s(%d ~ %d 범위의)", title,0, 100);
		while (true) {
			Integer intNum = this.inputValue(title);
			if (intNum != null) {
				if (intNum < start || intNum > end) {
					System.out.printf("값은 %d ~ %d 까지 입력하세요\n", start, end);
					continue;
				}
			}
			return intNum;
		} // end while

	}

}
