package com.callor.var;

public class Varriable_19 {

	public static void main(String[] args) {

		int intNum = 0;
		
		// Console에 숫자 0 이
		// 무한하게 반복되며 출력
		// 무한하게 반복되는 코드를 조건을 부여하여
		// 유한 반복되도록 변경하기
		// for() 명령에 조건 부여하기
		// for() 문의 두번째 명령 구간에
		// 비교연산자를 추가
		for( ;++intNum <  10; ) {
			System.out.println(intNum);
			System.out.println();
			System.out.println();
			
			
		}
		
		intNum = 1;
		
		for( ; intNum < 10 ; ) {
			
			intNum += 2;
			System.out.println(intNum);
		}
		
	}

}