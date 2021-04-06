package com.callor.method.service;

import java.util.Scanner;

/*
 * 1. NumberServiceV1 클래스를 선언
 * 2. addNum() method는 두 개의 정수를 매개변수로 받는다
 * 3. 매개변수로 받은 2개의 정수의 합을 계산하고
 * 		합의 결과가 짝수이면 계산 결과를 return 하고
 * 		그렇지 않으면 null을 return 한다
 */
public class NumberServiceV1 {


	public Integer addNum(int intNum1, int intNum2) {

		int sum = 0;

		sum = intNum1 + intNum2;

		if (sum % 2 == 0) {
			return sum;
		} else {
			return null;
		}

	}

}
