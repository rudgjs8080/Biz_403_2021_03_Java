package com.callor.apps;

public class Pay_03 {

	public static void main(String[] args) {

		int nPay = 3723560;
		int nPaper = 50000;
		
		for(int index = 0 ; nPay > 0 ; index++ ) {
			int nCount = nPay / nPaper;
			System.out.printf("%6d 원권 %5d매\n",nPaper,nCount);
			nPay %= nPaper;
			if(index % 2 == 0) {
				nPaper /= 5;
			} else {
				nPaper /= 2;
			}
			
			//nPaper 2 또는 5로 나누기
		}
		
		
		
	}

}
