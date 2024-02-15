package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class SeatExe {
	public static void main(String[] args) {
		List<String> seats = new ArrayList<>();
		seats.add("1");
		seats.add("3");
		seats.add("7");
		seats.add("8");

		int num = 1;
		for (int i = 0; i < 3; i++) {
			System.out.println("---------------");
			for (int j = 0; j < 3; j++) {
				if (seats.contains(String.valueOf(num))) {
					System.out.printf("%3s|", "(" + num + ")");
				} else {
					System.out.printf("%2d |", num);
				}
				num++;
			}
			System.out.println();
		}
	}
}
