package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV2;

public class Score_02 {

	public static void main(String[] args) {

		ScoreService ssV1 = new ScoreServiceImplV2();
		
		ssV1.selectMenu();
		
	}

}
