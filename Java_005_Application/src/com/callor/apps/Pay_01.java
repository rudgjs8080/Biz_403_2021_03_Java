package com.callor.apps;
/*
 * 1. 대한민국 화폐는 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 50원, 10원, 5원, 1원 권입니다
 * 2. 금액 3,723,560 원을 인출합니다
 * 3. 은행에서는 최소한의 화폐 개수로 지급을 하려고 합니다.
 * 4. 각 권별로 몇 개씩 지급을 해야 최소한으로 지급이 가능할까요?
 */
public class Pay_01 {

	public static void main(String[] args) {

		int money = 3723560;
		int cash = 50000;
		
		for(int i = 0 ; i < 1 ; i++) {
			int a = money / cash;
			int b = money - (cash*a);
			int c = cash / 5;
			System.out.println(a);
			System.out.println(b);
			System.out.println(74*50000);
			
			
		}
		
		
		
		System.out.println("====================");
		System.out.println("급여수령액 : " + money);
		System.out.println("====================");
		System.out.println("====================");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
