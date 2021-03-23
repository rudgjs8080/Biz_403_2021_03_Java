package com.callor.apps;
/*
 * 1. 대한민국 화폐는 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 50원, 10원, 5원, 1원 권입니다
 * 2. 금액 3,723,560 원을 인출합니다
 * 3. 은행에서는 최소한의 화폐 개수로 지급을 하려고 합니다.
 * 4. 각 권별로 몇 개씩 지급을 해야 최소한으로 지급이 가능할까요?
 */
public class Pay_02 {

	public static void main(String[] args) {

		int nPay = 3723560; // 금액
		int nPaper = 50000; // 최고액면가 화폐
		
		// 정수 = 정수 / 정수 : 소수점이하가 잘린다
		// 몫을 구하면 액면가액 만큼 개수를 계산
		
		int nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		
		// 액면가액만큼 개수를 구했으면
		// nPay에서 액면가액 금액만큼을 빼고 이후에 계산
		//3723560 % 50000 => 50000 * 매수 만큼을 3723560 에서 뺀 값이 된다
		// nPay = nPay - (nPaper * nCount)
		// nPay = nPay % nPaper;
		
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
	}

}
