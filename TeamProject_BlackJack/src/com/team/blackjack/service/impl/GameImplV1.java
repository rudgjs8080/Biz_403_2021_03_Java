package com.team.blackjack.service.impl;

import java.util.Scanner;

import com.team.blackjack.model.CardVO;
import com.team.blackjack.model.Dealer;
import com.team.blackjack.model.Player;
import com.team.blackjack.model.User;
import com.team.blackjack.service.CardDeck;
import com.team.blackjack.service.GameInterface;

// 보유카드패   : player.viewCard(); 또는 dealer.viewCard();
// 보유카드점수 : player.getScore(); 또는 dealer.getScore();

public class GameImplV1 implements GameInterface {

	protected CardDeck deck;
	protected User player;
	protected User dealer;
	protected Scanner scan;

	public GameImplV1() {
		scan = new Scanner(System.in);
		this.gameStart();

	}

	@Override
	public void run() {
		// TODO
		deck = new CardDeck();
		player = new Player();
		dealer = new Dealer();

	}

	public void gameStart() {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("1. 게임시작");
			System.out.println("QUIT. 게임종료");
			System.out.println("=".repeat(50));
			System.out.print("입력 >>");
			String strInput = scan.nextLine();
			if (strInput.equals("QUIT")) {
				System.out.println("게임을 종료하셨습니다");
				return;
			} else if (strInput.equals("1")) {
				this.selectMenu();
			}
		}

	}

	@Override
	public void selectMenu() {
		// TODO
			this.run(); // 카드덱 생성
			this.cardDraw(player, 2); // 플레이어 2장 뽑기
			this.cardDraw(dealer, 2); // 딜러 2장 뽑기
			this.goStay(); // 플레이어 떠 뽑을지 말지 (뽑다가 21 넘으면 종료)
			this.rule(); // 딜러 계산 및 뽑기
			this.printResult(); // 결과 출력
	}

	@Override
	public void cardDraw(User name, int count) {
		// TODO 카드 나눠주기(줄사람, 몇장)
		for (int i = 0; i < count; i++) {
			CardVO card = deck.drawCard();
			name.receiveCard(card);
		}
	}

	@Override
	public void goStay() {
		// TODO
		while (true) {
			if (player.getScore() < 22) {
				System.out.println(player.viewCard());
				System.out.println("카드를 추가로 뽑으시겠습니까?");
				System.out.println("Yes or No");
				System.out.print(">>");
				String strPlus = scan.nextLine();
				if (strPlus.equalsIgnoreCase("Yes")) {
					this.cardDraw(player, 1);
				} else if (strPlus.equalsIgnoreCase("No")) {
					return;
				} else
					System.out.println("잘못입력하셨습니다 다시 입력해주세요");
				continue;
			} else {
				System.out.println("Player 패배");
				return;
			}

		}
	}

	@Override
	public void rule() {
		// TODO

	}

	@Override
	public void printResult() {
		// TODO

	}

}