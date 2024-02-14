package com.yedam.io.emp;

import java.io.IOException;

public class SystemExe {
	public static void main(String[] args) {
		while (true) {
			System.out.println("입력>>");
			try {
				int input = System.in.read();
				if(input == 57) {
					break;
				}
				System.in.read();// 13
				System.in.read();// 10
				System.out.println( input);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end.");
	}
}
