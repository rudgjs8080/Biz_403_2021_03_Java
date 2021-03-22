package Java.Home.Key.March;

import java.util.Random;

public class March_22_Array {

	public static void main(String[] args) {

		int[] intNum = new int[3];
		// int형의 배열을 3개 만들수 있는 공간이 생겼다는 의미
		intNum[0] = 5;
		intNum[1] = 3;
		intNum[2] = 2;

		Random rd = new Random(); // Random을 선언해준다.

		// 정수값 10개를 저장할 변수를 선언할 때 [] 사용

		int[] intKors = new int[100];

		for (int i = 0; i < 100; i++) {
			intKors[i] = rd.nextInt(100) + 1;
//			System.out.println(intKors); [I@53bd815b 라는 값이 출력된다 이유가 뭔지 모르겠다
		}
		int intSum = 0;
		int n = 100;

		for (int i = 0; i < n; i++) {
			System.out.printf("학생 %d : %d점\n", i + 1, intKors[i]);
			intSum += intKors[i];
		}
		float floatAvg = (float) intSum / n;
		System.out.printf("평균점수 : %.2f", floatAvg);
		/*
		 * 학생 수가 n 명일 때 n명의 학생 각각의 점수를 구하고 그 점수들의 합계와 평균을 구하는 코드
		 */
		int[] intEngs = new int[3];
		
		// 값저장
		// 변수이름[위치주소] = 값
		// 변수이름[첨자] = 값
		
		for(int index = 0 ; index < 3 ; index++) {
			intEngs[index] = rd.nextInt(100);
			System.out.println(index + " : " + intEngs[index]);
		}
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		 * Index 3 out of bounds for length 3
			at Java.Home.Key.March.March_22_Array.main(March_22_Array.java:43)		
			현재 배열의 index를 3이라고 썼는데 3이라는 값은 없다는 것
			즉 3까지 지정을 했으면 0 1 2 까지만 가능하다는 것이다 { 0 1 2 }  3개의 공간을 만들었지만
			3을 지정하게 되면 { 0 1 2 3 } 4개의 공간이 필요하기 때문이다
		 */
		
		
		
		
		
		
		
	}

}
