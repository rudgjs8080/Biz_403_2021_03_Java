package Java.Home.Key.april.service.impl;

import java.util.Scanner;

import Java.Home.Key.april.service.InputService;

public class InputServiceImpleV1 implements InputService {

	Scanner scan;

	public InputServiceImpleV1() {

		scan = new Scanner(System.in);

	}

	@Override
	public Integer inputValue(String title) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(title + " 값을 입력하세요(QUIT : 입력 종료)");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				System.out.println("입력 취소");
				return null;
			}

			Integer intNum = null;

			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("정수만 입력해주세요");
				continue;
			}
			return intNum;
		} // end while

	}

	@Override
	public Integer inputValue(String title, int start) {

		title = String.format("%s (%d 이상)", title, start);
		Integer intNum = null;
		while (true) {
			intNum = Integer.valueOf(this.inputValue(title));
			if (intNum != null) {
				if (intNum < start) {
					System.out.printf("%d 이상 값을 입력해주세요", start);
					continue;
				}
			} else {
				return null; // 이 부분이 좀 다름
			}
			return intNum;
		}

	}

	@Override
	public Integer inputValue(String title, int start, int end) {

		title = String.format("%s (%d ~ %d)의 ",start,end);
		Integer intNum = null;
		while(true) {
			intNum = Integer.valueOf(this.inputValue(title));
			if(intNum != null) {
				if(intNum < start || intNum > end) {
					System.out.printf("%d ~ %d 값을 입력해주세요",start,end);
					continue;
				}
			}
			return intNum;
		}
		
		
		
	}

}
