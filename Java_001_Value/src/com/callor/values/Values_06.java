package com.callor.values;

public class Values_06 {

	public static void main(String[] args) {
		System.out.println(33 % 2);
		// 33을 2로 나눈 나머지가 2인가? 라는 질문 (True)
		System.out.println((33 % 2) == 1);
		// 33을 2로 나눈 나머지가 0인가? 라는 질문 (False)
		System.out.println((33%2) == 0);
		
		// 어떤 수를 2로 나눠서 나머지가 0이면 
		// 그 어떤 수는 짝수이고
		// 그렇지 않으면 홀수이다
		// 삼항연산자
		// 비교 ? true : false 와 같이 항목이 3가지가 구분되어 있는 연산
		System.out.println((33 % 2) == 0 ? "짝수" : "홀수" );
		// 물음표를 중심으로 왼쪽에서 연산된 결과가 True 이면 "짝수" 라는 문자열을 출력
		// False 이면 "홀수"라는 문자열을 출력하라는 코드
		// 연산자 ? true 일때 : false 일때
		
		int x = 40;
		System.out.println((33>x) ? "X는 33보다 작다" : "X는 33보다 크다");
		


	}

}
