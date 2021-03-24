package Java.Home.Key.March;

import java.util.Random;

public class March_24_Apps {

	public static void main(String[] args) {

		int[] intNum = new int[20];
		Random rd = new Random();
		int intSum = 0;
		for (int i = 0; i < 20; i++) {
			intNum[i] = rd.nextInt(100) + 1;
			if (intNum[i] % 2 == 0) {
				System.out.println((i + 1) + " 번째 수는 짝수" + intNum[i] + " 입니다");
				intSum += intNum[i];

			}

		}
		System.out.println("=================");
		System.out.println("합계는 : " + intSum);
	}

}
