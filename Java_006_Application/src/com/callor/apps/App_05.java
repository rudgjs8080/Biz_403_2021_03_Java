package com.callor.apps;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {

		Random rd = new Random();
		int[] intNums = new int[50];
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rd.nextInt(100)+1;
			
		}
		for(int i = 0 ; i < intNums.length ; i++) {
			System.out.print(intNums[i] + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		
		
		
		
		
		
	}

}
