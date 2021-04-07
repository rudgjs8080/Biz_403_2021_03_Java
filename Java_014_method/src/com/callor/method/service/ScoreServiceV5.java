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
public class ScoreServiceV5 {
	protected String[] subject;
	protected List<Integer> kors;
	protected List<Integer> engs;
	protected List<Integer> maths;
	protected Integer[] scores;
	protected Scanner scan;

	protected InputNumberV1A2 isService;

	public ScoreServiceV5() {
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

		}
		kors.add(scores[0]);
		engs.add(scores[1]);
		maths.add(scores[2]);

	}
	public void printScore() {
		for(int i = 0 ; i < kors.size() ; i++) {
			System.out.println("국어점수 : " +kors.get(i));
			System.out.println("영어점수 : " +engs.get(i));
			System.out.println("수학점수 : " +maths.get(i));
			
		}
		
	}
}
