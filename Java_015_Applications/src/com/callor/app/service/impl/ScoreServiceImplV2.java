package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

/*
 * 1. ScoreServiceImplV1을 상속받고
 * 2. inputScore() method를 재정의
 * 3. 학생의 학번을 입력 받을 때 이미 입력된(추가된) 학생일 경우
 * 4. 이미 입력된 학생임을 메시지로 보여주고 다시 입력 받는다
 * 5. 학생이름, 성적등은 V1과 같다
 */
public class ScoreServiceImplV2 extends ScoreServiceImplV1A {

	protected String inputNum() {

		Integer intNum = inService.inputValue("학번", 1);

		if (intNum == null) {
			return null;
		}

		String strNum = String.format("2021%03d", intNum); // 2021001

		if (scoreList.size() != 0) {
			for (int i = 0; i < scoreList.size(); i++) {
				if (strNum.equals(scoreList.get(i).getNum())) {
					strNum = "-1";
				}
			}
		}

		return strNum;

	}

	public void inputScore() {

		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가

		String strNum;

		while (true) {
			strNum = inputNum();
			if (strNum == null) {
				return;
			} else if (strNum.equals("-1")) {
				System.out.println("중복된 학번입니다 다시입력해주세요");
				continue;
			} else {
				break;
			}
		}

		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if (strName == null) {
			return;
		}

		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		scoreList.add(scoreVO);

	}

}
