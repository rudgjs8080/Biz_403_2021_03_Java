package com.callor.controller;

public class Cont_04 {

	public static void main(String[] args) {
		
		int intNum = 0;
		for(int index = 0; index < 10 ; index++ ) {
			//for () 반복문이 실행되는 동안에
			// intNum 변수는 생성과 소멸을 반복횟수만큼 실행한다
			// 과거에는 이러한 문제가 이슈가 되었던 적도 있다
			// int intNum = 0;
			int index1 = index + 1;
			System.out.println();
			
		}
		int intSum = 0;
		// index 는 for () 반복문에 의해서 0~9까지 변한다
		// 		index++ 명령문에 의해서 index가 변한다
		
		for(int index = 0; index < 10 ; index ++) {
			// 0~9 까지의 값이 index에 저장된 상태로
			// 명령이 실행된다
			// intNum 에는 index 값에 1을 더한 값이 저장된다
			// 결국 intNum는 0~9까지 값이 하나씩 저장된다
			// 		index++
			// 		intNum = index + 1 이 반복되고 있다
			intNum = index +1;
			
			// intSum = intSum + intNum;
			intSum += intNum;
			System.out.println(intSum);
			
		}
		
		intSum = 0;
		for(int i = 0; i < 10 ; i++) {
			
			int n = i + 1;
			intSum += n;
			
		} System.out.println(intSum);
		
		int sum = 0;
		for(int index = 0; index < 10 ; index += 2) {
			int num = index + 1;
			intSum += num;
			System.out.println(num);
		}
		System.out.println("================");
		for(int index = 0; index < 10 ; index +=2) {
			System.out.println(index);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
