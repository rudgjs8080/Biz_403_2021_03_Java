package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 미완성

/*
 * 1. 과목명을 subject = {"국어","영어","수학"} 배열에 선언
 * 2. 과목의 점수를 담을 3개의 List를 선언
 * 		List<Integer> kors,
 * 		List<Integer> engs,
 * 		List<Integer> maths
 * 3. InputServiceV2의 inputValue() method를 사용하여
 * 	5명 학생의 각 과목 점수를 입력
 * 4. 입력받은 점수를 kors, engs, maths list에 add()
 * 5. printScore() method를 사용하여 성적 리스트 출력
 */
public class ScoreServiceV5A {
	protected String[] subject;
	protected List<Integer> kors;
	protected List<Integer> engs;
	protected List<Integer> maths;
	protected Integer[] scores;
	protected Scanner scan;

	protected InputNumberV1A2 isService;

	public ScoreServiceV5A() {
		subject = new String[] { "국어", "영어", "수학" };
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();

		scan = new Scanner(System.in);
		isService = new InputNumberV1A2();
		scores = new Integer[5];
	}

	public void inputScore() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < subject.length; j++) {
				Integer score = isService.inputValue(subject[j], 0, 100);
				if (score == null) {
					System.out.println("종료");
				}
				scores[j] = score;
			}
			kors.add(scores[0]);
			engs.add(scores[1]);
			maths.add(scores[2]);
		}

	}

	// TODO Ex)
	public void inputScore2() {
		for (int i = 0; i < 5; i++) {
			Integer score = isService.inputValue(subject[i], 0, 100);
			if (score == null) {
				return;
			} else if (subject[i].equals("국어")) {

			}
		}
	}

	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균\n");
		System.out.println("=".repeat(50));
		for (int index = 0; index < kors.size(); index++) {
			System.out.print(kors.get(index) + "\t");
			System.out.print(engs.get(index) + "\t");
			System.out.print(maths.get(index) + "\n");

		}
		System.out.println("=".repeat(50));
	}
}
