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

/*
 * 1. StudentService 인터페이스를 implements 하여 클래스 작성
 * 2. loadStudent() method에서 student.txt 파일을 읽어 정보를 추출한 후
 * 		List<StudentVO> studentList 추가
 * 3. StudentServiceImplV1 생성자에서
 * 		loadStudent()를 호출 자동으로 학생 정보(list) 생성
 */
public class StudentServiceImplV1 implements StudentServcie {

	protected List<StudentVO> studentList;
	protected Scanner scan;

	public StudentServiceImplV1() {

		studentList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);

		//this.loadStudent();
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		String fileName = "src/com/callor/student/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;

				String[] student = reader.split(":");
				StudentVO studentVO = new StudentVO();
				studentVO.setNum(student[0]);
				studentVO.setName(student[1]);
				studentVO.setGrade(student[2]);
				studentVO.setDept(student[4]);
				studentVO.setAddress(student[5]);

				studentList.add(studentVO);

			}//end while
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.printStudent();

	} // end loadStudent

	/*
	 * 1. StudentService 인터페이스를 implements 하여 클래스 작성
	 * 2. getStudent() 메서드에 학생의 학번을 파라메터로 전달하고
	 * 		StudentList 에서 해당 학번의 학생을 찾기
	 * 3. 학생정보가 있으면 해당 학번 학생의 VO정보를 return
	 * 		없으면 null을 return
	 */
	@Override
	public StudentVO getStudent(String num) {
		// TODO Auto-generated method stub
		// 1번 코드
		StudentVO studentVO = null;
		
		int nSize = studentList.size();
		for(int i = 0 ; i < nSize ; i++) {
			StudentVO vo = studentList.get(i);
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
		
		// 2번 코드
		// 새로운 코드
		for(StudentVO vo : studentList) {
			if(vo.getNum().equals(num)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(60));
		System.out.println("학번\t이름\t학년\t학과\t주소");
		System.out.println("=".repeat(60));

		for (int i = 0; i < studentList.size(); i++) {
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
