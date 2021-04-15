package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1A;

public class ScoreEx_01A {

	public static void main(String[] args) {

		ScoreService ssV1 = new ScoreServiceImplV1A();
		
		ssV1.insertScore();
	}

}
