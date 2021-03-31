package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.IolistVO;

/*
 * IolistVO는 1개의 데이터를 담을 수 있도록 설계하였다
 * 실제 프로젝트에서는 1개의 데이터만 있는 경우는 없다
 * 
 * 여러개의 데이터 묶음으로 연산을 수행해야 한다
 * 데이터의 묶음을 처리할때는 보통 배열을 많이 사용한다
 * 하지만 배열은 그 구조상 사용이 다소 불편할때가 많다
 * Java에서는 배열을 사용해야 하는 프로젝트에서 
 * 		List 클래스를 사용한 객체를 생성하여 진행을 한다
 */

public class IolistServiceV1 {

	/*
	 * 매입매출 데이터들을 사용하여 연산을 수행할텐데 매입매출데이터들의 묶음을 List 형 객체 사용하겠다
	 * 
	 * List형 객체에 포함된 (개별)데이터는 IolistVO 형으로 사용하겠다 라는 선언
	 * 
	 * 낱개 데이터는 IolistVO 클래스 형으로 사용하고 그 데이터들을 묶어서 List 형으로 연산 수행을 하겠다 라는 선언
	 */

	// 혹시 외부에서 iolist 데이터에 접근하여 값을 저장하는
	// 일을 방지하기 위해 private 를 사용한다
	// V1 클래스를 상속하여 사용할 예정이라면 protected 로 선언을 한다
	protected List<IolistVO> iolist;
	// TODO
	protected Scanner scan;

	// TODO
	public IolistServiceV1() {
		iolist = new ArrayList<IolistVO>();
		scan = new Scanner(System.in);

	}

	// TODO 매입매출 등록하기
	public void input() {

		System.out.println("======================");
		System.out.println("매입 매출 등록");
		System.out.println("----------------------");
		System.out.print("상품명 >> ");
		String name = scan.next();

		System.out.print("거래일자(yyyy-mm-dd >> ");
		String date = scan.next();

		System.out.println("거래처명 >> ");
		String com = scan.next();

		System.out.println("매입매출 구분 >> ");
		String sellNBuy = scan.next();

		System.out.println("수량 >> ");
		Integer value = scan.nextInt();

		System.out.println("매입 단가 >> ");
		Integer buyCost = scan.nextInt();

		System.out.println("매출 단가 >> ");
		Integer sellCost = scan.nextInt();

		IolistVO iolistVO = new IolistVO();
		iolistVO.setName(name);
		iolistVO.setDate(date);
		iolistVO.setCom(com);
		iolistVO.setSellNBuy(sellNBuy);
		iolistVO.setValue(value);
		iolistVO.setBuyCost(sellCost);
		iolistVO.setSellCost(sellCost);

		// iolistVO에 저장한 데이터를 확인하기
		this.printIolist(iolistVO);
		// 입력된 매입매출 데이터를 데이터 리스트에 담기
		iolist.add(iolistVO);

	} // end input
		// TODO 저장된 리스트 출력하기

	public void printAllList() {
		System.out.println("=".repeat(50));
		System.out.println("매입매출 리스트");
		System.out.println("-".repeat(50));
		System.out.println("상품명\t거래일\t거래처\t구분\t수량\t매입단가\t매출단가\n");

		for (int i = 0; i < iolist.size(); i++) {
			IolistVO vo = iolist.get(i);
			this.printIolist(vo);
			// this.printIolist(iolist.get(i));
			// 두 줄의 코드를 한 줄로 줄일 수 있다
		}
		System.out.println("=".repeat(50));

	}

	// TODO 한개 데이터 출력하기
	public void printIolist(IolistVO vo) {
		System.out.println("=".repeat(50));
		System.out.println("상품명\t거래일자\t거래처명 구분\t수량\t매입단가 매출단가");
		System.out.println("-".repeat(50));
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getCom() + "\t");
		System.out.print(vo.getSellNBuy() + "\t");
		System.out.print(vo.getValue() + "\t");
		System.out.print(vo.getBuyCost() + "\t");
		System.out.print(vo.getSellCost() + "\t");

	}

	/*
	 * public 으로 선언된 method는 객체.method() 형식으로 호출이 가능한 method return type이 명확히 결정되지
	 * 않았을때는 void 형으로 작성을 한다
	 */
	public void selectMenu() {
		while (true) {
			System.out.println("===========================");
			System.out.println("KMS 쇼핑몰 업무관리");
			System.out.println("---------------------------");
			System.out.println("1. 매입매출 등록");
			System.out.println("2. 매입매출 리스트 출력");
			System.out.println("QUIT. 업무종료");
			System.out.println("---------------------------");
			System.out.println("업무 선택 >> ");
			// 놓침
			
			Integer selectJob = scan.nextInt();
			if (selectJob == 1) {
				this.input();
			} else if (selectJob == 2) {
				this.printAllList();
			} else if (selectJob == 0) {
				break;
			}

		} // end while
		System.out.println("업무가 종료되었습니다");
	}

}
