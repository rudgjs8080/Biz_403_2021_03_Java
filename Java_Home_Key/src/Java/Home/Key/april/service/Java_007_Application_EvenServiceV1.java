package Java.Home.Key.april.service;

import java.util.Random;

public class Java_007_Application_EvenServiceV1 {

	Random rd; 
	int[] num = new int[100];
	public Java_007_Application_EvenServiceV1() {
		rd = new Random();
		
	}
	
	
	public void makeNum(int n) {
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			num[i] = rd.nextInt(100)+1;
			if(num[i] % 2 == 0) {
				sum += num[i];
			}
		}
		System.out.println("짝수들의 합 : " + sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
