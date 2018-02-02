package com.jocata.star.practisesecond;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Array {

public static 	int i=0;
	
	public static ArrayList<String> getdata() {

		ArrayList<String> list = new ArrayList<String>();
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

	/*public static String getCurrentDateSe() {

		DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");

		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		Date date = c.getTime();
		String s = String.valueOf(date);
		String ss[] = s.split("");

		return dateFormat.format(date);

	}

	public static String getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;
	}*/

	public static void main(String[] args) {

		ArrayList<String> bc = getdata();

		System.out.println(bc);
		
		ArrayList<String> cusList = new ArrayList<String>();
		cusList.add("JOCATA20525");
		cusList.add("JOCATA201050");
		cusList.add("JOCATA201520");
		cusList.add("JOCATA204012");
		cusList.add("JOCATA20525");
		cusList.add("JOCATA20");
		cusList.add("JOCATA201");
		cusList.add("JOCATA204");
		
		for (int i = 0; i < cusList.size(); i++) {
								
			cusList.get(i);
		}
		
		

		/*String today = getCurrentDateSe();
		//System.out.println(today);

		String tommorrow = getCurrentDate();
*/
		//System.out.println(tommorrow);
		
		
/*		
if(today==tommorrow){
	
	ArrayList<String> bcv = getdata();

	System.out.println(bcv);

	System.out.println(bcv.get(i));
	i++;
}
else{

	ArrayList<String> bcv = getdata();

	//System.out.println(bcv);

	System.out.println(bcv.get(i));
}
		
	}*/
		
	}
}

