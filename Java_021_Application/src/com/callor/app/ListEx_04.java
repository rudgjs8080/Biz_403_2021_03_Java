package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_04 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();

		Random rd = new Random();

		for (int i = 0; i < 10; i++) {
			intList.add(rd.nextInt(100) + 1);
		}
		System.out.println(intList.toString());
		List<Integer> varList = new ArrayList<Integer>();

		varList.add(30);
		varList.add(40);
		varList.add(50);
		varList.add(60);
		varList.add(70);
		varList.add(80);
		intList.removeAll(varList);
		
		intList.add(999);// 맨끝에 추가하기
		intList.add(3, 9999); // 중간에 끼워서 추가하기 
		intList.set(6, 7777); // 6번째 수를 변경 
		System.out.println(intList.toString());

		while (true) {
			if (intList.size() < 1)
				break;
			int index = rd.nextInt(intList.size());
			System.out.print(intList.get(index) + "\n");
			intList.remove(index);
		}
		
	}

}
