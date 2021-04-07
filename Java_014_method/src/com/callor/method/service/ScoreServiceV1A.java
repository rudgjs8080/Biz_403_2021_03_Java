package com.callor.method.service;

/*
 * InputNumberV1A2 클래스의 inputValue() method에
 * "국어", 0, 100 값을 전달한 후
 * return 값이 null 이면 종료, 정수값이면 점수 : ??
 */
public class ScoreServiceV1A {
	/*
	 * InputNumberV1A2 클래스를 활용하는 method가 2개 이상일 경우에는 
	 * 모든 변수, 객체를 클래스 영역(멤버변수영역)에 선언하자
	 * 그리고 생성자에서 초기화하여 사용하도록 한다
	 */
	protected InputNumberV1A2 inService;

	public ScoreServiceV1A() {

		inService = new InputNumberV1A2();
	}

	public void intputScore() {
		// InputNumberV1A2 를 활용한 method가
		// 한곳 뿐일때는 이처럼 method 지역변수 영역에 선언하여
		// 사용하면 된다
		// InputNumberV1A2 inService = new InputNumberV1A2();
		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			System.out.println("종료");
		} else {
			System.out.printf("국어 점수 : %d", intKor);
		}
	}
}
