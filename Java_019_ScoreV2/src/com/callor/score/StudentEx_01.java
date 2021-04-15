package com.callor.score;

import com.callor.score.service.StudentServcie;
import com.callor.score.service.impl.StudentServiceImplV1;

public class StudentEx_01 {

	public static void main(String[] args) {

		StudentServcie ssV1 = new StudentServiceImplV1();
		ssV1.getStudent("00155");
		
	}

}
