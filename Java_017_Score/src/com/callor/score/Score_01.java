package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class Score_01 {

	public static void main(String[] args) {

		ScoreService ssV1 = new ScoreServiceImplV1();
		
		ssV1.selectMenu();
		ssV1.printScore();
		ssV1.saveScore();
		
	}

}
