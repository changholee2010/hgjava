package com.yedam.classes.friend;

import java.util.Scanner;

public class FriendExe {
	public static void main(String[] args) {
		// 메뉴: 1.등록 2.목록 3.수정 4.삭제 9.종료.
		// 사용자의 입력/ 처리결과 콘솔출력.
		Scanner scn = new Scanner(System.in);

		// 다른 기능이 필요한 경우.
		// 로그인 기능.(id,pw,name)
		UserApp uapp = new UserApp();

		while (true) {
			System.out.println("id >>>");
			String id = scn.nextLine();
			System.out.println("pw >>>");
			String pw = scn.nextLine();

			User user = uapp.login(id, pw);

			if (user != null) {
				System.out.printf("%s 님, 환영합니다", user.getName());
				break;
			}
			System.out.println("id와 pw 를 확인!!");
		}

		boolean run = true;
		while (run) {
			// 기능....
		}
		System.out.println("end of prog.");

	}
}
