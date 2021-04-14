package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/word.txt";
		
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			System.out.println("=".repeat(40));
			int num = 1;
			while(true) {
				if(num % 30 == 1) {
					System.out.println("-".repeat(40));
					System.out.println((num/30 + 1) + " 일차");
				}
				String reader = buffer.readLine();
				if(reader == null) break;
				
				String[] voca = reader.split(":");
				System.out.printf("%10s\t %s\n",voca[0],voca[1]);
				num++;
			}
			System.out.println("=".repeat(40));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
