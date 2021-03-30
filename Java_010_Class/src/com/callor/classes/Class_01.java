package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

/*
 * 1. Random 클래스를 이용하여 50~100까지 중 난수 1개를 생성합니다
 * 2. 2~(난수-1)까지 수 중에서 생성된 난수의 약수들을 찾아 배열에 저장합니다
 *  * 난수의 약수 = 난수 % i == 0 인  i 값
 * 3. 배열에 저장된 리스트를 출력합니다
 */

/*
 * 시간안에 만들지는 못했는데 좀 더 생각해보면 만들수 있을것 같다
 * 내가 한 풀이의 방향이 맞는지 확인해봐야겠다
 */
public class Class_01 {

	public static void main(String[] args) {

		Random rd = new Random();

		int num = 0;

		num = rd.nextInt(51) + 50;

		System.out.println(num);
		int[] div = new int[num];

		while (num < 101) {

			int i = 2;
			int n = 0;
			if (num % i == 0) {
				div[0] = i;
				i++;
				n++;
			} else {
				i++;
			}

		}
		System.out.println(Arrays.toString(div));

	}

}
