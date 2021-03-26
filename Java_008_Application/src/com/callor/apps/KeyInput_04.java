package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

/*
 * 1. 정수형 배열 5개를 생성
 * 2. 키보드를 통해서 정수 5개를 입력 받아 배열에 저장
 * 3. 배열에 입력된 정수들의 리스트와 합을 계산하여 출력
 * 4. 입력 Prompt와 출력문의 UI를 만들어서 출력
 */

/*
 * System.out.println(Arrays.toString(put)); 을 하면 [1, 2, 3, 4, 5] 형식의 값들이 출력된다
 * 내가 사용한 for 문 대신에 사용하면 간편하게 사용할 수 있을것같다
 */
public class KeyInput_04 {

	public static void main(String[] args) {

		int put[] = new int[5];
		int putSum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(LinesService.dLines(45));
		System.out.println("정수 5개의 합 계산기");
		System.out.println("정수 값 5개를 입력 후 Enter를 눌러주세요");
		System.out.println(LinesService.sLines(45));
		for (int i = 0; i < put.length; i++) {
			System.out.print("정수 " + (i + 1) + " >> ");
			put[i] = scan.nextInt();

		}
		for (int i = 0; i < put.length; i++) {
			putSum += put[i];
		}

		System.out.println(LinesService.dLines(45));
		for (int i = 0; i < put.length; i++) {
			System.out.println("입력한 정수 " + (i + 1) + " : " + (put[i]));
		}
		System.out.println("입력한 정수들의 합 : " + putSum);
		System.out.println(LinesService.dLines(45));
	}

}
