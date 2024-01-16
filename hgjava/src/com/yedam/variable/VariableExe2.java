package com.yedam.variable;

import java.util.Scanner;

public class VariableExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 이름입력 (=name), 연락처(=phone) : scn.nextLine()
		System.out.println("이름 입력>>>");
		String name = scn.nextLine();
		System.out.println("연락처 입력>>>");
		String phone = scn.nextLine();

		// 영어(=eng), 수학(=mat) => 합계(=sum) : scn.nextInt()
		System.out.println("영어 입력>>>");
		int eng = scn.nextInt();
		System.out.println("수학 입력>>>");
		int mat = scn.nextInt();
		int sum = eng + mat;

		// 이름: 홍길동, 연락처: 010-1111-2222
		// 영어: 80, 수학: 85. 합계: 165.
		System.out.println("이름: " + name + ", 연락처: " + phone);
		System.out.println("영어: " + eng + ", 수학: " + mat + ". 합계: " + sum);

		scn.close();
	}
}
