package com.callor.apps;

public class Pay_04 {

	public static void main(String[] args) {

		int nPay = 3723560;
		int nPaper = 50000;
		
		int sw = 1;
		for(int index = 0 ; nPay > 0 ; index++ ) {
			int nCount = nPay / nPaper;
			System.out.printf("%6d 원권 %5d매\n",nPaper,nCount);
			nPay %= nPaper;
			if(sw > 0 ) {
				nPaper /= 5;
			} else {
				nPaper /= 2;
			}
			sw *= (-1);
			//nPaper 2 또는 5로 나누기
		}
		
		
		
	}

}
