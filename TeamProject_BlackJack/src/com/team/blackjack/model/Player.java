package com.team.blackjack.model;

import java.util.ArrayList;
import java.util.List;

public class Player implements User {
	
	// TODO 플레이어 카드 주머니
	private List<CardVO> player;
	
	public Player() {
		
		player = new ArrayList<>();
	}
	
	@Override
	public void receiveCard(CardVO card) {
		// TODO 카드 받아 저장하기
		this.player.add(card);	
	}
	
	@Override
	public List<CardVO> viewCard() {
		// TODO 카드 패 보여주기
		return player;
	}

	@Override
	public int getScore() {
		// TODO 현재 총점 확인하기
		int sum = 0;
		int nSize = player.size();
		for(int i = 0; i < nSize; i++) { 
			CardVO vo = player.get(i);
			sum += vo.getValue();
		}
		return sum;
	}
}