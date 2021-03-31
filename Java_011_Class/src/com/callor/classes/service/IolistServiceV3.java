package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV3 extends IolistServiceV1 {

	@Override
	public void input() {
		System.out.println("======================");
		System.out.println("매입 매출 등록");
		System.out.println("----------------------");
		System.out.print("상품명 (QUIT: 입력중단) >> ");
		String name = scan.next();
		if (name == "QUIT") {
			return;
		}

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
		Integer buyCost = this.inputPrice("매입");
		if (buyCost == null) {
			return;
		}
		Integer sellCost = this.inputPrice("매출");
		if (sellCost == null) {
			return;
		}

		IolistVO vo = new IolistVO();
		vo.setName(name);
		vo.setDate(date);
		vo.setCom(com);
		vo.setSellNBuy(sellNBuy);
		vo.setValue(value);
		vo.setBuyCost(buyCost);
		vo.setSellCost(sellCost);

		iolist.add(vo);

	}

	private Integer inputPrice(String title) {

		while (true) {

			System.out.println(title + "단가를 입력하세요");
			System.out.println(title + "단가는 0 이상 입력하세요");
			System.out.println("-1을 입력하면 입력을 중단합니다");
			System.out.print(title + "단가 >> ");
			Integer price = scan.nextInt();
			if (price == -1) {
				return null;
			} else if (price < 0) {
				System.out.println(title + " 단가는 0 이상을 입력하세요");
			} else {
				return price;
			}

		}

	}

}
