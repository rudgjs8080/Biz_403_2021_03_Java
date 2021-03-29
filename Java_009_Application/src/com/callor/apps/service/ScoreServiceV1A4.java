package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1A4 {

	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	Scanner scan;

	public ScoreServiceV1A4(int members) {

		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };

		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];

	}

	/*
	 * 점수를 입력받을 과목명을 배열로 만들어 두고 과목명 문자열을 inputScore()에 전달하여 3과목의 점수를 입력받는 코드로 작성
	 */
	public void makeScores() {

		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d 번 학생의 성적을 입력\n", i + 1);
			intKor[i] = this.inputScore(subject[0]);
			intEng[i] = this.inputScore(subject[1]);
			intMath[i] = this.inputScore(subject[2]);

		}

	}

	private Integer inputScore(String sub) {

		Integer score = 0;
		while (true) {
			System.out.println(sub + "점수를 입력하세요");
			System.out.print(">> ");
			score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println(sub + "점수는 0 ~ 100 까지만 입력!");
				continue;
			}
			break;

		}

		return score;
	}

}
