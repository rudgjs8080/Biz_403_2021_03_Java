package Java.Home.Key.april.service.impl;

import java.util.Scanner;

import Java.Home.Key.april.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{
	
	
	Scanner scan;
	
	
	
	public ScoreServiceImplV1() {

	scan = new Scanner(System.in);	
		
	
	}
	
	
	@Override
	public void selectMenu() {
		// TODO selectMenu
		
		while(true) {
			System.out.println("=".repeat(60));
			System.out.println("금호고등학교 성적처리 시스템 2021");
			System.out.println("=".repeat(60));
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 성적 등록");
			System.out.println("3. 성적 정보 열기");
			System.out.println("4. 성적 정보 저장");
			System.out.println("5. 성적 정보 출력");
			System.out.println("QUIT : 종료");
			System.out.println("-".repeat(60));
			System.out.print("업무선택 : >> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				System.out.println("업무 종료");
				break;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("정수 또는 QUIT만 입력해주세요");
				continue;
			}
			if(intMenu == 1) {
				this.inputScore();
			}else if(intMenu == 2) {
				this.inputScore();
			}else if(intMenu ==3) {
				this.readScore();
			}else if(intMenu ==4) {
				this.saveScore();
			}else if(intMenu ==5) {
				this.printScore();
			}else {
				System.out.println("메뉴 선택에 오류가 있습니다 다시 입력해주세요");
				continue;
			}
		}
		
		
	}// selectMenu end

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

}
