package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
public class ScoreServiceImplV2A extends ScoreServiceImplV1{

	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected String[] subjectList;
	protected Integer[] subScoreList;
	
	protected static final int 국어 = 0;
	protected static final int 영어 = 1;
	protected static final int 수학 = 2;
	
	public ScoreServiceImplV2A() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		subjectList = new String[] {"국어", "영어", "수학"};
		subScoreList = new Integer[subjectList.length];
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
				return;
			}else if(strName.equals("")) {
				System.out.println("학생이름을 반드시 입력해주세요");
				continue;
			}
			break;
//			return strName; ??
		}
		
		for(int i = 0 ; i < subjectList.length ; i++) {
			String subject = subjectList[i] + "점수";
			Integer intScore = inService.inputValue(subject,0,100);
			if(intScore == null) {
				return;
			}
			subScoreList[i] = intScore;
		}
	
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setEng(subScoreList[영어]);
		scoreVO.setMath(subScoreList[수학]);
		
		scoreList.add(scoreVO);
		
		
	}

	@Override
	public void printScore() {
		
		System.out.println("=".repeat(60));
		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("=".repeat(60));
		
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
			
		}
		System.out.println("=".repeat(60));
	}// end printScore

	@Override
	public void saveScore() {
		String fileName = null;
		while(true) {
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.println(" >> ");
			fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("파일이름을 반드시 입력해주세요");
				continue;
			}
			break;
		}
		String strFileName = "src/com/callor/score" + fileName;
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);
			
			int nSize = scoreList.size();
			for(int i = 0 ; i < nSize ; i++) {
				ScoreVO vo = scoreList.get(i);
				
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n",vo.getAvg());
			}
			
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
