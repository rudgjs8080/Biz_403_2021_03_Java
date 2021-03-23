package com.callor.apps;

import java.util.Random;

/*
 * 1. 학생 25명에게 간식을 주려고 합니다. 설문 조사 결과 피자를 간식으로 주려고 합니다
 * 2. 피자는 한 판에 6개의 조각이 있습니다
 * 3. 6개 조각의 피자를 25명이 부족하지 않게 나눠 먹으려면 몇판의 피자를 주문해야 할까요
 * 4. Random 클래스를 사용하여 25~50 의 정수를 생성하고 intMembers 변수에 저장 한 후
 * 5. 주문할 피자 판수를 계산하는 코드를 구현해 봅니다.
 */
public class App_01 {

	public static void main(String[] args) {
		Random rd = new Random();

		int intMoney = 24000;
		int intMembers = 0;
		int intPizza = 0;
		int intPizzaPcs = 6;
		intMembers = rd.nextInt(26) + 25;
		if (intMembers % intPizzaPcs == 0) {
			intPizza = (intMembers / intPizzaPcs);
			System.out.printf("학생 수는 %d명입니다\n", intMembers);

		} else if (intMembers % intPizzaPcs != 0) {
			intPizza = (intMembers / intPizzaPcs) + 1;
			System.out.printf("학생 수는 %d명입니다\n", intMembers);

		}
		System.out.printf("주문해야하는 피자는 %d판입니다\n", intPizza);
		System.out.printf("1인당 %d원씩 내시면 됩니다", intMoney * intPizza / intMembers);

	}
		// 위의 코드를 더 줄일 수 있다 더 간단한 코드를 만들어보자
}
