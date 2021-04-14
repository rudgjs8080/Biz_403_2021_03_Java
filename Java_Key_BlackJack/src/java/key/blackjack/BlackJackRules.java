package java.key.blackjack;

import java.util.Scanner;

public class BlackJackRules {

	Scanner scan;
	
	public BlackJackRules() {

	scan = new Scanner(System.in);
	
	}
	
	public void Rules() {
		while(true) {
			System.out.println("게임을 시작하시겠습니까(종료하시려면 QUIT을 입력하세요)");
			System.out.print(">> ");
			String strM = scan.nextLine();
			if(strM.equals("QUIT")) {
				break;
			}
			/*
			 * 카드덱에서 딜러와 플레이어가 각각 2장씩 뽑는다
			 */
			System.out.println("Player의 카드는 : ");
			while(true) {
				System.out.println("카드를 추가로 받으시겠습니까?");
				System.out.println("Yes : 1 , No : 2");
				String strM2 = scan.nextLine();
				if(strM2.equals("1")) {
					// 추가 추가한 카드 정보 저장
					// 합산 
					// 21을 초과하면 승패 정하기 승패정하고
					break;
					// 21을 넘지 않으면 다시 추가로 받을건지 물어보기
					// continue;
					
				}
				
			}
			
		}
		
	}
	

}
