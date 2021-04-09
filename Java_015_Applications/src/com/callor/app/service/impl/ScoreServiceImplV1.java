package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
/*
 * 1. 다음 interface를 impl 하여 ScoreServiceImplV1을
 * 		생성하고 각 method를 구현
 * 		public interface ScoreService {
 * 			public void selectMenu();
 * 			public void inputScore();
 * 			public String inputName();
 * 			public void printScore();
 * }
 * 2. List<ScoreVO> scoreList 객체를 생성하고
 * 3. 학생 5명의 학번, 이름, 성적을 입력받아 scoreList에 추가
 */
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	protected Scanner scan;
	List<ScoreVO> scoreList;
	ScoreVO vo = new ScoreVO();

	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();

	}

	public void selectMenu() {
		// TODO seleMenu
		Integer intMenu = null;
		while (true) {
			System.out.println("=".repeat(60));
			System.out.println("성적 입력 시스템");
			System.out.println("=".repeat(60));
			System.out.println("1. 학생별 성적 입력");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("QUIT : 업무 종료");
			System.out.println("-".repeat(60));
			System.out.print("업무 선택 >>");
			String strMenu = scan.nextLine();
			if (strMenu.trim().equals("QUIT")) {
				System.out.println("업무를 종료하셨습니다" + "\n");

				break;
			}
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("업무 선택을 잘못하셨습니다!" + "\n");
				continue;
			}
			if (intMenu == 1) {
				this.inputName();
			} else if (intMenu == 2) {
				this.printScore();
			} else if (intMenu > 2 || intMenu < 1) {
				System.out.println("업무 선택을 잘못하셨습니다!!" + "\n");
				continue;
			}
		}
	}

	public String inputName() {
		// TODO inputName
		vo = new ScoreVO();
		String name = null;
		while (true) {
			System.out.println("-".repeat(60));
			System.out.println("학생의 이름을 입력하세요 (입력 중단 : QUIT)");
			System.out.print(">> ");
			name = scan.nextLine();
			if (name.trim().equals("QUIT")) {
				System.out.println("업무를 종료하셨습니다" + "\n");
				return null; // 이 부분이 return 인지 break 인지 헷갈림
				// null 이 return 되면 어떻게 되는건지 모르겠음
				// while 문에서 return을 만나면 끝남
			} 
			else {
				vo.setName(name);
				this.inputScore();
			}
			return name;
				

		}

	}

	public void inputScore() {
		// TODO inputScore
		vo = new ScoreVO();
		Integer total = null;
		Integer kor = null;
		Integer eng = null;
		Integer math = null;
		
		
		
		while (true) {

			System.out.print("국어 >> ");
			String strKor = scan.nextLine();
			kor = this.test1(strKor);
			if(kor == null) {
				continue;
			}
			break;
		}

		while (true) {

			System.out.print("영어 >> ");
			String strEng = scan.nextLine();
			eng = this.test1(strEng);
			if(eng == null) {
				continue;
			}
			break;
		}
		
		while (true) {

			System.out.print("수학 >> ");
			String strMath = scan.nextLine();
			math = this.test1(strMath);
			if(math == null) {
				continue;
			}
			break;
		}

		
		vo.setKor(kor);
		vo.setEng(eng);
		vo.setMath(math);

		scoreList.add(vo);
		
		
		
		
	}
	
//
//		Integer math = null;
//		while (true) {
//			System.out.print("수학 >> ");
//			String strMath = scan.nextLine();
//			try {
//				math = Integer.valueOf(strMath);
//			} catch (NumberFormatException e) {
//				// TODO math 유효성 검사
//				System.out.println("정수값만 입력하세요" + "\n");
//				continue;
//			}
//			if (math < 0 || math > 100) {
//				System.out.println("점수는 0 ~ 100 까지 입력하세요" + "\n");
//				continue;
//			}
//
//			break;
//		}
	
		
		
	

	public void printScore() {
		// TODO printScore
		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		for (int i = 0; i < scoreList.size(); i++) {
			vo = scoreList.get(i);
			System.out.print((i + 1) + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%.2f\n", vo.getAvg());

		}

	}
	/*
	 * 입력받은 값에 대한 유효성 검사
	 */
	private Integer test1(String str) {
		Integer cla = null;
		try {
			cla = Integer.valueOf(str);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("정수값만 입력하세요" + "\n");
			return null;
		}
		if(cla < 0 || cla > 100) {
			System.out.println("점수는 0 ~ 100 까지 입력하세요" + "\n");
			return null;
		}
		return cla;
	}
	
}
