package com.callor.reload.service;
/*
 * 1. PrimeServiceV4 class의 클래스 영역에 
 * Random rnd 객체 선언
 * List<Integer> intList 객체 선언
 * 2. 클래스 생성자에서 rnd 객체와 intList 객체 생성(초기화)
 * 3. printNum() method를 선언하고
 * 50 ~ 100 까지 중 임의의 난수 50개를 생성하고
 * 난수 중 소수인 정수들만 intList에 추가
 * 4. printPrimeNum() method를 선언하고
 * intList에 담긴 리스트 출력
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {

	Random rd;
	List<Integer> intList;
	
	public PrimeServiceV4() {
		intList = new ArrayList<Integer>();
		rd = new Random();
		
	}
	
	public void primeNum() {
		int[] num = new int[50];
		
		for(int i = 0 ; i < 50 ; i++) {
			num[i] = rd.nextInt(51) +50;
		}
		
		for(int i = 0 ; i <50 ; i++) {
			
			for(int j = 2 ; j < num[i] ; j++) {
				if(num[i] % j == 0) {
					break;
				}
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
