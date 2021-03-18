package com.callor.var;

public class Varriable_01 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		num1 = 33;
		num2 = 55;
		
		int sum = num1 + num2;
		int minus = num2 - num1;
		int times = num1 * num2;
		int div = num2 / num1;
		
		System.out.println("===============");
		System.out.println(sum);
		System.out.println(minus);
		System.out.println(times);
		System.out.println(div);
		System.out.println("===============");
		System.out.printf("%d + %d = %d\n",num1,num2,sum);
		System.out.printf("%d - %d = %d\n",num2,num1,minus);
		System.out.printf("%d * %d = %d\n",num1,num2,times);
		System.out.printf("%d / %d = %d\n",num2,num1,div);
		System.out.println("===============");
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num2 + " - " + num1 + " = " + minus);
		System.out.println(num1 + " * " + num2 + " = " + times);
		System.out.println(num2 + " / " + num1 + " = " + div);
		System.out.println("===============");
	}

}
