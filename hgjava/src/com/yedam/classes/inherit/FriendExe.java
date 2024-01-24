package com.yedam.classes.inherit;

import java.util.Scanner;

public class FriendExe {
	// 사용자입력/처리결과 출력 => 컨트롤.
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		FriendApp app = new FriendApp();

		while (run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 9.종료");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 등록. 1)이름연락처 2)학교친구 3)회사친구
				int subMenu = -1;
				while(true) {
					System.out.println("1.친구 2.회사 3.학교 ");
					try {
						subMenu = Integer.parseInt(scn.nextLine());
						break;
					} catch(NumberFormatException e) {
						System.out.println("메뉴를 다시 선택.");
					}
				}
				System.out.print("이름>> ");
				String name = scn.nextLine();
				System.out.print("연락처>> ");
				String phone = scn.nextLine();

				Friend friend = null;
				if (subMenu == 1) {
					friend = new Friend();
					friend.setName(name);
					friend.setPhone(phone);

				} else if (subMenu == 2) {
					CompFriend cfriend = new CompFriend();
					cfriend.setName(name);
					cfriend.setPhone(phone);

					System.out.print("회사>> ");
					String company = scn.nextLine();
					System.out.print("부서>> ");
					String dept = scn.nextLine();
					cfriend.setCompany(company);
					cfriend.setDept(dept);

					friend = cfriend;

				} else if (subMenu == 3) {
					UnivFriend ufriend = new UnivFriend();
					ufriend.setName(name);
					ufriend.setPhone(phone);

					System.out.print("학교>> ");
					String univ = scn.nextLine();
					System.out.print("전공>> ");
					String major = scn.nextLine();
					ufriend.setUniv(univ);
					ufriend.setMajor(major);

					friend = ufriend;

				}

				if (app.add(friend)) {
					System.out.println("정상 등록.");
				} else {
					System.out.println("등록 안됨.");
				}
				break;

			case 2: // 목록(이름)
				System.out.print("조회할 이름>>> "); // 홍길동/ ""
				String fname = scn.nextLine();
				Friend[] list = app.list(fname);
				for (int i = 0; i < list.length; i++) {
					if (list[i] != null) {
						System.out.println(list[i].toString());
					}
				}
				break;

			case 3: // 수정.
				System.out.print("수정 연락처>>> "); // 홍길동/ ""
				String fphone = scn.nextLine();
				Friend frnd = app.getFriend(fphone);
				String info1 = "", info2 = "";
				if (frnd instanceof UnivFriend) {
					System.out.print("학교>>> "); // 홍길동/ ""
					info1 = scn.nextLine();
					System.out.print("전공>>> "); // 홍길동/ ""
					info2 = scn.nextLine();

				} else if (frnd instanceof CompFriend) {
					System.out.print("회사>>> "); // 홍길동/ ""
					info1 = scn.nextLine();
					System.out.print("부서>>> "); // 홍길동/ ""
					info2 = scn.nextLine();
				}

				if (app.modify(fphone, info1, info2)) {
					System.out.println("정상 처리.");
				} else {
					System.out.println("정보 없음.");
				}
				break;

			case 4: // 삭제.
				System.out.print("삭제할 연락처 >>> "); // 홍길동/ ""
				String dphone = scn.nextLine();

				if (app.remove(dphone)) {
					System.out.println("정상 처리.");
				} else {
					System.out.println("정보 없음.");
				}
				break;

			case 9:
				System.out.println("종료합니다.");
				run = false;

			} // end of switch.
		} // end of while.

		System.out.println("end of prog.");
		scn.close();
	}
}
