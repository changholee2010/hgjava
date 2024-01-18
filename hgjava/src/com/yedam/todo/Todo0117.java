package com.yedam.todo;

import java.util.Scanner;

public class Todo0117 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 친구3명의 이름과 연락처를 입력하도록..메세지출력.
		// 입력완료.
		String str = "";
		for (int i = 1; i <= 3; i++) {
			System.out.println("이름>>>");
			str += "이름: " + scn.nextLine() + "\n";
			System.out.println("연락처>>>");
			str += "연락처: " + scn.nextLine() + "\n";
			str += "========================\n";
		}
		System.out.println(str);
		// 이름: 홍길동
		// 연락처: 010-1111-2222
		// ====================
		// 이름: 김길동
		// 연락처: 010-2222-3333
		// ====================
		// 이름: 박길동
		// 연락처: 010-3333-4444
		// ====================
	}
}
