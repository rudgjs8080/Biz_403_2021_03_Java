package Java.Home.Key.april;

import java.util.Random;

import Java.Home.Key.april.service.Java_007_Application_EvenServiceV1;

public class April_11_Study {
	public static void main(String[] args) {
		//Java_004_Control	Controller_01
		/*int sum3 = 0;
		int sum4 = 0;
		int sum35 = 0;
		System.out.println("=".repeat(30));
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 3 == 0) {
				sum3 += i;
			}
			if(i % 4 == 0) {
				sum4 += i;
			}
			if(i % 3 == 0 && i % 5 ==0) {
				sum35 += i;
			}
		}
		System.out.println("3의 배수의 합 : " + sum3);
		System.out.println("4의 배수의 합 : " + sum4);
		System.out.println("3의 배수이면서 5의 배수인 합 : " + sum35);
		System.out.println("=".repeat(30));
		System.out.println("Success Coding");
		*/ 
		
		//Java_004_Control	Controller_11
		
		Random rd = new Random();
		/*
		
		for(int i = 0 ; i < 5 ; i++) {
			int prime = rd.nextInt(100)+1;
			if(prime % 3 == 0) {
				System.out.println(prime + " 는(은) 3의 배수임");
			}else {
				System.out.println(prime + " 는(은) 3의 배수가 아님");
			}
		}
		System.out.println("Success Coding");
		*/
		
		//Java_004_Control	Controller_12
		/*int num = 0;
		int sum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			num = rd.nextInt(100)+1;
			if(num % 3 == 0) {
				System.out.println(num + "는(은) 3의 배수");
				sum += num;
			}
		}
		System.out.println("=".repeat(40));
		System.out.println("합계 : " + sum);
		System.out.println("Success Coding");
		*/
		
		//Java_004_Control	Controller_13
		/*
		int num = 0;
		int sum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			num = rd.nextInt(100)+1;
			if(num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println("=".repeat(30));
		System.out.println("합계 : " + sum);
		System.out.println("=".repeat(30));
		System.out.println("Success Coding");
		*/
		
		// Java_004_Control	Controller_14
		/*
		int kor = rd.nextInt(100)+1;
		int eng = rd.nextInt(100)+1;
		int math = rd.nextInt(100)+1;
		
		int sum = kor + eng + math;
		float avg = (float)sum/3;
		
		System.out.println("=".repeat(30));
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("-".repeat(30));
		System.out.printf("총점 : %d,\t평균 : %.2f\n",sum,avg);
		System.out.println("Success Coding");
		*/
		
		//Java_004_Control	Controlloer_15
		
		/*
		int sum = 0;
		System.out.println("=".repeat(40));
		for(int i = 0 ; i < 10 ; i++) {
			int stu = rd.nextInt(100)+1;
			System.out.printf("학생%d : %d\n",i+1,stu);
			sum += stu;
		}
		float avg = (float)sum/10;
		System.out.println("-".repeat(40));
		System.out.printf("총점 : %d,\t평균 : %.2f\n",sum,avg);
		System.out.println("Success Coding");
		*/
		
		//Java_005_Application	App_01
		/*
		int num = rd.nextInt(26)+25;
		System.out.println("학생수는 : " + num + " 명 입니다");
		if(num % 6 == 0) {
			System.out.println("주문해야 할 피자는 " + (num / 6) + "판 입니다");
		} else if(num % 6 != 0) {
			System.out.println("주문해야 할 피자는 " + ((num / 6)+1) + "판 입니다");
		}
		*/
		
		//Java_005_Application	App_03
		/*
		int[] intScores = new int[10];
		int sum = 0;
		
		
		for(int i = 0 ; i < 10 ; i++) {
			intScores[i] = rd.nextInt(51)+50;
			sum += intScores[i];
		}
		float avg = (float)sum/10;
		System.out.println("=".repeat(30));
		System.out.printf("총점 : %d\t 평균 : %.2f\n",sum,avg);
		System.out.println("=".repeat(30));
		System.out.println("Success Coding");
		*/
		
		//Java_005_Applicaton	App_04
		/*
		int n = 5;
		int pizza = 0;
		int sum = 0;
		System.out.println("=".repeat(40));
		System.out.printf("인원수\t피자 주문\t전체조각 수\n");
		System.out.println("-".repeat(40));
		for(int i = 0 ; i < n ; i++) {
			int numStu = rd.nextInt(10)+50;
			
			if(numStu % 6 == 0) {
				pizza = (numStu / 6);
			}else if(numStu % 6 != 0) {
				pizza = (numStu / 6) + 1;
			}
			sum += pizza;
			System.out.printf("%d\t%d\t%d\t\n",numStu,pizza,pizza*6);
		}
		System.out.println("=".repeat(40));
		System.out.println("전체 주문 BOX 수량 : " + sum);
		System.out.println("Success Coding");
		*/
		
		// Java_005_Application	App_05
		/*
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int sum = 0;
		float avg = 0;
		
		System.out.println("=".repeat(60));
		System.out.printf("학번\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(60));
		for(int i = 0 ; i < 5 ; i++) {
			intKor = rd.nextInt(51)+50;
			intEng = rd.nextInt(51)+50;
			intMath = rd.nextInt(51)+50;
			sum = intKor + intEng + intMath;
			avg = (float)sum/3;
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n",(i+1),intKor,intEng,intMath,sum,avg);
		}
		System.out.println("=".repeat(60));
		System.out.println("Success Coding");
		*/
		
		// Java_005_Application		App_06
		/*
		int money = 3723560;
		int n = 50000;
		int nCount = 0;
		
		System.out.println("=".repeat(60));
		System.out.println("급여수령액 : " + money);
		System.out.println("=".repeat(60));
		
		for(int i = 0 ; n > 0 ; i++) {
			nCount  = money / n;
			System.out.println(n + " 원권 " + nCount + " 매");
			money %= n;
			if(i % 2 == 0) {
				n /= 5;
			}else {
				n /= 2;
			}
		}
		System.out.println("Success Coding");
		*/
		
		// Java_006_Application		App_01
		/*
		int[] num = new int[20];
		int sum = 0;
		for(int i = 0 ; i < 20 ; i++) {
			num[i] = rd.nextInt(100)+1;
			if(num[i] % 2 == 0) {
				System.out.println((i+1) + " 번째 수는 짝수 " + num[i]);
				sum += num[i];
			}
		}
		System.out.println("짝수들의 합 : " + sum);
		System.out.println("Success Coding");
		*/
		
		// Java_007_Application		App_01
		/*
		int[] prime = new int[20];
		int i = 0;
		int j = 0;
		for(i = 0 ; i < 20 ; i++) {
			prime[i] = rd.nextInt(51)+50;
			for(j = 2 ; j < prime[i] ; j++) {
				if(prime[i] % j == 0) {
					break;
				}
			}
			if(j >= prime[i]) {
				System.out.println((i+1) + " 번째 난수 " + prime[i] + " 는 소수 입니다");
			}
			else {
				System.out.println((i+1) + " 번째 난수 " + prime[i] + " 는 소수가 아닙니다");
			}
		}
		System.out.println("Success Coding");
		*/
		
		
		// Java_007_Application 	App_05
		/*
		Java_007_Application_EvenServiceV1 esV1 = new Java_007_Application_EvenServiceV1();
		
		esV1.makeNum(100);
		
		System.out.println("Success Coding");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
