package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class Number_01 {

	public static void main(String[] args) {

		NumberServiceV1 nsV1 = new NumberServiceV1();

		int retNum = nsV1.addNum(10, 10);

		if (retNum % 2 == 0) {
			System.out.println("두수의 합은 짝수입니다");
		} else {
			System.out.println("두수의 합은 짝수가 아닙니다");
		}

	}

}
