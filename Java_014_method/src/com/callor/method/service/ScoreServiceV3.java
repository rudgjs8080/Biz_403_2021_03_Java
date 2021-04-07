package com.callor.method.service;

/*
 * 1. inputScore() method를 선언하고
 * 2. InputNumberV1A2 클래스를 사용하여
 * 3. 국어, 영어, 수학 점수를 입력받고
 * 4. 각각 intKor, intEng, intMath 변수에 저장
 * 5. 각 점수는 0 ~ 100 점 볌위 내에서 입력
 * 6. 입력받은 3과목 총점과 평균을 계산하여 출력
 */
public class ScoreServiceV3 {
	protected InputNumberV1A2 inService;

	public ScoreServiceV3() {

		inService = new InputNumberV1A2();
	}

	public void inputScore() {

		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			System.out.println("종료");
			return;//만약 오류가 생긴다면 return하고 아니면 intKor 에 값이 저장되는 것
		} 

		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			System.out.println("종료");
			return;
		} 

		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			System.out.println("종료");
			return;
		} 

		int intSum = intKor + intEng + intMath;
		float floatAvg = (float)intSum / 3;

		System.out.println("=".repeat(40));
		System.out.printf("과목 총점 : %d\t 과목 평균 %.2f\n", intSum, floatAvg);
		System.out.println("=".repeat(40));
	}
}
