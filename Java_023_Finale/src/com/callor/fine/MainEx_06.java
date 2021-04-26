package com.callor.fine;

import java.util.ArrayList;
import java.util.List;

import com.callor.fine.model.ScoreVO;

public class MainEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ScoreVO> scoreList = null;
		
		for(int i = 0 ; i < 10 ; i++) {
			ScoreVO scoreVO = null;
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
			scoreList.add(scoreVO);
			
		}
		
		// 왜 nullpointexception이 나오는지 
		
		
	}

}
