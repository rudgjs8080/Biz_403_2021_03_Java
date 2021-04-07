package com.callor.method.service;

import java.util.Scanner;

/*
 * 전통적인(구조적 프로그래밍) 방법
 * 원칙적으로 같은 클래스에서 같은 이름의 method는
 * 중복하여 작성할 수 없다
 * public Integer inputValue1(String title);
 * public Integer inputValue2(String title, int start);
 * public Integer inputValue3(String title, int start, int end);
 * 이런식으로 method이름을 다르게 만들어줘야한다
 * 
 * 객체지향 개발 방법
 * 매개변수의 개수, 타입, 순서가 다르면 
 * 같은 이름의 method를 중복하여 작성할 수 있다
 * 
 * public Integer inputValue(String title);
 * public Integer inputValue(String title, int start);
 * public Integer inputValue(String title, int start, int end);
 * 
 * 
 */
public class InputNumberV1A2 {

	protected Scanner scan;

	public InputNumberV1A2() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title, int start) {

		String msgTitle = String.format("%s( %d 이상의)", title, start);
		while(true) {
			Integer intNum = this.inputValue(msgTitle);
			if(intNum != null) {
				if(intNum < start) {
					System.out.printf("입력값은 %d 이상이어야 합니다",start);
					System.out.println();
					continue;
				}
			}
			return intNum;
		}
	}

	/*
	 * 정수 범위에 대한 유혀성검사를 수행하는 method 
	 * 이미 만들어진 inputValue(String title) method 와 연동하여
	 * 사용하겠다
	 */
	public Integer inputValue(String title, int start, int end) {
		// 유효성 검사를 수행하겠다는 메시지를 미리 작성
		String msgTitle = String.format("%s(%d ~ %d) 범위의", title, start, end);
		while (true) {
			Integer intNum = this.inputValue(msgTitle);
			// this.inputValue(String title) method가
			// return 해준 값이 null이 아니면 유효성 검사수행을 해라

			if (intNum != null) {
				// 유효성 검사를 통과하지 못하면
				if (intNum < start || intNum > end) {
					// 메시지를 보여주고
					System.out.printf("입력값은 %d ~ %d 까지 입력하세요\n", start, end);
					
					// 다시 inputValue(String title)을 호출하여 입력을 받아라
					continue;
				}
			}
			// inputValue(String title)이 null을 return 했거나
			// 유효한 범위의 정수를 return 했으면
			// 그 값이 담겨 있다 그 값을 return 하라
			return intNum;
		}

	}

	public Integer inputValue(String title) {

		// Exception이 발생했을 때 사용자에게
		// 안내 메시지를 보여주고
		// 다시 입력을 받도록 하기 위한 선조치
		while (true) {
			System.out.println(title + " 값을 입력하세요(QUIT : 입력중단)");
			System.out.print(" >> ");
			String strInput = scan.nextLine();

			if (strInput.trim().equals("QUIT")) {
				return null;
			}
			// if 조건문이 false 경우 실행되는 부분
			// 굳이 else를 사용하지 않아도 문제 없는 코드
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("입력값 오류!");
				System.out.println("정수나 QUIT 문자열만 입력하세요");
				continue;
			}
			// try - catch block 코드가
			// 정상적으로 모두 완료되었을때 실행되는 부분
			// 입력한 값이 정상적으로 정수형 데이터로 변환되어
			// intNum 변수에 담겨 있다
			// 입력한 정수값이 return 된다
			return intNum;
		}

	}

}
