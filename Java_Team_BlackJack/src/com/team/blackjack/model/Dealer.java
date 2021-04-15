package com.team.blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

	 private List<CardVO> card;
	 
	 public Dealer() {
		 
		 card = new ArrayList<CardVO>();
	 }	 
	 
	 public void receiveCard(CardVO card) {
		// TODO 카드 받기
		this.card.add(card);
	 }
	
	public List<CardVO> getCard(){
		// TODO 카드 정보 보여주기
		return card;
	}
	
	public int getScore() {
		// TODO 현재 점수 보여주기
		int sum = 0;
		for(int i = 0; i < card.size(); i++) {
			CardVO vo = card.get(i);
			sum += vo.getValue();
		}
		return sum;
	}
}
