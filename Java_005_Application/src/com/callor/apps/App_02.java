package com.callor.apps;
// App_01 문제 배열 형식으로 풀이한것
import java.util.Random;

public class App_02 {

	public static void main(String[] args) {

		Random rd = new Random();
		
		int[] intMembers = new int[5];
		// intMembers 의 0번째 배열에
		// 난수를 만들어 저장하라
		intMembers[0] = rd.nextInt(26)+25;
		intMembers[1] = rd.nextInt(26)+25;
		intMembers[2] = rd.nextInt(26)+25;
		intMembers[3] = rd.nextInt(26)+25;
		intMembers[4] = rd.nextInt(26)+25;
		// 배열의 개수가 5개 이므로
		// 첨자의 최대값은 4까지이다
		
		for(int i = 0; i < 5 ; i++) {
			intMembers[i] = rd.nextInt(26) +25;
		}
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("%d반 인원수 : %d\n",i+1,intMembers[i]);
			
		}
		for(int i = 0 ; i < 5 ; i++) {
			int intPizzaBox = intMembers[i] / 6;
			if(intMembers[i] % (intPizzaBox * 6) > 0) {
				intPizzaBox++;
			}
			System.out.printf("%d반7 인원수 : %d, 피자주문 : %d\n",(i+1),intMembers[i],intPizzaBox);
		}	
		
		
		
		
		
		
		
		
	}

}
