package com.jocata.star.practisesecond;

import java.util.ArrayList;

public class hi {

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
		

	}	
	
}
