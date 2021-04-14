package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * student.txt 파일을 통해
 * 데이터를 불러와 출력하기 
 */
public class Student_01A {
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
			
			/*
			 * ===========================
			 * while(true) 반복문의 사용
			 * 1. 조건없이 무한반복을 수행하는 코드
			 * 2. 무한반복 코드를 수행하는 과정에서
			 * 		if() 조건문을 추가하여 반복을 중단하기
			 * 3. 무한반복 조건을 부여하여 탈출구를 만들때
			 * 		일반적으로 쉽게 구현할 수 있는 코드
			 * 4. if() 조건문이 필요하고
			 * 		때로는 추가되는 코드가 필요하기도 하다
			 * 5. 무한반복 코드가 실행되는 동안에
			 * 		탈출구를 어떻게 만들지 고민해야하고
			 * 6. 다양한 방법의, 다양한 조건의 탈출구를
			 * 		필요할 때 적절하게 구현할 수 있다
			 * 
			 */
			
			/*while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break; 
					// 파일을 모두 다 읽고 나면 null 값이 나오기 때문에
					// null 값을 나왔을 때 break; 해주면 된다
				}
				//System.out.println(reader);
			}
			*/
			
			/*
			 * ===============================
			 * while(조건식) 무한반복문
			 * 1. 무한반복코드가 중단되는 조건이 
			 *  	한개만 있을 경우 사용하기
			 * 2. 조건식을 어떻게 만들것인가 잘 구상해야 한다
			 * 3. while(조건식)이 시작되기 전에
			 * 		최초에 조건이 true가 되도록 만들어야 한다
			 * 4. 적절하게 탈출을 하려면 
			 * 		코드내에서 조건식이 false가 되도록 연산을
			 * 		수행해야 한다
			 * 5. 코드내에서 조건이 false가 되더라도
			 * 		이후의 명령들이 한 번씩 실행되고 나서
			 * 		탈출이 이뤄진다
			 */
			// 문자열 변수 reader를 null이 아닌 값으로
			// 생성하기
			
			String reader = new String();
			
			// 최초에 while()문에서 reader != null은 true 가된다
			// != null 조건문을 실행하기 전에
			// reader = buffer.readLine()을 실행하고
			// reader 저장된 값이 null 인지 비교한다
			// 1. reader = buffer.readLine()을 실행하고
			// 2. reader 에 저장된 값을 마치 method가
			// 		return 하는 것처럼 작동한다
			// 3. () return 하는 값이 null 이 아닌가를 비교한다
			// 4. 그 결과가 true 이면 계속 코드 진행
			// 5. 그 결과가 false 이면 즉시 while 명령이 끝난다
			while((reader = buffer.readLine()) != null) {
				//reader = buffer.readLine();
				
				String students[] = reader.split(":");
				System.out.printf("%s\t%s\n",students[1],students[5]);
			}
			System.out.println("=".repeat(50));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

		} catch (IOException e) {
			// TODO Auto-generated catch block //buffer
			e.printStackTrace();
		}

	}
}
