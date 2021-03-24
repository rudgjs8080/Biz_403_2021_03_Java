package com.callor.apps;

import com.callor.apps.service.ScoreService;

public class ScoreEx_02 {

	public static void main(String[] args) {

		// 한번 선언하고 코딩된 클래스는
		// 어디에서든지 인스턴스로 생성하면 
		// 클래스에 만들어진 코드를 호출하여 
		// 명령을 수행할 수 있다
		
		ScoreService sService = new ScoreService();
		// ScoreService 클래스의 makeScore() 메서드를 호출하라
		
		sService.makeScore();
		sService.printScore();
		
		ScoreService sSv1 = new ScoreService();
		sSv1.makeScore();
		sSv1.printScore();
		
		ScoreService sSv2 = new ScoreService();
		sSv2.makeScore();
		sSv2.printScore();
		
		
		
		
		
		
		
		
		
		
		
	}

}
