package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1A;

public class Const_01 {
	public static void main(String[] args) {
		/*
		 * 인터페이스가 있는 클래스의 객체 생성
		 * 	= 클래스를 선언(작성)할 때 인터페이스를 impl 했다
		 * 
		 * 인터페이스를 사용하여 객체를 선언하고
		 * 구현체 클래스 생성자를 호출하여 객체를 생성, 초기화 해야 한다
		 * 
		 * 인터페이스는 생성자 메서드가 없다
		 */
		ScoreService sService = new ScoreServiceImplV1A();
		
		/*
		 * List 인터페이스로 3개의 객체를 선언하고
		 * 각각을 Array, Linked, Vector 클래스를 사용하여
		 * 		생성하였다
		 * 
		 * strList1, strList2, strList3는
		 * 각각 ArrayList, LinkedList, Vector type 으로
		 * 데이터 형이 다르다
		 * 
		 * 하지만 List interface type으로 선언되었기 때문에
		 * method 등의 연산을 공용으로 사용할 수 있다
		 * 
		 * 이러한 성질을 (클래스의)다형성 이라고 한다
		 */
		
		List<String> strList1 = new ArrayList<String>();
		List<String> strList2 = new LinkedList<>();
		List<String> strList3 = new Vector<>();
		
		strList1.add("대한민국1");
		strList2.add("대한민국2");
		strList3.add("대한민국3");
		
		
		
		// 리스트에 저장된 내용을 출력하는 method 호출하기
		list(strList1);
		list(strList2);
		list(strList3);
		
		
	}
	
	// List의 내용전체를 Console에 출력하기
	/*
	 * 매개변수 type을 List interface type으로 선언한 method
	 * 
	 * 이 method는 List interface의 자손인
	 * ArrayList, LinkedList, Vector 클래스로 생성된
	 * 객체를 매개변수로 받아 연산을 수행할 수 있다
	 * 
	 * 즉, 한 개의 method로 다수 type의 값들을 
	 * 연산 수행할 수 있다
	 */
	public static void list(List<String> strList) {
		int nSize = strList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(strList.get(i));
		}
	}
	
	
}