package com.yedam.collection.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		List<Employee> storage = new ArrayList<>();
		storage.add(new Employee(101, "Hong", new Date(), 100));
		storage.add(new Employee(102, "Hwang", new Date(), 200));

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		while (run) {
			System.out.println("1.등록 2.조회(입사일자) 3.삭제 9.종료");
			System.out.print("선택>> ");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				System.out.print("사번 이름 입사일자 급여>> ");
				String[] valAry = scn.nextLine().split(" ");
				boolean isOk = true;
				try {
					Employee newEmp = new Employee(Integer.parseInt(valAry[0]), // 사번
							valAry[1], // 이름
							sdf.parse(valAry[2]), // 입사일
							Integer.parseInt(valAry[3])// 급여
					);
					storage.add(newEmp);
				} catch (ParseException e) {
					System.out.println("날짜 포맷이 부정확.");
					isOk = false;
				}
				if (isOk) {
					System.out.println("추가되었습니다.");
				}
				break;

			case 2:
				Date searchCondition = null;
				while (true) {
					System.out.print("조회일 입력>> ");
					try {
						searchCondition = sdf.parse(scn.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("날짜 포맷이 부정확.");
					}
				}
				for (int i = 0; i < storage.size(); i++) {
					if (storage.get(i).getHireDate().after(searchCondition)//
							|| storage.get(i).getHireDate().equals(searchCondition)) {
						System.out.println(storage.get(i).toString());
					}
				}
				break;
			case 3:
				System.out.println("삭제할 사원번호>> ");
				int delNo = Integer.parseInt(scn.nextLine());
				for (int i = 0; i < storage.size(); i++) {
					if (storage.get(i).getEmpNo() == delNo) {
						storage.remove(i);
					}
				}
				System.out.println("삭제되었습니다.");
				break;

			case 9:
				run = false;
			}

		}
		System.out.println("end of prog.");

	}

	void method() {
		// "101 홍길동 23-05-08 100"
		String val = "101 홍길동 23-05-08 100";
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		String[] valAry = val.split(" ");
		for (String value : valAry) {
			System.out.println(value);
		}
		try {
			new Employee(Integer.parseInt(valAry[0]), // 사번
					valAry[1], // 이름
					sdf.parse(valAry[2]), // 입사일
					Integer.parseInt(valAry[3])// 급여
			);
		} catch (Exception e) {

		}
	}
}
