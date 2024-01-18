package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe2 {

	public static void main(String[] args) {

		String[] friends = { "홍길동", "김민수", "박석민", "최홍만", "김길동" };
		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4 };
		int[] scores = new int[5];
		scores[0] = 78;
		scores[1] = 92;
		scores[2] = 95;
		scores[3] = 90;
		scores[4] = 91;

		// 최고점수를 계산하기 위한 변수.
		int max = 0;
		String name = "";
		double weight = 0;
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				name = friends[i];
				weight = dblAry[i];
				max = scores[i];
			}
		}
		System.out.printf("최고점수 이름: %s, 몸무게: %.1f", name, weight);

		System.out.println("\nend of prog.");

	}

	public static void method2() {
		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4 };
		// 배열의 값 중에서 제일 큰값을 출력.
		double max = 0;
		for (int i = 0; i < dblAry.length; i++) {
			if (max < dblAry[i]) {
				max = dblAry[i];
			}
		}
		System.out.printf("제일 무거운 몸무게: %.1f \n", max);

		double avg = 0;
		double sum = 0;
		for (int i = 0; i < dblAry.length; i++) {
			sum += dblAry[i];
		}
		avg = sum / dblAry.length;

		// 친구의 평균몸무게는 79.6 입니다.
		// System.out.printf("친구의 평균몸무게는 %.1f 입니다.", avg);

	}

	public static void method1() {
		int[] scores = new int[10];
		scores[3] = 40;

		scores = new int[5];
		scores[0] = 78;
		scores[1] = 92;
		scores[2] = 77;
		scores[3] = 90;
		scores[4] = 95;

		// "90점 이상인 학생은 ?명입니다."
		// "90점 이상학생은 없습니다."
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			// System.out.println("scores[" + i + "]=> " + scores[i]);
			if (scores[i] > 90) {
				cnt++;
			}
		}
		if (cnt > 0) {
			System.out.printf("90이 이상인 학생: %d 명 입니다.", cnt);
		} else {
			System.out.printf("90점 이상학생은 없습니다.");
		}

	}
}
