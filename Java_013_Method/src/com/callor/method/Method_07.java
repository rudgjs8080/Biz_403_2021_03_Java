package com.callor.method;

import com.callor.method.service.NumberServiceV3A2;

public class Method_07 {
	public static void main(String[] args) {
	
		
		NumberServiceV3A2 nsV3A2 = new NumberServiceV3A2();
		while(true) {
			Integer retNum = nsV3A2.inputNum();
			
			if(retNum == null) {
				System.out.println("입력을 중단하셨습니다");
				break;
			} else {
				System.out.println("입력하신 숫자는 : " + retNum);
			}	
		}
		
		
	}
	
	
	
}
