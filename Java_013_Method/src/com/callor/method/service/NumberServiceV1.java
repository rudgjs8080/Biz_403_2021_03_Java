package com.callor.method.service;

import java.util.Random;

/*
 * 1. NumberServiceV1 클래스에
 * 2. inputNum() method를 선언합니다
 * 3. Random 클래스를 사용하여 1 ~ 100 까지 중 임의의 난수 1개를 생성한 후
 * 4. 3의 배수인가를 확인하고
 * 5. 3의 배수이면 정수값을 아니면 null 값을 return 하도록 합니다
 * 
 * 완성 X
 */
public class NumberServiceV1 {

	public void inputNum() {
		Random rd = new Random();
		
		int num = rd.nextInt(100)+1;
		
		if(num % 3 == 0) {
			System.out.println(num + " 는 3의 배수입니다");
		}
		
	}
	
	
}
