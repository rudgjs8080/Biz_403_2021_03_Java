package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV2 extends IolistServiceV1 {

	/*
	 * V1의 input method를 재정의한다 매입단가, 매출단가는 반드시 0 이상이어야한다 유효성 검사를 하도록 코드를 재정의 한다
	 */
	@Override
	public void input() {
		// TODO 매입매출 등록
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

		Integer value = 0;
		while (true) {
			System.out.println("수량 >> ");
			value = scan.nextInt();
			if (value < 0) {
				System.out.println("수량을 다시 입력해주세요");
			} else {
				break;
			}

		}
		Integer buyCost = 0;
		while (true) {
			System.out.println("매입 단가 >> ");
			buyCost = scan.nextInt();
			if (buyCost < 0) {
				System.out.println("매입단가를 다시 입력해주세요");
			} else {
				break;
			}
		}

		Integer sellCost = 0;
		while (true) {
			System.out.println("매출 단가 >> ");
			sellCost = scan.nextInt();
			if (sellCost < 0) {
				System.out.println("매출 단가를 다시 입력해주세요");
			} else {
				break;
			}
		}

		IolistVO vo = new IolistVO();
		vo.setName(name);
		vo.setDate(date);
		vo.setCom(com);
		vo.setSellNBuy(sellNBuy);
		vo.setValue(value);
		vo.setBuyCost(buyCost);
		vo.setSellCost(sellCost);

		// iolistVO에 저장한 데이터를 확인하기
		this.printIolist(vo);
		// 입력된 매입매출 데이터를 데이터 리스트에 담기
		iolist.add(vo);
	}

}
