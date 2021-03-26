package com.callor.apps.service;

import java.util.Scanner;

/*
 * 1. 5명 학생의 국어, 영어, 수학 점수를 저장할 배열 생성
 * 2. 키보드를 이용하여 5명 학생의 국어, 영어, 수학 점수를 입력 받고 배열에 저장
 * 3. 학생 별 총점, 평균을 계산하고 성적 리스트를 출력
 */
public class ScoreServiceV1 {
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int n = 0;
	int scoreSum;
	float scoreAvg;
	Scanner scan = new Scanner(System.in);

	public ScoreServiceV1(int numbers) {
		n = numbers;
		intKor = new int[n];
		intEng = new int[n];
		intMath = new int[n];

	}

	public void inputKor() {
		System.out.println(LinesService.dLines(65));
		System.out.println("1번부터 " + n +"번까지 학생의 국어점수를 순서대로 입력해주세요(0~100점)");
		System.out.println(LinesService.sLines(65));
		for (int i = 0; i < n; i++) {
			System.out.print("학생 " + (i + 1) + "의 국어점수");
			intKor[i] = scan.nextInt();
			if(intKor[i] > 100 || intKor[i] < 0) {
				System.out.println("입력하신 점수를 다시 한 번 확인해주세요");
				i--;
			} 
		}
	}

	public void inputEng() {
		System.out.println(LinesService.dLines(65));
		System.out.println("1번부터 " + n +"번까지 학생의 국어점수를 순서대로 입력해주세요(0~100점)");
		System.out.println(LinesService.sLines(65));
		for (int i = 0; i < n; i++) {
			System.out.print("학생 " + (i + 1) + "의 영어점수");
			intEng[i] = scan.nextInt();
			if(intEng[i] > 100 || intEng[i] < 0) {
				System.out.println("입력하신 점수를 다시 한 번 확인해주세요");
				i--;
			} 
		}
	}

	public void inputMath() {
		System.out.println(LinesService.dLines(65));
		System.out.println("1번부터 " + n +"번까지 학생의 국어점수를 순서대로 입력해주세요(0~100점)");
		System.out.println(LinesService.sLines(65));
		for (int i = 0; i < n; i++) {
			System.out.print("학생 " + (i + 1) + "의 수학점수");
			intMath[i] = scan.nextInt();
			if(intMath[i] > 100 || intMath[i] < 0) {
				System.out.println("입력하신 점수를 다시 한 번 확인해주세요");
				i--;
			}
		}
	}

	public void printScore() {
		System.out.println(LinesService.dLines(65));

		for (int i = 0; i < n; i++) {
			scoreSum = intKor[i] + intEng[i] + intMath[i];
			scoreAvg = (float) (intKor[i] + intEng[i] + intMath[i]) / 3f;
			System.out.printf("%2d번 학생의 국어점수 : %3d  영어점수 : %3d 수학점수 : %3d 총점 : %3d 평균 : %3.2f\n", i + 1, intKor[i],
					intEng[i], intMath[i], scoreSum, scoreAvg);
		}
		System.out.println(LinesService.dLines(65));
	}

}
