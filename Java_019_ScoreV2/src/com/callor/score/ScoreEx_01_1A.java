package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1_1;

public class ScoreEx_01_1A {

	public static void main(String[] args) {

		ScoreService ssV1 = new ScoreServiceImplV1_1();
		
		ssV1.insertScore();
		ssV1.printStudent();
	}

}
