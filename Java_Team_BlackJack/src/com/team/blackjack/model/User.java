package com.team.blackjack.model;

import java.util.List;
/*
 * 딜러와 플레이어의 공통된 기능이 겹치기 때문에 
 * User인터페이스 생성
 */
public interface User {
	// 카드받기
	public void receiveCard(CardVO card);
	// 카드 패 보여주기
	public List<CardVO> viewCard();
	// 카드 점수 보여주기
	public int getScore();
}
