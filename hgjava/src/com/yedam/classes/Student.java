package com.yedam.classes;

// 학생번호, 이름, 점수, 키:
// 소개(학생번호, 이름, 점수)
public class Student {
	// 필드
	private String sno; // null.
	private String sname;
	private int score; // 0
	private double height; // 0.0

	// 생성자: 기본생성자. new Friend()
	public Student(String no, String name) {
		sno = no;
		sname = name;
	}

	public Student(String no, String name, int score) {
		this(no, name);
		this.score = score;
	}

	public Student(String sno, String sname, int score, double height) {
		this.sno = sno;
		this.sname = sname;
		this.score = score;
		this.height = height;
	}

	// 메소드
	void showInfo() {
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d입니다.\n", this.sno, sname, score);
	}

	String showInfoStr() {
		return "번호는 " + sno;
	}

	// getter/setter.
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
