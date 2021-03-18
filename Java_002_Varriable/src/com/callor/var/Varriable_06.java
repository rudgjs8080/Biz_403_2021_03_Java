package com.callor.var;

public class Varriable_06 {

	public static void main(String[] args) {

		int intNum = 0;

		// intNum + 1 과 같은 의미 하지만 값은 0 이 출력된다
		System.out.println(intNum++);
		// 왜 맨처음의 값이 0 일까에 대해 생각해봐야한다
		
		System.out.println( "숫자 : " + intNum + 1);
		
		intNum = 0;
		// 1
		intNum  += 1;	
		System.out.println(intNum);
		// 위 두 코드를 한 명령문으로 만들면
		System.out.println(++intNum);
	
		// 2
		System.out.println(intNum);
		intNum += 1;
		
		// 위 두 코드를 한 명령문으로 만들면
		System.out.println(intNum++);
		
	}

}
