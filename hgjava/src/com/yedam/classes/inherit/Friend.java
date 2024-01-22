package com.yedam.classes.inherit;

import lombok.Data;
import lombok.NoArgsConstructor;

// 이름, 연락처 (Friend)
// 이름, 연락처, 학교, 전공 (UnivFriend)
// 이름, 연락처, 회사, 부서 (CompFriend)
@Data
@NoArgsConstructor
public class Friend {
	private String name;
	private String phone;

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public void changeInfo(String info1, String info2) {
		return;
	}

	@Override
	public String toString() {
		return "이름은 " + name + ", 연락처는 " + phone;
	}

}
