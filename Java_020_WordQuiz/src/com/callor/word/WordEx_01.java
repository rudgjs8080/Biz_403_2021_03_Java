package com.callor.word;

import com.callor.word.service.WordService;
import com.callor.word.service.impl.WordServiceImplV2;

public class WordEx_01 {

	public static void main(String[] args) {
		WordService wsV1 = new WordServiceImplV2();
		
			wsV1.startGame();
		
		
	}

}
