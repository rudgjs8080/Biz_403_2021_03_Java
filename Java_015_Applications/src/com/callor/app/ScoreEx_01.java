package com.callor.app;

import com.callor.app.model.ScoreVO;

public class ScoreEx_01 extends Object{
	
	/*
	 * java 소스코드인 클래스 파일은
	 * 보통 public class 클래스명 {} 형식으로 만들어진다
	 * 이때 extends 키워드를 사용하여 다른 클래스를 
	 * 		상속하면 , 상속하는 클래스의 정의된 method, 변수를
	 * 		물려받아 사용할 수 있다
	 * 
	 * 클래스를 만들때 extends 키워드 명령문을 사용하지 않으면
	 * 		모든 클래스는 자동으로 extends Object 명령문이
	 * 		추가되는 것과 같다
	 * 
	 * Object 클래스는 java의 모든 클래스의 조상이다
	 * 		Object 클래스에는 시스템적, 메모리적인
	 * 		메서드들이 있다.
	 * 		이러한 메서드들은 특별한 용도로 사용한다
	 * 
	 * 		하지만, Object 클래스에 정의되어 있는 method는 
	 * 		일반적인 개발을 할 때는 별로 사용을 하지 않는다
	 * 
	 * 보통 클래스를 만들때 Object로 부터 상속받은
	 * 		여러 메서드들 중에 toString() 메서드를 재정의하여
	 * 		디버깅 용도 등으로 활용한다
	 */
	
	
	public static void main(String[] args) {

		ScoreVO scoreVO = new ScoreVO();
		
		scoreVO.setNum("001");
		scoreVO.setName("홍길동");
		scoreVO.setKor(90);
		scoreVO.setEng(88);
		scoreVO.setMath(77);
		
		System.out.println(scoreVO.toString());
		
		
		
	}

}
