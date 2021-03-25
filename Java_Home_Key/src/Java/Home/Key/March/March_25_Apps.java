package Java.Home.Key.March;

import java.util.Random;

/*
 * 1. 정수형 배열 20개를 선언합니다
 * 2. Random 클래스를 사용하여 50~100까지 난수를 생성하여 배열에 저장합니다
 * 3. 배열에 저장된 정수 중 Prime(소수)인 수들의 리스트를 출력합니다
 */
public class March_25_Apps {

	public static void main(String[] args) {

		int n = 20;
		int[] intNum = new int[n];

		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			intNum[i] = rd.nextInt(51) + 50;
			int j = 0;
			for (j = 2; j < intNum[i]; j++) {

				if (intNum[i] % j == 0) {
					break;
				}
			}
			if (intNum[i] ==j) {
				System.out.println(intNum[i] + " 는 소수");
			} 

		}

	}

}
