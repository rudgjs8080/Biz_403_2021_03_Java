package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;

/*
 * 1. ScoreServiceImplV1을 상속받고
 * 2. inputScore() method를 작성
 * 3. 학번, 학생이름, 3과목 성적을 입력받아
 * 		List<ScoreVO> scoreList 객체에 추가
 */
public class ScoreServiceImplV2 extends ScoreServiceImplV1{

	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	
	public ScoreServiceImplV2() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}
	
	@Override
	public void inputScore() {
		
		
		Integer intNum = inService.inputValue("학번", 1);
		if(intNum == null) {
			return;
		}
		
		String strNum = String.format("2021%03d", intNum);
		
		String strName = null;
		while(true) {
			System.out.println(strNum + " 학생의 이름 입력(QUIT : 입력취소)");
			System.out.print(" >> ");
			strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				break;
			}else if(strName.equals("")) {
				System.out.println("학생이름을 반드시 입력해주세요");
				continue;
			}
			break;
//			return strName; ??
		}
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			return;
		}
		
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			return;
		}
		
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			return;
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		
		scoreList.add(scoreVO);
		
		
	}

	@Override
	public void printScore() {
		
		
		
		
		
	}
	
}
