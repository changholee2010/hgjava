package com.yedam.todo;

import java.util.Scanner;

public class Todo0116 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		while (true) {
			// 추가작어.ㅁ.......
			// 2024.01.16 수정.
			System.out.println("값을 입력>>> ");
			String input = scn.nextLine();
			if (input.equals("quit")) {
				// input.equals("quit")
				break;
			}
			System.out.printf("입력값은 %s입니다.", input);
			System.out.println();
			// 입력값은 홍길동 입니다.

		}
		// "quit" 값이 들어오면 <<end of prog>>
		System.out.println("end of prog.");
	}
}
