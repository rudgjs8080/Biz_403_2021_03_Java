package com.callor.apps;
/*
 * Feedback
 * 틀린건 아닌데 비효율적인 코드다
 * for()문 안에서 else if 를 사용하지 말고
 * 밖으로 뺄 수 있도록 해야한다
 * for()문 안에 코드가 많아지면 비효율적인 코드가 된다
 * 
 * for()문 밖으로 코드를 빼서 수정을 해보자
 */
import java.util.Random;

/*
 * 1. 정수형 배열 20개를 선언합니다
 * 2. Random 클래스를 사용하여 50~100까지 난수를 생성하여 배열에 저장합니다
 * 3. 배열에 저장된 정수 중 Prime(소수)인 수들의 리스트를 출력합니다
 */
public class App_01 {

	public static void main(String[] args) {

		int n = 20;
		int[] intNum = new int[n];
		Random rd = new Random();
		
		System.out.println("출력값 중 소수의 리스트는 다음과 같다");
		for (int i = 0; i < n; i++) {
			intNum[i] = rd.nextInt(51) + 50;
			int j = 0;
			for (j = 2; j < (intNum[i]); j++) {
				if (intNum[i] % j == 0) {
					break;
				} else if (j + 1 == intNum[i]) {
					System.out.println((i + 1) + " 번째 값 " + intNum[i]);
				}
			}

		}

	}

}
