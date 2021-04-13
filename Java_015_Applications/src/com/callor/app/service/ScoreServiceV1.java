package com.callor.app.service;

import com.rudgjs.standard.InputService;
import com.rudgjs.standard.impl.InputServiceImplV1;

/*
 * 1. InputService interface를 활용하여
 * 2. 한 학생의 국어, 영어, 수학 점수를 입력받고
 * 3. 총점과 평균을 계산하여 출력
 * 4. 단, 점수는 0 ~ 100까지만 입력할 수 있음
 */
public class ScoreServiceV1 {
	public static void main(String[] args) {
		InputService isV1 = new InputServiceImplV1();
		
		String[] strclass = new String[] {"국어","영어","수학"};
		Integer[] scores = new Integer[strclass.length];
		
		int sum = 0;
		float avg =  0;
		
		for(int i = 0 ; i < strclass.length ; i++) {
			scores[i] = isV1.inputValue(strclass[i], 0, 100);
			if(scores[i] == null) {
				System.out.println("입력중단");
			}
			sum += scores[i];
		}
		
		
		avg = (float)sum/3;
		System.out.println("=".repeat(30));
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println("=".repeat(30));
		
		
		// if 문 완성하면됨
	}
}
