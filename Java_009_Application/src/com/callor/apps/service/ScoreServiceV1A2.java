package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1A2 {

	Scanner scan;

	public ScoreServiceV1A2() {

		scan = new Scanner(System.in);

	}

	/*
	 * this(현재객체, 현재클래스) 같은 클래스내에 있는 코드
	 */
	public void makeScores() {

		/*
		 * method return type이 void가 아닌 경우에는 method가 return한 값을 변수에 저장(받기)할 수 있다 이때 변수는
		 * method의 return type과 같은 type(형)이어야한다
		 */
		System.out.println("국어점수 입력");
		Integer intKor = this.inputScore();

		System.out.println("영어점수 입력");
		Integer intEng = this.inputScore();

		System.out.println("수학점수 입력");
		Integer intMath = this.inputScore();

		System.out.println("=========================");
		System.out.printf("국어점수 : %d", intKor);
		System.out.printf("영어점수 : %d", intEng);
		System.out.printf("수학점수 : %d\n", intMath);
		System.out.println("=========================");

	}

	private Integer inputScore() {

		Integer score = 0;
		while (true) {
			System.out.println("점수를 입력하세요 (0~100)");
			score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("점수는 0 ~ 100 까지만 입력해야 합니다");
				continue; // continue 를 만나면 무조건 while 시작점으로 돌아간다
			}
			break;
		}
		// score 변수에 저장된 값을 호출한 곳으로 되돌려 주어라
		return score;

	}

}
