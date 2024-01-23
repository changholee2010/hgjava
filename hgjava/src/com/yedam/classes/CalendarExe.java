package com.yedam.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {
	public static void main(String[] args) {
		// drawCalendar(2022, 1); // 2024년 5월 달력.
		Date date = new Date(); // 1900년.
		// 2024-10-5
		SimpleDateFormat sdf = //
				new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = sdf.parse("2024-04-01"); // String -> Date
		} catch (Exception e) {
			e.printStackTrace();
		}

		drawCalendar(date); // 숙제.
	}

	static void drawCalendar(Date date) {

	}

	static void drawCalendar(int year, int month) {
		// (2024, 1)
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		int pos = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int lastDate = cal.getActualMaximum(Calendar.DATE);

		// 요일출력.
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println("");
		// 1일의 요일지정.
		for (int i = 0; i < pos; i++) {
			System.out.printf("%4s", "");
		}
		// 날짜출력.
		for (int d = 1; d <= lastDate; d++) {
			System.out.printf("%4d", d);
			if ((pos + d) % 7 == 0) { // 수정...
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("======end of prog.=======");
	}

}
