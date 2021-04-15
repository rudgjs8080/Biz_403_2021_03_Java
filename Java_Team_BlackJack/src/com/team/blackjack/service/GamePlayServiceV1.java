package com.team.blackjack.service;

import java.util.Scanner;

public class GamePlayServiceV1 {

	private Scanner scan;
	
	public GamePlayServiceV1() {
		
		scan = new Scanner(System.in);
	}

	public void mainMenu() {
		
		while(true) {
			RuleService ruleService = new RuleService(); 
			System.out.println("=".repeat(60));
			System.out.println("블랙잭 게임");
			System.out.println("-".repeat(60));
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 규칙");
			System.out.println("QUIT. 종료");
			System.out.println("-".repeat(60));
			System.out.print(">> ");
			String strM = scan.nextLine();
			if(strM.trim().equals("QUIT")) {
				return;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM.trim());
			} catch (NumberFormatException e) {
				System.out.println("1~2 또는 QUIT만 입력하세요");
				continue;
			}
			if(intM == 1) {
				ruleService.run();
				ruleService.showInfo();
				ruleService.playerAppendCard();
			} else if(intM == 2) {
				
			} else {
				System.out.println("1~2 또는 QUIT만 입력하세요");
				continue;
			}
		} // end while()
	}
}