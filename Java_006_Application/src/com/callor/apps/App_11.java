package com.callor.apps;
/*
 * 로또 번호 자동 생성기
 * (오름차순정렬까지 해볼 수 있도록 하자)
 * 
 */
import java.util.Arrays;
import java.util.Random;

public class App_11 {

	public static void main(String[] args) {
		
		// main() method의 멤버변수
		// method 변수
		
		// 정수배열 45개 선언
		int[] intNums = new int[45];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 1;

		}
		Random rd = new Random();

		for (int i = 0; i < 1000; i++) {
			int index1 = rd.nextInt(intNums.length);
			int index2 = rd.nextInt(intNums.length);

			int temp = intNums[index1];
			intNums[index1] = intNums[index2];
			intNums[index2] = temp;

		}
		System.out.println(Arrays.toString(intNums));
		System.out.println("======================");
		
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println(intNums[i] + "\t");
		}
		
		// Random 클래스를 사용하여 
		// 0~44 까지 임의 숫자 2개를 만들고
		// 그 숫자를 index로 하여 무조건 배열의 값을 서로 교환했다(shuffle)
		
		
	}

}














