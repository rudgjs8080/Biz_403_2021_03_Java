package com.callor.score.service;

import com.callor.score.model.StudentVO;

public interface StudentServcie {
	public void insertStudent();
	public void loadStudent();
	/*
	 * 학번으로 학생정보를 검색(조회)하여
	 * 학생정보가 담긴 VO를 return 하는 method
	 */
	public StudentVO getStudent(String num);
	public void printStudent();
}
