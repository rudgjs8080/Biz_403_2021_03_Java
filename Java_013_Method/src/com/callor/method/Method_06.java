package com.callor.method;

import com.callor.method.service.NumberServiceV3;

public class Method_06 {
	public static void main(String[] args) {
		NumberServiceV3 nsV3 = new NumberServiceV3();
		while(true) {
			Integer retNum = nsV3.inputNum();
			
			if(retNum == null) {
				System.out.println(retNum);
				
			}else if(retNum < 0 || retNum > 100){
				System.out.println(retNum);
				System.out.println("1 ~ 100 까지의 정수만 입력해주세요");
			}else {
				System.out.println("입력하신 정수는 : " + retNum);
			}
		}
	}
	
}
