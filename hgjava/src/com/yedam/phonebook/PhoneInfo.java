package com.yedam.phonebook;

public class PhoneInfo {
	private String name;
	private String phone;

	public PhoneInfo(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
	}

	// 동등객체.
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PhoneInfo) {
			PhoneInfo info = (PhoneInfo) obj;
			if (name.equals(info.name) && phone.equals(info.phone)) {
				return true;
			}
		}
		return false;
	}

	// getter추가.
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		// 1,홍길동,010-1111
		return InputSelect.NORMAL + "," + name + "," + phone;
	}

}
