package com.callor.method;

import com.callor.method.service.InputNumberV1A;

public class Number_02A {

	public static void main(String[] args) {

		InputNumberV1A inV1A = new InputNumberV1A();
		
		// 문자열 1개와 정수 2개를 전달하여 method 호출
		// 2개의 정수 범위 내의 값이 입력됐는지
		// 유효성 검사를 수행하기
		inV1A.inputValue("새우깡",0,100);
		
		
		
		
	}

}
