package com.callor.apps;


import com.callor.apps.service.ScoreServiceV1;

public class App_08 {

	public static void main(String[] args) {

		ScoreServiceV1 key = new ScoreServiceV1();
		
		
		key.makeScore();
		key.sumScore();
		key.avgScore();
		key.printScore();
		
		
		
	}

}
