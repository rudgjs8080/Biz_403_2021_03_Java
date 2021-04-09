package com.callor.app.service.impl;
/*
 * V2A는 V1A를 상속받고
 * V3는 V2A를 상속받고
 * V3는 V1A를 상속받고 V2A의 재정의된 inputNum()를
 * 상속받는 효과가 된다
 * 즉 V3는 V1A에 구현된 객체, 변수, method를 모두 그대로 물려받으면서
 * V2A에서 새롭게 작성한 inputNum()를 상속받아서 사용하고 있다
 */
public class ScoreServiceImpleV3 extends ScoreServiceImplV2A{

	@Override
	public void selectMenu() {
		while(true) {
			System.out.println("금호고등학교 성적처리 V3");
			System.out.println("=".repeat(50));
			System.out.println("1. 성적등록");
			System.out.println("2. 성적리스트 출력");
			System.out.println("3. 성적 파일에 저장");
			System.out.println("QUIT : 업무종료");
			String strM = scan.nextLine();
			if(strM.equals("QUIT")) {
				break;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.println("메뉴는 0 ~ 2까지만 선택, 종료 : QUIT");
				continue;
			}
			if(intM == 1) {
				this.inputScore();
			}else if(intM ==3) {
				this.printScore();
			}else if(intM == 3) {
				// 파일에 저장
				this.scoreToFile();
			}
		}
		System.out.println("업무 종료!!");
	}
	// 입력된 성적리스트를 파일에 저장하기
	protected void scoreToFile() {
		
		
		
	}
	
	
	
	
	
	
	
	
}
