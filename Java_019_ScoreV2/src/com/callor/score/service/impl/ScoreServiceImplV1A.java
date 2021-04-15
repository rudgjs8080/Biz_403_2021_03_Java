package com.callor.score.service.impl;
/*
 * 1. ScoreService 인터페이스를 implements하여 클래스 작성
 * 2. insertScore() method에서
 * 		학번, 국어, 영어, 수학 점수를 입력 받아
 * 		List<ScoreVO> scoreList에 추가
 * 3. 학번은 00001 형식으로 5자리로 변환하여 추가
 * 4. 한번 입력된 학번의 점수는 다시 입력할 수 없음
 * 5. printScore() 등 코드는 임의로 작성
 * 6. 학번을 입력 받은 후 scoreList에 저장된 데이터가
 * 		아닌 것이 확인되면  studentList에 저장된 데이터 인지 확인
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentServcie;
import com.rudgjs.standard.InputService;
import com.rudgjs.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1A implements ScoreService {
	protected InputService inService;
	protected StudentServcie stService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	public ScoreServiceImplV1A() {
		inService = new InputServiceImplV1();
		stService = new StudentServiceImplV1A();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);

	}
	/*
	 * 학번 입력하면
	 * scoreList에 같은 학번의 성적이 있는지 확인하여
	 * 있으면 저장이 안되게
	 * 이미 있으면 다시 학번을 입력하도록 해야 한다
	 */
	@Override
	public void insertScore() {
		// TODO 성적입력
		
		// 유효성 검사가 끝난 후 학번을 가지고
		// VO에 담아야 하기 때문에 while() 전에 선언
		String strNum = null;
		while(true) {
			Integer intNum = inService.inputValue("학번",1);
			if(intNum == null) {
				return;
			}
			
			// 00001 형식으로 학번 변환(생성)
			strNum = String.format("%05d", intNum);
			
			// 이미 등록된 학번인가를 검사
			ScoreVO scoreVO = this.numCheck(strNum);
			if(scoreVO != null) {
				continue;
			}
		
			/*여기에 도달하면
			 * 		학번에 해당하는 점수가 List에 없다
			 * 학생정보에 등록된 학번이가를 검사하여
			 * 학생정보에 없으면 다시 학번을 입력받고
			 * 있으면 점수를 입력하도록 break;
			 */
			StudentVO stVO= stService.getStudent(strNum);
			if(stVO == null) {
				System.out.println("학적부에 없는 학생입니다");
				System.out.println("학번을 다시 입력해주세요");
				continue;
			}
			// 여기에 도달하면 학적부에 있는 학번이다
			System.out.println("=".repeat(30));
			System.out.printf("학번:%s\n", stVO.getNum());
			System.out.printf("이름:%s\n", stVO.getName());
			System.out.printf("학과:%s\n", stVO.getDept());
			System.out.printf("학년:%s\n", stVO.getGrade());
			System.out.printf("주소:%s\n", stVO.getAddress());
			System.out.println("=".repeat(30));
			System.out.println("학생정보가 맞습니까 ?");
			System.out.println("맞으면 : Enter, 틀리면 : NO");
			System.out.print(">> ");
			String yesNo = scan.nextLine();
			if( yesNo.equals("NO") ) {
				continue;
			}
			break;
		} // 학번 입력 끝
			
			
			// 성적입력 부분..
			Integer intKor = null;
			intKor = inService.inputValue("국어", 0, 100);
			if(intKor == null) {
				return;
			}
			
			// 위에 담겨 있던 데이터는 clear되고
			// 새로운 scoreVO가 생성된다
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum(strNum);
			scoreVO.setKor(intKor);
			scoreList.add(scoreVO);
			
		}// end insertScore()
		
	// 파라메터로 전달받은 학번이 scoreList에 있는지 검사
	// 있으면 scoreVO를 return
	// 없으면 null을 return
	protected ScoreVO numCheck(String num) {
		for(ScoreVO vo : scoreList) {
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
		
		return null;
	}

	@Override
	public void loadService() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

	}

}
