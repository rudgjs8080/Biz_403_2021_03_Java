package com.team.blackjack.service.impl;

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
	protected Player player;
	protected Dealer dealer;
	
	public GameImplV1() {
		
		deck = new CardDeck(); 
		player = new Player();  
		dealer = new Dealer();  
		
	}

	@Override
	public void run() {
		// TODO 
		
	}

	@Override
	public void selectMenu() {
		// TODO 
		
	}

	@Override
	public void cardDraw(User name, int count) {
		// TODO 카드 나눠주기(줄사람, 몇장)
		for(int i = 0; i < count; i++) {
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
