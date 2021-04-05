package com.callor.method;

import com.callor.method.service.NumberServiceV7;

public class Method_10 {

	public static void main(String[] args) {
		
		NumberServiceV7 nsV7 = new NumberServiceV7();
		while(true) {
			Integer retNum = nsV7.inputScore();
			
			System.out.println("입력한 값 : " + retNum);
			
			
		}	
	}
		
	
	
}
