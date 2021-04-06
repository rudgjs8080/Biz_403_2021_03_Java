package com.callor.method;

import com.callor.method.service.InputNumberV1;

public class Number_02 {

	public static void main(String[] args) {

		InputNumberV1 inV1 = new InputNumberV1();

		while (true) {
			Integer retNum = inV1.inputValue("상품");
			if (retNum == null) {
				break;
			} else {
				System.out.println("입력하신 값은 : " + retNum);
				System.out.println();
			}

		}

	}

}
