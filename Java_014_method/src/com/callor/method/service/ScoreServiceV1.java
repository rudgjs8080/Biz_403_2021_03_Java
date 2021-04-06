package com.callor.method.service;
/*
 * 1. inputScore() method를 선언
 * 2. InputNumberV1A의 inputValue() method에
 * 		"국어", 0, 100 값을 전달한 후
 * 3. return 된 값을 변수에 저장
 * 4. 변수에 저장된 값이 null 이면 "종료"를 출력하고
 * 5. 변수에 저장된 값이 정수이면 "점수 : ??" 형식으로 출력
 */
public class ScoreServiceV1 {
	InputNumberV1A inV1A;

	public ScoreServiceV1() {
		inV1A = new InputNumberV1A();

	}

	public void inputScore(String strClass) {

		Integer retNum = inV1A.inputValue(strClass, 0, 100);

		if (retNum == null) {

			System.out.println("종료");

		} else {
			System.out.println("점수 : " + retNum);
		}

	}

}
