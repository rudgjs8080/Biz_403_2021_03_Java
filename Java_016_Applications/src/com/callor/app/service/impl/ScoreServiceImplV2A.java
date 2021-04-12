package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.Values;
import com.rudgjs.standard.InputService;
import com.rudgjs.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV2A extends ScoreServiceImplV2 {

	protected Scanner scan;
	protected InputService inService;
	protected List<ScoreVO> scoreList;
	protected String[] subjectList;
	protected Integer[] subScoreList;

	// 과목명, 과목점수가 담긴 배열에 대한 위치를
	// 숫자로 사용하지 않고 명명된 이름으로 사용하기 위하여
	// 배열의 Index 값을 상수로 선언해 둔다
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV2A() {

		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		subjectList = new String[] { "국어", "영어", "수학" };
		subScoreList = new Integer[subjectList.length];

	}

	@Override // Alt + Shift + s
	public void inputScore() {

		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		// 2021001 형식
		String strNum = String.format("2021%03d", intNum);

		String strName = null;
		while (true) {
			System.out.println(strNum + "학생의 이름 입력 (QUIT : 입력중단)");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("학생이름을 반드시 입력하세요");
				continue;
			}
			break;
		}
		// 각 과목의 점수를 별도로 입력받아 변수에 저장하는것 대신
		// 배열을 사용하여 입력받을 과목명을 배열변수로 선언하고
		// 과목수 만큼 점수를 저장할 배열을 선언
		// String[] subject = {"국어","영어","수학"};
		// Integer[] intScore = new Integer[subject.length];
		// 배열을 멤버영역으로 이동

		for (int i = 0; i < subjectList.length; i++) {
			subScoreList[i] = inService.inputValue(subjectList[i], 0, 100);
			if (subScoreList[i] == null) {
				return;
			}
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setEng(subScoreList[영어]);
		scoreVO.setMath(subScoreList[수학]);

		scoreVO.setKor(subScoreList[Values.국어]);
		scoreVO.setEng(subScoreList[Values.영어]);
		scoreVO.setMath(subScoreList[Values.수학]);

		System.out.println("=".repeat(50));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(50));
		scoreList.add(scoreVO);

	}

	@Override
	public void printScore() {
		System.out.println("금호고교 성적리스트 2021");
		System.out.println("=".repeat(80));
		System.out.print("학번\t");
		System.out.print("이름\t");
		for (int index = 0; index < subjectList.length; index++) {
			System.out.print(subjectList[index] + "\t");
		}
		System.out.print("총점\t");
		System.out.println("평균");
		System.out.println();
		System.out.println("-".repeat(80));

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(80));

	}

	@Override
	public void saveScore() {

		while (true) {
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.print(" >> ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일이름을 입력해야 합니다");
				continue;
			}
			FileWriter fileWriter = null;
			PrintWriter out = null;

			strFileName = "" + strFileName;
			strFileName = "src/com/callor/app/" + strFileName + ".txt";
			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);

				int nSize = scoreList.size();
				/*
				 * 파일에 저장할때 각 데이터를 콤마(,)로 구분하여 입력하고 파일의 확장자를 
				 * csv로 저장하면 excel 에서 파일을 읽을 수 있다 
				 * csv : comma-separated-variables
				 */
				for (int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum() + ",");
					out.print(vo.getName() + ",");
					out.print(vo.getKor() + ",");
					out.print(vo.getEng() + ",");
					out.println(vo.getMath());
				}
				out.flush();
				out.close();

			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다");
				System.out.println("파일 이름을 다시 입력해주세요");
				continue;
			}
			return;
		}

	}

}
