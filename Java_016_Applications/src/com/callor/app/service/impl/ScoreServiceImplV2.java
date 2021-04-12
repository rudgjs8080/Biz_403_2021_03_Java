package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.rudgjs.standard.InputService;
import com.rudgjs.standard.MenuService;
import com.rudgjs.standard.impl.InputServiceImplV1;
import com.rudgjs.standard.impl.MenuServiceImplV1;



public class ScoreServiceImplV2 implements ScoreService{

	protected MenuService menuService;
	protected List<ScoreVO>scoreList;
	protected InputService inService;
	
	@Override
	public void selectMenu() {
		
		/*
		 * 보통 멤버변수(클래스영역에 선언된 변수들) 객체는
		 * 이 클래스의 생성자에서 만드는 것이 좋다
		 * 
		 * 하지만 
		 * 객체를 생성할 때 전달해야할 매개변수(파라메터)에 대하여
		 * 수행해야할 연산코드가 있을 경우는 
		 * 객체를 사용하기 전에 객체를 생성하는 코드를 
		 * 작성하여도 된다
		 */
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적 입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");
		
		menuService = new MenuServiceImplV1("빛고을 고교 성적처리",scoreMenu);
		inService = new InputServiceImplV1();
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("업무 종료");
				break;
			}
			if(menu == 1) {
				this.inputScore();
			}else if(menu ==2) {
				this.printScore();
			}else if(menu == 3) {
				this.saveScore();
			}
			
		}
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		// 학번입력, 이름입력, 과목별 성적 입력
		// ScoreVO 객체에 담고, List에 추가
		// = ScoreVO 클래스를 사용하여 생성한 scoreVO 객체에 담고 라는 의미
		//		= scoreVO에 담고
		
		Integer intNum = inService.inputValue("학번", 1);
		
		if(intNum == null) {
			return;
		}
		
		String strNum = String.format("2021%03d", intNum);
		
		
		
		
		
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
