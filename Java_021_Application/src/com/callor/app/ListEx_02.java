package com.callor.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListEx_02 {

	public static void main(String[] args) {

		Random rd = new Random();
		List<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			intList.add(rd.nextInt(100) + 1);
		}
		System.out.println(intList.toString());
		sort(intList);
		
		// intList
		System.out.println("=".repeat(40));
		System.out.println(intList.toString());
	}
	// 오류있음
	public static void sort(List<Integer> list) { // main에서 호출하려면 static을 사용해야함

		int nSize = list.size();
		for (int i = 0; i < nSize; i++) {

			for (int j = i + 1; j < nSize; j++) {
				if (list.get(i) > list.get(j)) {
					Integer te = list.get(i);
					list.set(i, list.get(j));
					list.set(j, te);
				}
			}
		}
		System.out.println(list);

	}

}
