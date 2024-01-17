package com.yedam.condition;

public class LoopExe4 {
	public static void main(String[] args) {
		// j, i =>
		for (int j = 4; j > 0; j--) {
			// start.
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			} // end.
			System.out.println();
		}
	}

	public static void method2() {
		for (int j = 1; j <= 9; j++) {
			// 시작.
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%2d * %d = %2d ", i, j, (j * i));
			}
			System.out.println();
			// 끝.
		}
	}

	public static void method1() {
		// 구구단출력.
		for (int j = 2; j <= 9; j++) {
			// 시작.
			int num = j; // 단정보.
			for (int i = 1; i <= 9; i++) {
				// 3 * 1 = 3
				System.out.printf("%d * %d = %d\n", num, i, (num * i));
			}
			// 끝.
		}
	}
}
