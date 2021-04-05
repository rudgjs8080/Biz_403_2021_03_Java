package com.callor.method;

import com.callor.method.service.NumberServiceV5;

public class Method_08 {

	public static void main(String[] args) {

		NumberServiceV5 nsV5 = new NumberServiceV5();

		while (true) {
			Integer retNum = nsV5.inputNum("대기번호");

			if (retNum == null) {
				System.out.println("업무를 종료하셨습니다");
				break;
			} else {
				System.out.println("대기번호는 : " + retNum);
				continue;
			}

		}

	}

}
