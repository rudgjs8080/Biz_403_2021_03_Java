package com.callor.method.service;
/*
 * 1. subject = {"국어","영어","수학"} 배열을 사용하여
 * 2. inputScore() method를 선언하고
 * 3. InputNumberV1A2 클래스를 이용하여
 * 4. 국어,영어,수학 점수를 입력받고 변수에 저장
 * 5. 각 점수는 0 ~ 100점 범위 내에서 입력
 * 6. 입력 받은 3과목의 총점과 평균을 계산하여 출력
 */
public class ScoreServiceV4 {
	
	InputNumberV1A2 isService;
	public ScoreServiceV4() {

		isService = new InputNumberV1A2();
	}
	
	public void inputScore() {
		String[] subject = {"국어","영어","수학"};
		
		Integer intKor = isService.inputValue(subject[0],0,100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = isService.inputValue(subject[1],0,100);
		if(intEng == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = isService.inputValue(subject[2],0,100);
		if(intMath == null) {
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
