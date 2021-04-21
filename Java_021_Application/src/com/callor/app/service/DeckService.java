package com.callor.app.service;

import java.util.List;
import java.util.Random;

import com.callor.app.model.DeckVO;

public class DeckService {
	
	protected List<DeckVO> deckList;
	String strSuit = "다이아(◆):하트(♥):스페이드(♤):클로버(♧)";
	String strDenomi = "A23456789JQK";
	
	public DeckVO getDeck() {
		Random rd = new Random();
		
		int nSize = deckList.size();
		int deckIndex = rd.nextInt(nSize);
		DeckVO retDeckVO = deckList.get(deckIndex);
		deckList.remove(deckIndex);
		
		return retDeckVO;
		
	}
	
	
	public void makeDeck() {
		String[] denoms = strDenomi.split("");
		String[] suits = strSuit.split(":");
		
		for(String suit : suits) {
			for(String denom : denoms) {
				
				Integer intValue = 0;
				
				try {
					intValue = Integer.valueOf(denom);
					if(intValue == 0) intValue = 10;
				} catch (NumberFormatException e) {
					// TODO denom 문자열이 A J Q K 인 경우
					if(denom.equals("A")) intValue = 1;
					else intValue = 10;
				}
				DeckVO deckVO = new DeckVO();
				deckVO.setSuit(suit);
				deckVO.setDenomination(denom);
				deckVO.setValue(intValue);
				deckList.add(deckVO);
				
				
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
