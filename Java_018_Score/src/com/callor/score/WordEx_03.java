package com.callor.score;

import com.callor.score.service.WordService;
import com.callor.score.service.impl.WordServiceImplV3;

public class WordEx_03 {

	public static void main(String[] args) {

WordService wService = new WordServiceImplV3();
		
		wService.viewWord();
		
		
	}

}
