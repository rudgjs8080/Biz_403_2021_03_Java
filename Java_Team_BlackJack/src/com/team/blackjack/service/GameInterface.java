package com.team.blackjack.service;

import com.team.blackjack.model.User;

public interface GameInterface {
	
	public void run();
	public void selectMenu();
	public void cardDraw(User name, int count);
	public void goStay();
	public void rule();
	public void printResult();
}
