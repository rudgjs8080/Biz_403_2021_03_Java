package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{

	List<ScoreVO> scoreList;
	Scanner scan;
	
	public ScoreServiceImplV1() {

	scoreList = new ArrayList<ScoreVO>();
	scan = new Scanner(System.in);
	
	}
	
	
	@Override
	public void insertScore() {
		// TODO Auto-generated method stub
		String strNum = null;
		while(true) {
			System.out.println("학번을 입력하세요 (입력취소 : QUIT)");
			System.out.print(" >>");
			 strNum = scan.nextLine();
			if(strNum.equals("QUIT")) {
				System.out.println("입력취소");
				return;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("정수형으로 입력해주세요");
				continue;
			}
			strNum = String.format("%05d", intNum);
			break;
		}
		
		System.out.print(">> 국어 : ");
		String strKor = scan.nextLine();
		Integer intKor = null;
		try {
			intKor = Integer.valueOf(strKor);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("정수형으로 입력해주세요");
		}
		
		System.out.print(">> 영어 : ");
		String strEng = scan.nextLine();
		Integer intEng = null;
		try {
			intEng = Integer.valueOf(strEng);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("정수형으로 입력해주세요");
		}
		
		System.out.print(">>  수학: ");
		String strMath = scan.nextLine();
		Integer intMath = null;
		try {
			intMath = Integer.valueOf(strMath);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("정수형으로 입력해주세요");
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setNum(strNum);
		vo.setKor(intKor);
		vo.setEng(intEng);
		vo.setMath(intMath);
		scoreList.add(vo);
		this.printStudent();
	}

	@Override
	public void loadService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		System.out.print("학번\t국어\t영어\t수학\n");
		System.out.println("=".repeat(60));
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO vo = new ScoreVO();
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\n");
			
		}
		
		
	}
	
	 
}
