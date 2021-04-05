package com.callor.method;

import com.callor.method.service.NumberServiceV1A;

public class Method_03 {

	public static void main(String[] args) {

		NumberServiceV1A nsV1 = new NumberServiceV1A();
		
		/*
		 * NumberServiceV1A 클래스에 작성한 inputNum()를 
		 * 호출하여 명령을 수행하고 싶다
		 * 이때 C 와 같은 언어는 단순히 method 이름만
		 * 호출하여 명령을 수행할 수 있다
		 * 이런 type을 함수호출(function call)이라 한다
		 * 하지만,
		 * 자바는 이러한 함수호출 방식으로 명령을 수행할 수 없다
		 * 
		 * Ex) inputNum();
		 */
		
		/*
		 * 클래스에 정의된 method를 호출하여
		 * 명령을 수행하려면
		 * 1. 클래스를 사용하여 객체를 생성해야 한다
		 * 2. 객체와 연결연산자를 사용하여 호출한다
		 * 
		 * nsV1.inputNum(); 방식으로 호출해야 하며
		 * nsV1은 이 전에 객체로 생성되어 있어야 한다
		 * 
		 */
		
		/*
		 * inputNum() method는 정수값을 생성하여
		 * 3의 배수이면 정수를 아니면 null 값을
		 * return 하도록 되어있다
		 * 따라서 이 method를 단순히 호출만 하는 것은 
		 * 아무런 의미가 없다
		 * 
		 * 이 method가 어떤 명령들을 수행했는지 알수있는 방법이 없다
		 */
		nsV1.inputNum();
		
		/* 이 method는 return 명령문이 강제되어 있기 때문에 
		 * method가 return 하는 값을 받아서
		 * 변수에 저장할 수 있다
		 */
		
		Integer retNum = nsV1.inputNum();
		
		/*
		 * method가 return 해준 값을 저장한 변수 retNum 값을
		 * 참조하여 이후 코드를 작성할 수 있다
		 */
		
		if(retNum == null) {
			System.out.println("return된 값은 3의 배수가 아님");
		} else {
			System.out.println(retNum + "는 3의 배수");
		}
		// 위의 코드보다 권장하는 코드
		if(retNum != null) {
			System.out.println(retNum + " 는 3의 배수");
		} else {
			System.out.println("3의 배수가 아님");
		}
		
	}

}
