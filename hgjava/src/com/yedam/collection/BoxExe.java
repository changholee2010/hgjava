package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoxExe {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setObj("Hong");
		String result = box.getObj();

		Box<Integer> boxi = new Box<>();
		boxi.setObj(100);
		Integer resulti = boxi.getObj();

		List<String> list = new ArrayList<>();
		list.add("");

		for (int i = 0; i < list.size(); i++) {
			String result1 = list.get(i);
		}

//		box.setObj(100);
//		box.setObj("Hong");
//		Integer result = (Integer) box.getObj();
	}
}
