package com.callor.classes.service;

public class ValueService {

	public int retNum;
	
	public void nums() {
		
		//nums method는 어떤 연산을 수행하고
		// 그 결과 값인 100을 호출한 곳에 return 하고 싶다
		// void method에서는 값을 return 할 수 없다
		// 멤버 변수를 선언하고 멤버변수에 값을 저장해 두었다
		
		retNum = 100;
	}
	
	public Integer numsRet() {
		return 100;
	}
	
	
	
	
	
	
	
}
