package com.callor.app.service.impl;
import java.util.Scanner;

/*
 * 1. ScoreService 인터페이스를 implements 하여
 * 		ScoreServiceV2 클래스를 만들고
 * 2. selectMenu() method의 코드를 구현
 * 
 */
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
	Scanner scan;
	
	
	
	
	public ScoreServiceImplV1() {

		scan = new Scanner(System.in);
		
	}
	
	public void selectMenu() {
		
		

	}

	
	public void inputScore() {
		// TODO inputScore
		
		

	}


	public void printScore() {
		// TODO Auto-generated method stub

	}

	
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	
	public void readScore() {
		// TODO Auto-generated method stub

	}


	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
