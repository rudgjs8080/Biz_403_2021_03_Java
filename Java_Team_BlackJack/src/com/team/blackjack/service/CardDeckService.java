package com.team.blackjack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.team.blackjack.model.CardVO;

public class CardDeckService {

	private Random rnd;
	private List<CardVO> cardDeck; // 카드 52장을 저장할 객체배열
	private String[] patterns;
	private String[] numbers;

	public CardDeckService() {

		rnd = new Random();
		cardDeck = new ArrayList<CardVO>();
		patterns = new String[] 
				{ "스페이드♠", "다이아몬드◆", "하트♥", "클로버♣" };
		numbers = new String[] 
				{ "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		this.makeCardDeck();
		this.makeValue();
	}

	public void makeCardDeck() {
		// TODO 카드 52장 만들기
		
		// 패턴의 종류 수만큼 반복 : 4번
		for (int i = 0; i < patterns.length; i++) {

			// 넘버의 번호수만큼 반복 : 13번
			for (int j = 0; j < numbers.length; j++) {

				// 첫시작 i = 0 이기 때문에 patterns[i]는 스페이드이다
				// 스페이드 패턴으로 13개의 넘버를 부여해서 13개의 카드 생성 -> 총4회반복
				CardVO cardVO = new CardVO();
				cardVO.setPattern(patterns[i]);
				cardVO.setNumber(numbers[j]);
				cardDeck.add(cardVO);
			}
		}
	}
	
	public void makeValue() {
		// TODO 각 카드에 숫자 값 넣기
		for(int i = 0; i < cardDeck.size(); i++) {
			
			CardVO vo = cardDeck.get(i);
			Integer value = null;
			try {
				value = Integer.valueOf(vo.getNumber());
			} catch (NumberFormatException e) {
				if(vo.getNumber().equals("A")) {
					value = 1;
				} else {
					value = 10;
				}
			}
			vo.setValue(value);
		} // end for()
	}
	
	public CardVO drawCard() {
		// TODO 카드 랜덤 뽑기 후 뽑은 카드 제거
		int nSize = cardDeck.size();
		int num = rnd.nextInt(nSize); // cardDeck.size()만큼의 랜덤수를 num에 저장
		CardVO cardVO = cardDeck.get(num);
		cardDeck.remove(num); // 뽑은 카드 리스트배열에서 제거
		return cardVO;
	}
}