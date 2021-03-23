package com.callor.apps;

import java.util.Random;

/*
 * n개의 학급 학생들에게 피자 간식을 지급 하려고 합니다
 * 학급당 인원은 50~59명입니다
 * 학급 인원은 Random 클래스를 이용하여 생성합니다
 * 피자는 1box에 6조각입니다
 * 다음과 같이 주문 리스트를 출력합니다
 */
public class App_04 {

	public static void main(String[] args) {
		int n = 10;
		int[] intClass = new int[n];
		Random rd = new Random();
		int intPizzaBox = 0;
		int intPizzaPcs = 0;
		int sumBox = 0;
		System.out.println("============================");
		System.out.println("피자 주문서");
		System.out.println("============================");
		System.out.println("인원수 " + " 피자 주문 " + " 전체 조각 수");
		for (int i = 0; i < n; i++) {
			intClass[i] = rd.nextInt(10) + 50;
			intPizzaBox = intClass[i] / 6;
			if (intClass[i] % 6 != 0) {
				intPizzaBox++;
			} 
			intPizzaPcs = intPizzaBox * 6;
			System.out.printf("%2d명\t     %2d판\t %2d조각\n", intClass[i], intPizzaBox, intPizzaPcs);
			sumBox += intPizzaBox;
		}
		System.out.println("============================");
		System.out.println("전체 주문 Box 수량 : " + sumBox);
	
	}

}
