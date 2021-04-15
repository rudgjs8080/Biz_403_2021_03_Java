package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentServcie;

public class StudentServiceImplV1A implements StudentServcie {

	protected List<StudentVO> studentList;
	protected Scanner scan;
	protected String studentFile;
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 반 = 3;
	protected final int 전공 = 4;
	protected final int 주소 = 5;
	
	/*
	 * new StudentServiceImplV1() 생성자를 호출하여
	 * 객체를 새성하려고 하면
	 * 고정된 파일이름("src/com/callor/student/student.txt")을
	 * 사용하여 파일을 읽을 수 있도록 할 예정이다
	 * 
	 * 생성자에서는 new StudentServiceImpleV1("파일명")의
	 * 생성자 method를 다시 호출하는 구조가 된다
	 */
	public StudentServiceImplV1A() {

		// 여기에서 다음의 생성자 메서드를 또 한번 호출
		// new StudentServiceImplV1A("src/com/callor/student/student.txt");
		
		// 여기서 this는 같은 클래스를 가져오는것과 같다
		// 대신 맨위에 있어야 한다
		this("src/com/callor/score/student.txt");
		
		scan = new Scanner(System.in);
	}
	
	public StudentServiceImplV1A(String fileName) {
		this.studentFile = fileName;
		studentList = new ArrayList<StudentVO>();
		// 클래스를 객체로 생성할 때 method를 호출하여
		// 데이터를 사용하도록 준비하는 것
		this.loadStudent();
		
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	/*
	 * student.txt 파일에서 학생정보를 읽어
	 * studentList에 데이터 준비하기
	 */
	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(this.studentFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				// 파일로부터 읽은 값이 null
				// 		(End of File)에 다다랐다
				if (reader == null)
					break;

				String[] student = reader.split(":");
				StudentVO studentVO = new StudentVO();
				studentVO.setNum(student[학번]);
				studentVO.setName(student[이름]);
				studentVO.setGrade(student[학년]);
				studentVO.setDept(student[전공]);
				studentVO.setAddress(student[주소]);
				
				//Debugging code
				//System.out.println(studentVO.toString());
				studentList.add(studentVO);

			}//end while
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(this.studentFile + "파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽는 동안 문제 발생");
		}
		//this.printStudent();

	} // end loadStudent

	@Override
	public StudentVO getStudent(String num) {
		// TODO Auto-generated method stub

		// 1번 코드
		
		int nSize = studentList.size();
		for (int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
			if (vo.getNum().equals(num)) {
				return vo;
			}
		}

		// 2번 코드
		// 새로운 for, forEach
		for (StudentVO vo : studentList) {
			if (vo.getNum().equals(num)) {
				return vo;
			}
		}

		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		int nSize = studentList.size();
		System.out.println("=".repeat(60));
		System.out.println("학번\t이름\t학년\t전공\t주소");
		System.out.println("=".repeat(60));
		
		/*
		 * 배열을 사용하여 for() 반복문을 구현할때는 
		 * 배열.length 속성을 직접 반복문의 조건으로 설정한다
		 * 		i < 배열.length
		 * 
		 * List 객체는 특성상 수시로 데이터의 개수가 변경된다
		 * List에 담긴 개수를 알려주는 size() method는
		 * 호출될 때마다 List에 담긴 데이터 개수를 다시
		 * 		헤아리는 코드가 실행된다
		 * for() 반복문 내에서 i < list.size() 코드를 사용하면
		 * for() 반복문이 반복되는 동안 계속해서 개수를
		 * 		헤아리게 된다
		 * 
		 * 데이터의 개수가 몇개 안될때는 큰 문제가 없지만 
		 * 데이터 개수가 많아지면 그만큼 성능이 떨어지게 된다
		 * 
		 * List 전체를 for() 반복문으로 사용하여 순회할때는
		 * 먼저 size() 값을 int형 변수에 담아놓고 시작하자 
		 */
		for (int i = 0; i < nSize ; i++) {
			StudentVO vo = studentList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getDept() + "\t");
			System.out.print(vo.getAddress() + "\n");

		}// end for
		System.out.println("=".repeat(60));
	} // end printStudent

}
