package com.callor.values;

public class Print_01 {
	public static void main(String[] args) {
		// Console 에 출력하는 명령문
		/*
		 * println()
		 * 빈라인(Enter)만 출력하라
		 * new line 기호, 새로 줄바꿈하기
		 * print() 은 괄호안이 비어있는 채로 실행할 수 없다
		 * print() 는 줄바꿈이 없이 출력된다.
		 */
		System.out.println("A");
		System.out.println("B");
		System.out.println();
		System.out.println("C");
		System.out.print(3);
		System.out.print(4);
		/*
		 * 한줄에 연속된 결과를 출력한 후
		 * 다음줄에 다른 결과를 출력하고 싶으면
		 * println()을 한 번 실행해 준다
		 */
		System.out.println();
		System.out.println("===================");
		/*
		 * printf()
		 * form(형식)에 맞춰서 출력하는 명령문
		 * printf("형식문자열", 값들...)
		 * %와 함께 시작되는 기호들을 사용하여 출력되는 문자열 형식을
		 * 만들고 실제 값들을 채워넣어서 문자열을 완성하여
		 * 출력하는 명령문이다
		 * printf()는 다음 printf()문과 줄바꿈이 되지 않기 때문에
		 * \n을 뒤에 넣어줘야 줄바꿈을 할 수 있다.
		 * %d : 정수를 표시하는 형식 기호
		 * %s : 문자열을 표시하는 형식 기호
		 * %f : 실수를 표시하는 형식 기호 
		 *
		 */
		System.out.printf("%d + %d = %d\n" ,3,4,3+4);
		System.out.println();
		System.out.printf("%d x %d = %d",3,4,3*4);
		
		
		
		
		
	}
	
	
	
}
