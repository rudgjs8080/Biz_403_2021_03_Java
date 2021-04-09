package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

/*
 * 1. ScoreServiceImplV1을 상속받고
 * 2. inputScore() method를 재정의
 * 3. 학생의 학번을 입력 받을 때 이미 입력된(추가된) 학생일 경우
 * 4. 이미 입력된 학생임을 메시지로 보여주고 다시 입력 받는다
 * 5. 학생이름, 성적등은 V1과 같다
 */
public class ScoreServiceImplV2A extends ScoreServiceImplV1A {

	/*
	 * scoreList에 성적정보를 추가 할때 학번을 입력받을텐데 
	 * 이미 등록된 학번 정보가 있으면 
	 * 그 학번은 추가하지 못하도록 하는 코드
	 * V1의 inputNum() method를 재정의한다 V1의 inputNum() method를 
	 * 재정의 하기 위하여 private를
	 * protected로 변경했다
	 */
	@Override
	protected String inputNum() {
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null) {
				return null;
			}

			String strNum = String.format("2021%03d", intNum);

			/*
			 * 생성한 strNum에 저장된 학번이 scoreList에 있는지 확인
			 * 
			 */

			int index = 0;
			for (index = 0; index < scoreList.size(); index++) {
				ScoreVO vo = scoreList.get(index);
				if (vo.getNum().equals(strNum)) {
					break;
				}
			}
			if (index < scoreList.size()) {
				System.out.println(strNum + "는 이미 등록되어 있음");
				continue;
				// 다시 입력받으러 가기
			}
			return strNum;
		}

	} // while end

}
