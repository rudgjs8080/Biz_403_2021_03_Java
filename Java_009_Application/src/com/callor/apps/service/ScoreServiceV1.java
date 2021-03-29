package com.callor.apps.service;

import java.util.Scanner;

/*
 * 1. n명 학생의 국어,영어, 수학 점수를 저장할 배열 생성
 * 2. 키보드를 이용하여 n명 학생의 국어, 영어, 수학 점수를 입력받고 배열에 저장
 * 3. 각 과목의 성적은 0~100점까지 입력 가능하도록 제한
 * 4. 범위를 벗어난 점수를 입력하면 안내 메시지를 보이고 다시 입력 받기
 * 5. 학생 별 총점, 평균을 계산하고 성적 리스트를 출력
 */

/*
 * 로그인 할 수 있는 부분을 만들어보려고 했는데 막혔다
 * 구글링을 좀 더 해보면서 할 수 있을 것 같다
 */
public class ScoreServiceV1 {
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int n = 0;
	int scoreSum;
	float scoreAvg;
	Scanner scan = new Scanner(System.in);
	String id = null;
	String pw = null;

	public ScoreServiceV1(int numbers) {
		n = numbers;
		intKor = new int[n];
		intEng = new int[n];
		intMath = new int[n];

	}

//	public void logIn() {
//		System.out.println(LinesService.sLines(65));
//		System.out.println("성적 입력기를 실행하셨습니다");
//		System.out.println("ID와 PW를 입력해주시기 바랍니다");
//		for(int i = 0 ; i < n ; i++) {
//			System.out.print("ID : ");
//			id = scan.next();
//			System.out.print("PW : ");
//			pw = scan.next();
//			System.out.println();
//			if((string master) == id || (String master) == pw) {
//				
//			}
//		}

//	}

	public void inputKor() {
		System.out.println(LinesService.dLines(65));
		System.out.println("1번부터 " + n + "번까지 학생의 국어점수를 순서대로 입력해주세요(0~100점)");
		System.out.println(LinesService.sLines(65));
		for (int i = 0; i < n; i++) {
			System.out.print("학생 " + (i + 1) + "의 국어점수");
			intKor[i] = scan.nextInt();
			if (intKor[i] > 100 || intKor[i] < 0) {
				System.out.println("입력하신 점수를 다시 한 번 확인해주세요");
				i--;
			}
		}
	}

	public void inputEng() {
		System.out.println(LinesService.dLines(65));
		System.out.println("1번부터 " + n + "번까지 학생의 영어점수를 순서대로 입력해주세요(0~100점)");
		System.out.println(LinesService.sLines(65));
		for (int i = 0; i < n; i++) {
			System.out.print("학생 " + (i + 1) + "의 영어점수");
			intEng[i] = scan.nextInt();
			if (intEng[i] > 100 || intEng[i] < 0) {
				System.out.println("입력하신 점수를 다시 한 번 확인해주세요");
				i--;
			}
		}
	}

	public void inputMath() {
		System.out.println(LinesService.dLines(65));
		System.out.println("1번부터 " + n + "번까지 학생의 수학점수를 순서대로 입력해주세요(0~100점)");
		System.out.println(LinesService.sLines(65));
		for (int i = 0; i < n; i++) {
			System.out.print("학생 " + (i + 1) + "의 수학점수");
			intMath[i] = scan.nextInt();
			if (intMath[i] > 100 || intMath[i] < 0) {
				System.out.println("입력하신 점수를 다시 한 번 확인해주세요");
				i--;
			}
		}
	}

	public void printScore() {
		System.out.println(LinesService.dLines(50));
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < n; i++) {
			scoreSum = intKor[i] + intEng[i] + intMath[i];
			scoreAvg = (float) (intKor[i] + intEng[i] + intMath[i]) / 3f;
			System.out.printf("%2d번\t%3d\t%3d\t%3d\t%3d\t%3.2f\n", i + 1, intKor[i], intEng[i], intMath[i], scoreSum,
					scoreAvg);
		}
		System.out.println(LinesService.dLines(50));
	}

}
