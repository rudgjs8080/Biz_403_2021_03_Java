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
		this.selectMenu();

	}

	@Override
	public void run() {
		// TODO
		deck = new CardDeck();
		player = new Player();
		dealer = new Dealer();

	}

	@Override
	public void selectMenu() {
		// TODO
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
				this.run();
				this.cardDraw(player, 2);
				this.cardDraw(dealer, 2);
				this.goStay();
				this.rule();
				this.printResult();

			}

		}

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