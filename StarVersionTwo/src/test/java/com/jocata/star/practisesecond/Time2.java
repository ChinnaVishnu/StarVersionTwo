package com.jocata.star.practisesecond;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Time2 {

	public static String getCurrentDateTime() {
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy:HH.mm.ss");
		String dateNow = formatter.format(currentDate.getTime());
		System.out.println(dateNow);
		return dateNow;
	}

	public static ArrayList<String> getdata() {

		ArrayList<String> list = new ArrayList<>();
		list.add("JOCATA20525");
		list.add("JOCATA201050");
		list.add("JOCATA201520");
		list.add("JOCATA204012");
		list.add("JOCATA20525");
		list.add("JOCATA20");
		list.add("JOCATA201");
		list.add("JOCATA204");

		return list;

	}

	public static void main(String[] args) {

		ArrayList<String> abc = Time2.getdata();
		System.out.println(abc.get(1));
		//Time2.getCurrentDateTime();

	}
}
