package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_02 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1(3);
		
		ssV1.inputKor();
		ssV1.inputEng();
		ssV1.inputMath();
		ssV1.printScore();
		
		
		
	}

}
