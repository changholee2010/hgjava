package com.yedam.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		StudentApp app = new StudentApp();

		while (run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.print("선택>> ");

			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:// 번호 이름 점수 (엔터)
				
				
				if (app.add(null)) {
					System.out.println("등록완료.");
				} else {
					System.out.println("등록에러.");
				}
				break;
			case 2:
				List<Student> list = app.list();
				for (Student std : list) {
					System.out.println(std.toString());
				}
				break;
			case 9:
				System.out.println("프로그램 종료.");
				app.save();
				run = false;
			}

		}

		System.out.println("end of prog.");

	}// end of main.

	static void write() {
		List<Student> storage = new ArrayList<>();
		try {
			FileWriter fw = new FileWriter("c:/temp/text.dat");
			BufferedWriter bw = new BufferedWriter(fw);

			// 반복.
			for (Student std : storage) {
				String str = std.getSno() + " " + std.getSname() + " " + std.getScore();
				bw.write(str + "\n");
			}
			bw.flush();
			fw.flush();
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void read() {
		// text.dat 파일 읽어서 => Student 컬렉션저장.
		List<Student> storage = new ArrayList<>();
		try {
			FileReader fr = new FileReader("c:/temp/text.dat");
			BufferedReader br = new BufferedReader(fr);

			while (true) {
				String read = br.readLine(); // 101 name 90
				if (read == null) {
					break;
				}
				String[] readAry = read.split(" ");
				Student std = new Student(//
						Integer.parseInt(readAry[0]), // 학생번호.
						readAry[1], // 학생이름.
						Integer.parseInt(readAry[2])// 점수
				);
				storage.add(std);
			}
			br.close();
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of read.
}
