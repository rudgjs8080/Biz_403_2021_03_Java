package com.callor.values;

public class Values_04 {
	public static void main(String[] args) {
		System.out.printf("%3.1f\n",34.25678);
		System.out.printf("%3.2f\n",34.25678);
		System.out.printf("%3.3f\n",34.25678);
		System.out.printf("%3.4f\n",34.25678);
		// 3.1f => 정수는 3자리 나타내고 소수점 1째 자리까지 나타내고 뒤는 반올림해라
		System.out.printf("%d + %d = %3d\n",33,2,33+2);
		System.out.printf("%d - %d = %3d\n",33,2,33-2);
		System.out.printf("%d x %d = %3d\n",33,2,33*2);
		System.out.printf("%d / %d = %3d\n",33,2,33/2);
		System.out.printf("%d mod %d = %3d\n",33,2,33%2);// %를 쓰면 오류가 나온다 이때는 mod 를 사용해줘야한다
		
		System.out.printf("%d / %d = %3.1f\n",33,2,33/2.0);// 2.0으로 나누게 되면 소수점이 나타나기 때문에 3.1f로 나타내줘야한다.
		
	}
}
