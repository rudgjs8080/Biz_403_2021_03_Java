package com.team.blackjack.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.team.blackjack.model.CardVO;
import com.team.blackjack.model.Dealer;
import com.team.blackjack.model.MoneyVO;
import com.team.blackjack.model.Player;
import com.team.blackjack.model.User;
import com.team.blackjack.service.CardDeck;
import com.team.blackjack.service.GameInterface;

// 보유카드패   : player.viewCard(); 또는 dealer.viewCard();
// 보유카드점수 : player.getScore(); 또는 dealer.getScore();

public class GameImplV1_2 implements GameInterface {

	protected CardDeck deck;
	protected User player;
	protected User dealer;
	protected MoneyVO gameMoney;
	String batting; // 배팅금
	
	protected Scanner scan;
	List<MoneyVO> moneyList;
	MoneyVO vo;
	Integer intMoney;

	public GameImplV1_2() {

		deck = new CardDeck();
		player = new Player();
		dealer = new Dealer();
		gameMoney = new MoneyVO();
		batting = null; // Scanner로 배팅금 입력받기
		
		scan = new Scanner(System.in);
		moneyList = new ArrayList<MoneyVO>();
		vo = new MoneyVO();
		intMoney = 0;

	}

	@Override
	public void run() {
		// TODO

	}

	@Override
	public void selectMenu() {
//      int cash = pMoney-gameMoney.getMoney();
//      moneyList.add(gameMoney);
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("1. 게임시작");
			System.out.println("QUIT. 게임종료");
			System.out.println("=".repeat(50));
			System.out.print("입력>> ");
			String strInput = scan.nextLine();
			if (strInput.equals("QUIT")) {
				System.out.println("게임을 종료하셨습니다");
				return;
			} else if (strInput.equals("1")) {
//				System.out.printf("플레이어 재산 : %d\n", pMoney);
//				System.out.println("플레이어 배팅금 : " + gameMoney.getMoney());
//				System.out.printf("배팅후 잔액 : %d\n", cash);
				this.batting();
			}
		}
//           gameMoney.setMoney(cash);
	}

	public void batting() {
		
		while (true) {
			System.out.println("배팅금을 입력하세요");
			System.out.print(">> ");
			batting = scan.nextLine();
			if (batting.trim().equals("")) {
				break;
			}
			try {
				intMoney = Integer.valueOf(batting);
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요");
				continue;
			}
			if (intMoney > 0) {
				break;
			} else if (intMoney <= 0) {
				System.out.println("배팅금은 1000원 이상 입력하세요");
				continue;
			} else {

			}
			return;
		}
		
		vo.setMoney(-intMoney);
		moneyList.add(vo);
		this.cardDraw(player, 2);
		this.cardDraw(dealer, 2);
	}

	@Override
	public void cardDraw(User name, int count) {
		// TODO 카드 나눠주기(줄사람, 몇장)
		for (int i = 0; i < count; i++) {
			CardVO card = deck.drawCard();
			name.receiveCard(card);
			
		}
	}

//	@Override
//	public void goStay() {
//		// TODO
//
//	}

	public Integer goStay() {
		// TODO 처음에 2장씩 카드 배분 후 user turn에 맞게 this.goStay 사용
		Scanner scan = new Scanner(System.in);
		System.out.println("카드를 한장더 받으시려면 1번, 그만 받으시려면 2번을 입력하세요.");
		while (true) {
			System.out.print("1 or 2  >> ");
			String goStay = scan.nextLine();

			if (goStay.equals("1")) {
				this.cardDraw(player, 1);
				return 1;
			} else if (goStay.equals("2")) {
				return 2;
			} else {
				System.out.println("1 또는 2만 입력 가능합니다. 다시 입력하세요.");
				continue;
			}
		}
	}

	@Override
	public Integer rule() {
		// TODO
		int playerScore = 0; // 플레이어 총점
		int dealerScore = 0; // 딜러 총점
		
		playerScore = player.getScore();
		
		dealerScore = dealer.getScore();
		
		if(playerScore < 17) {
			System.out.println("카드의 총점은 17이상이어야 합니다.");
			System.out.println("카드를 한장 더 뽑습니다.");
			this.cardDraw(player, 1);
			
		}
		
		if(dealerScore < 17) {
			this.cardDraw(dealer, 1);
		}
		return null;
	}

	@Override
	public void printResult() {
		// TODO
		int pScore = 0;
		int dScore = 0;
		String input;
		

		pScore = player.getScore();
		dScore = dealer.getScore();

		if (pScore > 21 || pScore < dScore) {
			System.out.println("플레이어님이 패배하셨습니다");
			
			return;
		} else if (dScore > 21 || dScore < pScore) {
			System.out.println("딜러 Lose.. 플레이어 Win");
			vo.setMoney(intMoney * 2);
			// 소지금 플러스하는 부분..
			return;
		} else {
			System.out.println("\t- 무승부 -");
			System.out.println("묻고 더블로 가시겠습니까? (Y/N)");// 배팅액컨텐츠있을때
			System.out.print(">> ");
			input = scan.nextLine();
			if (input.trim().equals("Y")) {
				System.out.println("n원을 배팅하고 새로 카드를 받습니다");
				vo.setMoney(-(intMoney * 2));
				// 소지금 차감하는 부분..
				this.cardDraw(player, 1);
				this.cardDraw(dealer, 1);
			} else {
				
				return;
			}
			Integer input1 = null;
			try {
				input1 = Integer.valueOf(input);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return;
	}

}