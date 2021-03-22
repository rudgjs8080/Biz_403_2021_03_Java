package com.callor.controller;

import java.util.Random;

/*
 * 1~100까지 범위의 난수 10개를 만들고
 * 그 수가 3의 배수인지 출력한 후
 * 수들의 합계를 계산하여 출력합니다
 * 
 */
public class Controller_12A {

	public static void main(String[] args) {

		Random rnd = new Random();
		int intSum = 0;
		for (int i = 0; i < 10; ++i) {
			int num = rnd.nextInt(100) + 1;
			if (num % 3 == 0) {
				System.out.println(num + " 3의 배수");
				intSum += num;
			}
		}
		System.out.println("=============");
		System.out.println("합계 : " + intSum);
	}
	// for() {} 안에서 선언된 변수 num는
	// for() 명령이 끝나면 소멸된다.
	// 변수 i 도 for() 안에서 선언되었기 때문에
	// for() 명령이 끝나면 소멸된다.
	// System.out.println(num);
	
	/*
	 * scope(범위) 라고 한다
	 * {} : 변수의 사용 범위를 제한하는 역할을 한다
	 * 
	 * 작성하는 코드는 main() {} 내에 있다
	 * 여기에서 선언된 모든 변수는
	 *  main() method가 종료하면 모두 소멸된다
	 *  for() { } 내에 선언된 모든 변수는 
	 *  for() 반복문이 종료되면 모두 소멸된다
	 *  
	 *  if() {} 내에 선언된 모든 변수는
	 *  if() 비교문이 종료되면 모두 소멸된다.
	 *  
	 *  for(0 {}, if() {} 명령이 시작되기 전에
	 *  선언된 변수들은 for(), if() 명령문 내에서
	 *  사용(저장, 읽기)가 가능하고
	 *  for(), if() 명령이 종료되어도 그 값을 유지하고 있다
	 *  
	 *  for() 반복문이 수행되는 동안에 어떤 값을 누적(합산) 하거나 할 때
	 *  for() 반복문이 시작되기 전에 변수를 반드시 선언하고  0 으로 clear 하는 것이 좋다
	 */
}

















