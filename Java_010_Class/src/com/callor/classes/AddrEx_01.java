package com.callor.classes;

import com.callor.classes.model.AddressVO;

public class AddrEx_01 {

	public static void main(String[] args) {

		AddressVO aVO = new AddressVO();
		aVO.setName("홍길동");
		aVO.setAddr("서울시");
		aVO.setTel("010-31353-135");
		aVO.setAge(200);
		
		System.out.println(aVO.getName() + "의 나이는 ? : " + aVO.getAge());
		
		
		
		
		

	}

}
