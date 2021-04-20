package com.team.blackjack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.team.blackjack.model.CardVO;

public class CardDeck {

	private Random rnd;
	private List<CardVO> card; // 카드 52장 저장소
	private String[] patterns;
	private String[] denomination;

	public CardDeck() {
		
		rnd = new Random();
		card = new ArrayList<CardVO>();
		patterns = new String[] 
				{ "스페이드♠", "다이아몬드◆", "하트♥", "클로버♣" };
		denomination = new String[] 
				{ "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		this.makeDeck();
	}

	public void makeDeck() {
		// TODO 카드 52장 만들기
		// 패턴의 종류 수만큼 반복 : 4번
		for (int i = 0; i < patterns.length; i++) {
			// 넘버의 번호수만큼 반복 : 13번
			for (int j = 0; j < denomination.length; j++) {
				// 첫시작 i = 0 이기 때문에 patterns[i]는 스페이드이다
				// 스페이드 패턴으로 13개의 넘버와 값 부여해서 13개씩 카드 생성 -> 총4회반복
				CardVO cardVO = new CardVO();
				cardVO.setPattern(patterns[i]);
				cardVO.setNumber(denomination[j]);
				Integer value = null;
				try {
					value = Integer.valueOf(denomination[j]);
				} catch (NumberFormatException e) {
					if(denomination[j].equals("A")) {
						value = 1;
					} else {
						value = 10;
					}
				}
				cardVO.setValue(value);
				card.add(cardVO);
			} // end 안쪽 for()
		} // end 바깥for()
	} // end makeDeck()
	
	public CardVO drawCard() {
		// TODO 카드 랜덤 뽑기 후 뽑은 카드 제거
		int nSize = card.size();
		int num = rnd.nextInt(nSize); // 카드 개수만큼의 랜덤수를 num에 저장
		CardVO cardVO = card.get(num);
		card.remove(num); // 뽑은 카드 리스트배열에서 제거
		return cardVO;
	}
}
