package com.callor.var;

public class Varriable_03 {

	public static void main(String[] args) {

		
		/*
		 *  변수의 성질 1
		 *  코드가 TopDown(위에서 아래로)으로 진행되는 동안
		 *  이전에 변수에 어떤 값이 저장되었는지는 상관없이
		 *  읽는 시점 바로 직전에 저장된 값만 유효하다
		 *  
		 */
		int intNum1 = 0;
		intNum1 = 30;
		intNum1 = 40;
		intNum1 = 50;
		intNum1 = 0;
		
		/*
		 *  변수의 성질 2
		 *  변수에서 값을 읽는 명령(들...)
		 *  	intNum1에 저장된 값을 읽어서
		 *  	Console에 출력하라
		 *  변수에서 값을 읽는 명령이 몇번 수행되던
		 *  상관없이 한 번 변수에 저장된 값은 그대로 유지된다
		 */
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		
		/*
		 * 변수의 성질 3
		 * 변수에 값 저장, 할당, 대입
		 * 이때 대입연산자(=)를 사용한다
		 * 
		 * 변수 = 값
		 * 변수 = 식
		 * 변수 = 변수
		 * 
		 * 대입연산자가 명령문중에 나타나면
		 * 대입연산자 오른쪽이 먼저 실행된다
		 * 
		 */
		
		intNum1 = 30;
		intNum1 = 30 + 40;
//		intNum1 = intNum1;
		
		/*
		 * intNum1에 저장된 값(70)을 CPU로 복사해서 보내기
		 * 어딘가에 저장된 100을 CPU로 복사해서 보내기
		 * 두 수(70, 100)를 덧셈하여
		 * 다시 intNum1에 저장
		 * 원래 intNum1에 저장된 값은 사라지고
		 * 170이 intNum1에 저장된다
		 */
		
		intNum1 = intNum1 + 100; // 오른쪽이 먼저 계산된다
		intNum1 = intNum1 * 2;
//		intNum1 += 100; => 위와 같은 식이다 잘 인지하고 사용하자
//		intNum1 *= 2;
		System.out.println(intNum1); // 340 값이 출력된다
		
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1;
		
		intNum1 ++; // => 위의 식과 같다 1씩 증가하는 값이 된다
		intNum1 --; // -- intNum1; 으로 사용할 수도 있다
		System.out.println(intNum1);
		
		
		
		
		
		
	}

}
