package com.callor.controller;

public class Cont_01 {

	public static void main(String[] args) {
		int intNum = 0;
		String Kor = "우리나라 대한민국";
		System.out.println("=======================");
		System.out.printf("%d. %s\n",++intNum,Kor);
		System.out.printf("%d. %s\n",++intNum,Kor);
		System.out.printf("%d. %s\n",++intNum,Kor);
		System.out.printf("%d. %s\n",++intNum,Kor);
		System.out.printf("%d. %s\n",++intNum,Kor);
		System.out.printf("%d. %s\n",++intNum,Kor);
		System.out.printf("%d. %s\n",++intNum,Kor);
		System.out.printf("%d. %s\n",++intNum,Kor);
		System.out.printf("%d. %s\n",++intNum,Kor);
		System.out.println("=======================");
		
		// main() 메소드의 코드는 Topdown으로 진행된다
		// 코드가 정상 진행되는 과정에서
		//for() 명령문을 만나면 조건을 검사하고
		// 조건에 따라 반복하는 코드가 실행된다
		// 이처럼 Topdwon으로 진행되는 코드의 흐름을 바꾸는 명령을
		// "제어명령", "Control 명령" 이라고 한다
		int intNum1 = 0;
		String Kor1 = "우리나라 대한민국";
		System.out.println("=======================");
		for ( ; intNum1  < 9 ; ) {
			System.out.printf("%d. %s\n",++intNum1,Kor1);
		}
		
		/*
		 * for( intNum = 0; intNum < 10 ; intNum++) {
		 * 		System.out.println(intNum);
		 * }
		 * for() 명령을 만나면
		 * intNum = 0 을 실행한다
		 * 		이 명령은 반복횟수와 관계없이
		 * 		딱 한 번만 실행된다
		 * intNum < 10 을 실행하여 조건을 검사
		 * 		결과 true 이면 {} 의 명령을 실행한다
		 * 명령 실행이 끝나면 다시 for() 명령문 시작으로 되돌아 온다
		 * 증가 : intNum++ 명령을 실행
		 * 조건검사 : intNum < 10 
		 * 
		 * 증가, 조건검사를 반복하면서
		 * 	조건검사 결과가 false가 될때까지
		 * 	(조건검사 결과가 true 인 동안)
		 * 반복하여 {} 안의 명령을 실행한다
		 */
		System.out.println("=======================");
		
		int intNum2 = 0;
		
		System.out.println("========================");
		System.out.printf("%d. 우리나라 대한민국\n",++intNum2);
		System.out.printf("%d. 우리나라 대한민국\n",++intNum2);
		System.out.printf("%d. 우리나라 대한민국\n",++intNum2);
		System.out.printf("%d. 우리나라 대한민국\n",++intNum2);
		System.out.printf("%d. 우리나라 대한민국\n",++intNum2);
		System.out.printf("%d. 우리나라 대한민국\n",++intNum2);
		System.out.printf("%d. 우리나라 대한민국\n",++intNum2);
		System.out.printf("%d. 우리나라 대한민국\n",++intNum2);
		System.out.printf("%d. 우리나라 대한민국\n",++intNum2);
		System.out.println("========================");
	}

}
