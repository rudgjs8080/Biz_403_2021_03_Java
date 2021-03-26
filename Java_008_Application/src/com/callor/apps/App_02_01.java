package com.callor.apps;
/*
 * 학생의 국어 영어 수학 점수를 순서대로 입력할 수 있게 새로 만들었는데
 * 유효성 검사를 할 수가 없다
 * 고민해봐야할 부분이다
 */
import com.callor.apps.service.ScoreServiceV101;

public class App_02_01 {

	public static void main(String[] args) {
		
		ScoreServiceV101 ssV1 = new ScoreServiceV101(5);
		
		ssV1.inputScore();
		ssV1.printScore();
		
		
	}
	
	
}
