package com.yedam.condition;

public class CalendarExe {
	public static void main(String[] args) {
		int month = 3; // 4월달까지출력.

		// 변수: 월의 1이 위치.
		int pos = 1;
		// 변수: 월의 마지막날짜.
		int lastDate = 31;

		switch (month) {
		case 1:
			pos = 1; break;
		case 2:
			pos = 4; break;
		case 3:
			pos = 5; break;
		}
		
		// 수정...월의 변경될때마다 마지막날 계산.
		

		// 1 ~ 31까지 반복.
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		for (int i = 0; i < pos; i++) {
			System.out.printf("%4s", "");
		}

		for (int d = 1; d <= 31; d++) {
			System.out.printf("%4d", d);
			if (d % 7 == 2) { // 수정...
				System.out.println();
			}
		}
		System.out.println("======end of prog.=======");
	} // end of main.
} // end of class.
