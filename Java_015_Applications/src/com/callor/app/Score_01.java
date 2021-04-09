package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1;

public class Score_01 {

	public static void main(String[] args) {

		ScoreService ssV1 = new ScoreServiceImplV1();
		
		ssV1.selectMenu();
		
	}

}
