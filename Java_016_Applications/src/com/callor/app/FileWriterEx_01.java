package com.callor.app;
/*
 * 1. Random 클래스를 사용하여 0 ~ 100까지 범위의 난수 2개를 
 * 		생성한 후 4칙연산을 수행한다.
 * 2. FileWriter, PrintWriter 클래스를 사용하여
 * 		src/com/callor/app/data.txt 파일에 4칙연산 결과를
 * 		다음과 같이 저장한다
 * 		* 뺄셈과 나눗셈은 큰수 - 작은수, 큰수/ 작은수로 연산
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {

	public static void main(String[] args) {

		String fileName = "src/com/callor/app/data.txt";

		FileWriter fileWriter = null;
		PrintWriter out = null;
		Random rd = new Random();

		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			int num1 = rd.nextInt(101);
			int num2 = rd.nextInt(101);
			out.println("=".repeat(30));
			out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			if (num1 >= num2) {
				out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			} else {
				out.printf("%d - %d = %d\n", num2, num1, num2 - num1);
			}
			out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			if (num1 >= num2) {
				out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			} else {
				out.printf("%d / %d = %d\n", num2, num1, num2 / num1);
			}
			out.println("=".repeat(30));

			out.flush();
			out.close();
			System.out.println("저장완료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
