package com.callor.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class_03 {

	public static void main(String[] args) {

		
		/*
		 * Generic 사용 : <Integer>
		 * List 형 객체에 저장할 데이터의 type을 제한하므로써
		 * 코드의 실행과 메모리 사용의 효율을 높이기 위함이다
		 */
		List<Integer> divisor = new ArrayList<Integer>();
		
		Random rd = new Random();
		
		int intNum = rd.nextInt(51) + 50;
		
		System.out.println("난수 : " + intNum);
		
		for(int i = 2 ; i < intNum ; i++) {
			if(intNum % i == 0) {
				divisor.add(i);
			}
		}
		System.out.print("생성된 약수 : " );
		for(int i = 0 ; i < divisor.size(); i++) {
			System.out.print(divisor.get(i)+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
