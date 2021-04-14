package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * student.txt 파일을 통해
 * 데이터를 불러와 출력하기 
 */
public class Student_01 {
	public static void main(String[] args) {

		String fileName = "src/com/callor/score/Student.txt";
		
		// 선언하는 코드와 생성하는 코드를 분리하자
		// FileWriter, FileReader : 파일을 Open
		// PrintWriter, BufferReader : 내용을 쓰고 읽기
		
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			System.out.println("=".repeat(80));
			System.out.printf("이름\t\t주소\n");
			System.out.println("=".repeat(80));
			
			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break; 
					// 파일을 모두 다 읽고 나면 null 값이 나오기 때문에
					// null 값을 나왔을 때 break; 해주면 된다
				}

				String[] scores = reader.split(":");

				System.out.printf("%s\t%s\n",  scores[1],scores[5]);

			}
			System.out.println("=".repeat(80));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

		} catch (IOException e) {
			// TODO Auto-generated catch block //buffer
			e.printStackTrace();
		}

	}
}
