package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV2A;

public class Score_02A {

	public static void main(String[] args) {
		ScoreService ssV1 = new ScoreServiceImplV2A();
		
		ssV1.selectMenu();
		
	}

}
