package com.team.blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements User {
	
	// TODO 딜러 카드 주머니
	private List<CardVO> dealer;
	
	public Dealer() {
		
		dealer = new ArrayList<>();
	}
	
	@Override
	public void receiveCard(CardVO card) {
		// TODO 카드 받아 저장하기
		this.dealer.add(card);	
	}
	
	@Override
	public List<CardVO> viewCard() {
		// TODO 카드 패 보여주기
		return dealer;
	}
	
	@Override
	public int getScore() {
		// TODO 현재 총점 확인하기
		int sum = 0;
		int nSize = dealer.size();
		for(int i = 0; i < nSize; i++) { 
			CardVO vo = dealer.get(i);
			sum += vo.getValue();
		}
		return sum;
	}
}