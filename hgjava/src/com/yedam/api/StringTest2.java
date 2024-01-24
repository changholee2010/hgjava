package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTest2 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		Date date = sdf.parse("231010");
		
		Date today = new Date(); //240124
		
		System.out.println(date.before(today));
	}
}
