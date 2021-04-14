package com.callor.score.service.impl;

import java.util.Arrays;
import java.util.Random;

import com.callor.score.model.WordVO;

public class WordServiceImplV3 extends WordServiceImplV1A {

	@Override
	public void viewWord() {
		int score = 5;
		
		while (true) {
			
			String strWords1 = this.makeWords();
			System.out.println("=".repeat(50));
			System.out.println("영단어 맞추기 Game(Game 설명은 1번을 누르세요)");
			System.out.println("게임을 시작하시려면 아무거나 누르고 Enter를 누르세요");
			System.out.print(" >>");
			String strM = scan.nextLine();
			if(strM.equals("1")) {
				this.rules();
				continue;
			}
			
			
		}

	}
	
	public void rules() {
		System.out.println("-".repeat(50));
		System.out.println("시작할 때 목숨 5개를 가집니다");
		System.out.println("맞추면 목숨 1개를 얻고 틀리면 1개를 잃습니다");
		System.out.println("목숨 5개를 모두 잃으면 게임은 끝이납니다");
		System.out.println("-".repeat(50));
	}
	private String makeWords() {
		Random rd = new Random();

		WordVO word = this.getWord();
		String strEng = word.getEnglish();

		return strEng;

		
	}
}
