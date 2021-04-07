package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/*
 * 1. 과목명을 subject = {"국어","영어","수학"} 배열에 선언
 * 2. 성적 정보를 저장할 List<ScoreVO> scoreList를 생성
 * 3. inputScore() method를 선언하고
 * 4. InputServiceV2의 inputValue() method를 사용하여
 * 		5명 학생의 각 과목의 점수를 입력
 * 5. 입력 받은 점수를 ScoreVO 객체로 생성한 후
 * 		scoreList에 add()
 */
public class ScoreServiceV6 {
	String[] subject;
	List<ScoreVO> scoreList;
	protected InputNumberV1A2 inService;
	Integer[] scores;
	
	public ScoreServiceV6() {
		
		subject = new String[] {"국어","영어","수학"};
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputNumberV1A2();
		scores = new Integer[5];
	}
	
	public void inputScore() {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < subject.length ; j++) {
				Integer score = inService.inputValue(subject[j],0,100);
				if(score == null) {
					System.out.println("종료");
				}
				scores[j] = score;
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(scores[0]);
			scoreVO.setEng(scores[1]);
			scoreVO.setMath(scores[2]);
			
			scoreList.add(scoreVO);
		}
	}
	
	public void printScore() {
		System.out.println("=".repeat(40));
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("=".repeat(40));
		for(int i = 0 ; i < scoreList.size() ; i++) {
			System.out.print((i+1)+"번\t");
			System.out.print(scoreList.get(i).getKor()+"\t");
			System.out.print(scoreList.get(i).getEng()+"\t");
			System.out.print(scoreList.get(i).getMath()+"\n");
			
		}
		System.out.println("=".repeat(40));
	}
	
}
