package com.callor.apps;

import java.util.Random;

/*
 * 1. 5명 학생의 성적을 계산합니다
 * 2. 과목은 국어(intKor), 영어(intEng), 수학(intMath)이며
 * 3. 과목의 점수는 Random클래스를 사용하여 50~100까지 생성하여 사용
 * 4. 학생의 성적리스트를 출력
 * 
 */
public class App_05 {

	public static void main(String[] args) {
		int n = 5;
		int[] intKor = new int[n];
		int[] intEng = new int[n];
		int[] intMath = new int[n];
		int[] intSum = new int[n];
		float[] floatAvg = new float[n];

		Random rd = new Random();
		System.out.println("===========================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------");
		int intSumKor = 0;
		int intSumEng = 0;
		int intSumMath = 0;
		for (int i = 0; i < n; i++) {
			intKor[i] = rd.nextInt(51) + 50;
			intEng[i] = rd.nextInt(51) + 50;
			intMath[i] = rd.nextInt(51) + 50;
			intSumKor += intKor[i];
			intSumEng += intEng[i];
			intSumMath += intMath[i];
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
			floatAvg[i] = ((float) intSum[i]) / 3;
			System.out.printf("%d\t%3d\t%3d\t%3d\t%3d\t%3.2f\n", i + 1, intKor[i], intEng[i], intMath[i], intSum[i],
					floatAvg[i]);

		}
		System.out.println("---------------------------");
		float floatAvgKor = (float) intSumKor / n;
		float floatAvgEng = (float) intSumEng / n;
		float floatAvgMath = (float) intSumMath / n;
		float floatAvgTotal = (floatAvgKor + floatAvgEng + floatAvgMath) / 3;
		System.out.printf("총점 : %4d\t%4d\t%4d\n", intSumKor, intSumEng, intSumMath);
		System.out.printf("평균 : %.2f\t%.2f\t%.2f\n", floatAvgKor, floatAvgEng, floatAvgMath);
		System.out.printf("총 평균 : %.2f\n", floatAvgTotal);
		System.out.println("===========================");
	}

}

//혼자서 하다가 중간에 막혔었는데 선생님이 for 문을 3개 사용하라고 하셔서 그걸 듣고
//for 문을 3개 만들어서 해결 할 수 있었다 다시 한 번 유심히 코드를 분석해보는게 좋을 것 같다
