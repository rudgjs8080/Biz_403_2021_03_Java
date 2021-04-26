package com.callor.fine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService{
	
	
	
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	public ScoreServiceImplV1() {

		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		
	
	}
	
	
	
	
	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
	}

}
