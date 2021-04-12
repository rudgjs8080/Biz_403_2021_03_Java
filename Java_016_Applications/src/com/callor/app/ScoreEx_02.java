package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV2A;

public class ScoreEx_02 {

	public static void main(String[] args) {

		ScoreService sService = new ScoreServiceImplV2A();
		
		sService.selectMenu();
		
	}

}
