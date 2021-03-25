package com.callor.apps;

import com.callor.apps.service.EvenServiceV1;
import com.callor.apps.service.EvenServiceV1A;
import com.callor.apps.service.EvenServiceV1A2;


public class App_05 {

	public static void main(String[] args) {

		EvenServiceV1 esV1 = new EvenServiceV1();
		
		esV1.makeNum();
		esV1.printNum();
		
		System.out.println("-------------------");
		
		EvenServiceV1A esV1A = new EvenServiceV1A();
		
		esV1A.makeNums();
		esV1A.printEven();
		esV1A.sumEven();
		
		System.out.println("-------------------");
		
		EvenServiceV1A2 esV1A2 = new EvenServiceV1A2();
		
		esV1A2.makeNums();
		esV1A2.printEven();
		esV1A2.sumEven();
		
				
	
		
	}

}
