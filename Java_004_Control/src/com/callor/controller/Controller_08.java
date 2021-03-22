package com.callor.controller;

import java.util.Random;

public class Controller_08 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		for(int i = 0 ; i < 10 ; i++) {
			int num = rnd.nextInt();
			System.out.println(num);
		}
		System.out.println("===================");
		for(int i = 0 ; i < 5 ; i++) {
			
			// 0~99 까지의 정수를 만들어라
			int num = rnd.nextInt(100);
			System.out.println(num);
		}
		System.out.println("---------------");
		for(int i = 0 ; i < 5 ; i++) {
			int num = rnd.nextInt(10);
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
		

	}

}
