package com.callor.score.service.impl;

// ScoreServiceImplV1Ex
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreVO;
import com.rudgjs.standard.InputService;
import com.rudgjs.standard.impl.InputServiceImplV1;
import com.rudgjs.standard.impl.MenuServiceImplV1;

/*
 * 1. 프로젝트를 생성하고, 자신의 JDK를 추가하고
 * 		InputService, MenuService 인터페이스 사용하여 작성
 * 2. 016 project의 ScoreVO 클래스, ScoreService 인터페이스를
 * 		참조하여 VO와 interface를 작성
 * 3. ScoreService interface를 implements 하여 클래스 작성
 * 4. selectMenu() method 작성
 * 		title : 대한 고등학교 성적처리 시스템 2021
 * 		menuList
 * 		1. 학생정보 등록
 * 		2. 성적 등록
 * 		3. 성적 정보 열기
 * 		4. 성적 정보 저장
 * 		5. 성적 정보 출력
 */
public class ScoreServiceImplV1A extends ScoreServiceImplV1 {

	protected MenuServiceImplV1 menuService;
	protected List<ScoreVO> scoreList;
	protected InputService inService;

	public ScoreServiceImplV1A() {

		inService = new InputServiceImplV1();
		
		/*
		 * MenuServiceImplV1 클래스의 생성자는
		 * 두 개의 매개변수(argument, parameter)를 전달하면서
		 * 호출을 해야 한다.
		 * 첫 번째 매개변수는 프로젝트의 title
		 * 두 번째 매개변수는 업무 리스트를 담을 List형 객체
		 * title은 단순 문자열이기 때문에 바로 전달할 수 있는데
		 * List형 객체는 List 객체를 생성하고, 데이터를 add 한 후
		 * 전달해야 하므로 약간의 추가 연산 코드가 필요하다
		 * 
		 * 이럴때는 생성자 method에서 작성하지 않고
		 * 객체를 사용하는 method에서 작성하는 것이 좋다
		 */
	}

	@Override
	public void selectMenu() {
		// TODO selectMenu
		
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String> scoreMenu = new ArrayList<String>();

		scoreMenu.add("1. 학생정보 등록");
		scoreMenu.add("2. 성적 등록");
		scoreMenu.add("3. 성적정보 열기");
		scoreMenu.add("4. 성적정보 저장");
		scoreMenu.add("5. 성적정보 출력");
		
		menuService = new MenuServiceImplV1(title, scoreMenu);

		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("업무가 종료되었습니다");
				break;
			}
			
			
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.inputScore();
			} else if (menu == 3) {
				this.readScore();
			} else if (menu == 4) {
				this.saveScore();
			} else if (menu == 5) {
				this.printScore();
			}
		} // end while

	}

	
}
