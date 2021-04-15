package com.team.blackjack.service;

import java.util.Scanner;

import com.team.blackjack.model.CardVO;
import com.team.blackjack.model.Dealer;
import com.team.blackjack.model.Player;

public class RuleService {

	private CardDeckService deck;
	private Player player;
	private Dealer dealer;
	private Scanner scan;
	private final int MAXSCORE = 21;
	
	public RuleService() {
		
		deck = new CardDeckService();
		player = new Player();
		dealer = new Dealer();
		scan = new Scanner(System.in);
	}
	
	public void run() {
		int start = 2;
		for(int i = 0; i < start; i++) {
			CardVO card1 = deck.drawCard();
			player.receiveCard(card1);
			CardVO card2 = deck.drawCard();
			dealer.receiveCard(card2);
		}
	}
	
	public void showInfo() {
		
		System.out.println("=".repeat(60));
		System.out.println("플레이어 카드");
		System.out.print(player.getCard() + "  ");
		System.out.print("점수 : " + player.getScore() + "\n");
		System.out.println();
		System.out.println("딜러 카드");
		System.out.print("[<   ???   >, <   ???   >]   ");
		System.out.print("점수 : ??\n");
		System.out.println("=".repeat(60));
	}
	
	public void playerAppendCard() {
		
		while(true) {
			System.out.println("-".repeat(60));
			System.out.println("카드를 한장 더 받으시겠습니까?");
			System.out.println("1. 한장더 받기\t 2. 오픈");
			System.out.println("-".repeat(60));
			System.out.println(">> ");
			String strM = scan.nextLine();
			if(strM.equals("1")) {
				CardVO card1 = deck.drawCard();
				player.receiveCard(card1);
				if(player.getScore() > MAXSCORE) {
					this.showResult();
					this.winLoss();
					return;
				}
				this.showInfo();
				continue;
			} else if(strM.equals("2")) {
				this.dealerAppendCard();
				this.showResult();
				this.winLoss();
				return;
			}
			// 1, 2 가 아닌 다른 수를 입력했을 때 경고문 추가 
			/*else {
				System.out.println("1 또는 2를 입력해주세요");
				continue;}
				*/
		}
	}
	
	public void dealerAppendCard() {
		
		while(true) {
			if(dealer.getScore() < 17 ) {
				CardVO card2 = deck.drawCard();
				dealer.receiveCard(card2);
			} else {
				return;
			}
		}
	}
	
	public void showResult() {
		
		System.out.println("=".repeat(60));
		System.out.println("플레이어 카드");
		System.out.print(player.getCard() + "  ");
		System.out.print("점수 : " + player.getScore() + "\n");
		System.out.println("딜러 카드");
		System.out.print(dealer.getCard() + "  ");
		System.out.print("점수 : " + dealer.getScore() + "\n");
		System.out.println("-".repeat(60));
		
	}
	
	public void winLoss() {
		
		int p = player.getScore();
		int d = dealer.getScore();
		if(p > MAXSCORE) {
			System.out.println("플레이어 패배!!");
			return;
		}
		if(d > MAXSCORE) {
			System.out.println("플레이어 승리!!");
		} else if (p >= d) {
			System.out.println("플레이어 승리!!");
		} else {
			System.out.println("플레이어 패배!!");
		}
	}
}
