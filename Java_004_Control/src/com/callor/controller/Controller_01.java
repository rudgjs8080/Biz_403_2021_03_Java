package com.callor.controller;

public class Controller_01 {

	public static void main(String[] args) {

		
		int intSum = 0;
		int intSum1 = 0;
		int intSum2 = 0;
		int intSum3 = 0;
		
		for(int i = 1; i < 101 ; i++) {
			if(i % 3 == 0) {
				intSum += i;
			}
			if(i % 4 == 0) {
				intSum1 += i;
			}
			if(i % 3 == 0 && i % 5 == 0) { 
					intSum2 += i;
			}
			if(i % 3 == 0) {
				if(i % 7 == 0) {
					intSum3 += i;
				}
			}
			
		} 
		// else if 를 사용하면 if 에서 사용된 값들을 출력할 수 없게된다
		// 그렇기 때문에 같은 값들을 사용하기 위해서는 else if 대신 if 를 사용해줘야한다
		
		System.out.println("========================");
		System.out.println("3의 배수의 합 : " + intSum);
		System.out.println("4의 배수의 합 : " + intSum1);
		System.out.println("3의 배수이면서 5의 배수의 합 : " + intSum2);
		System.out.println("3의 배수이면서 7의 배수의 합 : " + intSum3);
		System.out.println("========================");
		
		    
		
		
		
		
		
	}

}
