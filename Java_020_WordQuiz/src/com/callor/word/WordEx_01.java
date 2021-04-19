package com.callor.word;

import com.callor.word.service.impl.WordServiceImplV1;

public class WordEx_01 {

	public static void main(String[] args) {
		WordServiceImplV1 wsV1 = new WordServiceImplV1();
		for(int i = 0 ; i < 10 ; i++) {
			wsV1.startGame();
		}
		
	}

}
