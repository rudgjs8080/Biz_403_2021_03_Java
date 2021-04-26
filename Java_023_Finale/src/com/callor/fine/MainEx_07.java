package com.callor.fine;

public class MainEx_07 {
	
	/*
	 * ===================================
	 * 5단 구구단
	 * -----------------------------------
	 * 5 x 1 = 5
	 * 5 x 1 = 5
	 * 5 x 1 = 5
	 * 5 x 1 = 5
	 * 5 x 1 = 5
	 * 5 x 1 = 5
	 * 5 x 1 = 5
	 * 5 x 1 = 5
	 * ===================================
	 * 5단 구구단 출력하기 
	 */
	
	public static void main(String[] args) {
		// n단 구구단
		int n = 5;
		System.out.println("=".repeat(20));
		for(int i = 1 ; i < 10 ; i++) {
			System.out.printf("%d x %d = %d\n",n,i,n*i);
		}
		System.out.println("-".repeat(20));
	}
	
}
