package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;
import com.callor.apps.service.NumServiceV1;

public class KeyInput_06 {

	public static void main(String[] args) {

		NumServiceV1 nsV1 = new NumServiceV1();
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			System.out.println(LinesService.dLines(50));
			System.out.println("넘버 체크!!");
			
			nsV1.inputNum();
			nsV1.checkEven();
			nsV1.checkPrime();
			
			System.out.println(LinesService.dLines(50));
			System.out.print("계속할까요? (Yes:1 , No:0");
			int yesNo = scan.nextInt();
			if(yesNo == 0) {
				break;
			}
			
		}
		System.out.println("Game Over!");
		
		
	}

}
