package com.callor.apps.service;

import java.util.Random;

/*
 * 1. 10명 학생의 국어, 영어, 수학 점수를 배열에 저장하고
 * 2. 학생들의 총점, 평균을 계산하여
 * 3. 성적리스트를 출력합니다
 * 4. ScoreServiceV1 에 method를 구현하고
 * 5. App_08 클래스의 main() method에서 호출하여 구현합니다
 */

public class ScoreServiceV2 extends ScoreServiceV1{
	
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intSum;
	float[] floatAvg;
	int intKorSum;
	int intEngSum;
	int intMathSum;
	

	public ScoreServiceV2(int members) {

		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
		intSum = new int[members];
		floatAvg = new float[members];
		intKorSum = 0;
		intEngSum = 0;
		intMathSum = 0;

	
		
	}	
	
	

}







