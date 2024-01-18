package com.yedam.reference;

import java.util.Scanner;

// 친구의 정보를 저장하고 변경하고...관리.
// Create, Read, Update, Delete.
public class FriendExe {

	public static void main(String[] args) {
		Friend f1 = new Friend();
		f1.name = "홍길동";
		f1.weight = 66.7;
		f1.score = 78;
		Friend f2 = new Friend();
		f2.name = "김길동";
		f2.weight = 66.7;
		f2.score = 83;
		Friend f3 = new Friend();
		f3.name = "박길동";
		f3.weight = 66.7;
		f3.score = 80;

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Friend[] friends = new Friend[5]; // {f1,f2,f3,null,null}
		friends = new Friend[] { f1, f2, f3, null, null }; // 초기값을 사용.

		int score = 0;
		double weight = 0;
		while (run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.점수조회 6.분석 9.종료");
			// 5=> 입력점수 이상인 친구.
			// 6=> 평균점수: 85점, 최고점수: 90점
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 등록.
				String name, sweight, sscore;
				name = sweight = sscore = "";

				while (true) {
					System.out.print("이름>>> ");
					name = scn.nextLine();
					System.out.print("몸무게>>> ");
					sweight = scn.nextLine();
					System.out.print("점수>>> ");
					sscore = scn.nextLine();

					if (name.equals("") || sweight.equals("") || sscore.equals("")) {
						System.out.println("필수입력항목!!");
						continue;
					}
					break;
				}
				// 값을 입력했으면 정상진행.
				weight = Double.parseDouble(sweight);
				score = Integer.parseInt(sscore);

				Friend friend = new Friend();
				friend.name = name;
				friend.weight = weight;
				friend.score = score;

				// 비어있는 위치 한건입력 종료.
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
				System.out.println("정상적 입력.");
				break;

			case 2: // 조회.
				// 전체목록..이름:홍길동, 몸무게:77.2kg, 점수: 80점.
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null)
						System.out.printf("%s 의 몸무게는 %.1fkg 점수는 %d\n", friends[i].name, friends[i].weight,
								friends[i].score);
				}
				break;

			case 3: // 수정.
				// 친구이름 -> 점수 수정.
				weight = -1;
				score = -1;
				System.out.print("조회할 이름>>> ");
				name = scn.nextLine();

				// 존재여부 체크.
				boolean isExist = false;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].name.equals(name)) {
						// 추가정보...입력.
						System.out.print("수정 몸무게>>> ");
						sweight = scn.nextLine();
						if (!sweight.equals("")) {
							weight = Double.parseDouble(sweight);
						}
						System.out.print("수정 점수>>> ");
						sscore = scn.nextLine();
						if (!sscore.equals("")) {
							score = Integer.parseInt(sscore);
						}

						friends[i].score = (score != -1) ? score : friends[i].score;
						friends[i].weight = (weight != -1) ? weight : friends[i].weight;
						isExist = true;
					}
				}
				if (isExist)
					System.out.println("수정완료.");
				else
					System.out.printf("는 친구목록에 없습니다.\n", name);
				break;

			case 4: // 삭제.
				System.out.print("삭제할 이름>>> ");
				name = scn.nextLine();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].name.equals(name)) {
						friends[i] = null;
						break;
					}
				}
				System.out.println("삭제완료!");
				break;

			case 6: // 분석.
				// 평균: 최고점수:
				int max = 0, cnt = 0;
				double avg = 0, sum = 0;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						if (max < friends[i].score) {
							max = friends[i].score;
						}
						sum += friends[i].score;
						cnt++;
					}
				}
				avg = sum / cnt;
				System.out.printf("분석정보=>  평균: %.1f, 최고점수: %d\n", avg, max);
				break;

			case 9: // 종료.
				run = false;

				System.out.println("종료합니다.");
			}
		} // end of while.
		System.out.println("end of prog.");
	} // end of main.
}
