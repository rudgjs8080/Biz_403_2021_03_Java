package com.callor.score.service.impl;


import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
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
public class ScoreServiceImplV1 implements ScoreService{

	protected MenuServiceImplV1 menuService;
	protected List<ScoreVO> scoreList;
	protected InputService inService;
	
	public ScoreServiceImplV1() {
		
		inService = new InputServiceImplV1();
		
	
	}
	
	
	
	@Override
	public void selectMenu() {
		// TODO selectMenu
		
		List<String> scoreMenu = new ArrayList<String>();
		menuService = new MenuServiceImplV1("대한 고등학교 성적처리 시스템", scoreMenu);
		
		scoreMenu.add("학생정보 등록");
		scoreMenu.add("성적 등록");
		scoreMenu.add("성적정보 열기");
		scoreMenu.add("성적정보 저장");
		scoreMenu.add("성적정보 출력");
		
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("업무가 종료되었습니다");
				break;
			}
			if(menu == 1) {
				this.inputScore();
			}else if(menu == 2) {
				this.inputScore();
			} else if(menu == 3) {
				this.readScore();
			} else if(menu == 4) {
				this.saveScore();
			} else if(menu == 5) {
				this.printScore();
			}
		} // end while
		
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
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}
	
}
