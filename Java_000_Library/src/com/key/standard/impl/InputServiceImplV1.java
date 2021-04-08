package com.key.standard.impl;

import java.util.Scanner;

/*
 * 규칙을 지키지 않으면 코드를 작성하지 못하게 만듦
 * 
 */
import com.key.standard.InputService;
/*
 * 인터페이스를 implements 한 클래스는 
 * 이름을 지을때 접미사에 보통 Impl을 붙인다
 * 
 * 인터페이스를 impl 한 클래스는
 * 인터페이스에 설계된 추상메서드를 "반드시" 구체적인
 * 코드로 구현해야 한다
 * 
 * 만약 아직 구체적인 코드가 구현되지 않았더라도
 * method의 형태는 삭제 할 수 없다
 * 
 * 이러한 규칙을 적용하여 다른 클래스와 연동할 때
 * 편리하고, 오류가 없도록 하기 위함이다
 */

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

		title = String.format("%s ( %d 이상)", start);

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

		title = String.format("$(%d ~ %d 범위의)", 0, 100);
		while (true) {
			Integer intNum = this.inputValue(title);
			if (intNum != null) {
				if (intNum < start || intNum > end) {
					System.out.printf("값은 %d ~ %d 까지 입력하세요\n", start, end);
				}
			}
		} // end while

	}

}
