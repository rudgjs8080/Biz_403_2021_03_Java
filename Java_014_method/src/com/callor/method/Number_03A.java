package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.InputNumberV1A2;

public class Number_03A {

	public static void main(String[] args) {

		InputNumberV1A2 inService = new InputNumberV1A2();
		
//		inService.inputValue("새우깡");
//		inService.inputValue("새우깡", 0, 100);
		inService.inputValue("새우깡", 0);
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		
		
	}

}
