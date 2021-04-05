package com.callor.method;

import com.callor.method.service.NumberServiceV2;

public class Method_04 {

	public static void main(String[] args) {
		
		NumberServiceV2 nsV2 = new NumberServiceV2();
		while(true) {
			Integer retNum = nsV2.inputNum();
			
			if(retNum == null) {
				System.out.println(retNum);
				break;
			}else {
				System.out.println("입력하신 정수 값은 " + retNum + "입니다");
			}	
		}
		

	}

}
