package com.rudgjs.standard.impl;

import java.util.List;
import java.util.Scanner;

import com.rudgjs.standard.MenuService;

public class MenuServiceImplV1 implements MenuService {
	/*
	 * 사용자에게 업무리스트를 보여주고 
	 * 업무 번호를 입력하면 해당하는 
	 * 업무 번호를 return QUIT 를 입력하면 
	 * null을 return
	 */

	protected String title;
	protected List<String> menuList;
	protected Scanner scan;

	/*
	 * 생성자에서 매개변수 선언 MenuServiceImplV1 클래스를 사용하여 
	 * 객체를 생성할때는 title 변수와 menuList에 값을
	 * 담아서 파라메터로 전달하고 생성자를 호출을 해야 한다.
	 * 
	 * new MenuServiceImplV1( , ) 형식으로 작성해야한다 
	 * 반드시 String, List형 두개의 값을 전달해줘야한다 
	 * new MenuServiceImplV1(title, menuList) 형식으로 작성
	 */
	public MenuServiceImplV1(String title, List<String> menuList) {

		// 객체를 생성할때 전달한 매개변수 title을
		// 멤버변수 this.title

		this.title = title;
		this.menuList = menuList;
		scan = new Scanner(System.in);

	}

	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println("=".repeat(50));
			System.out.println(title);
			System.out.println("-".repeat(50));
			int nSize = menuList.size();
			for (int menuIndex = 0; menuIndex < nSize; menuIndex++) {

				System.out.printf("%d. %s\n", menuIndex + 1, menuList.get(menuIndex));
			}
			System.out.println("QUIT : 종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택 >> ");
			String strM = scan.nextLine();
			if (strM.equals("QUIT")) {
				return null;
			}
			Integer intM = null;

			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.printf("업무는 1 ~ %d 또는 QUIT 만 입력하세요\n", nSize);
				continue;
			}
			if (intM < 1 || intM > nSize) {
				System.out.printf("업무는 1 ~ %d 까지 입력하세요\n", nSize);
				continue;
			}
			return intM;

		}

	}

}
