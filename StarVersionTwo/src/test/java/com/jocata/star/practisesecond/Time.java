package com.jocata.star.practisesecond;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Time {

	
	static  int counter=0;
	
	public static String getCurrentDateTime()
    {
    	Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MMM-yyyy:HH.mm.ss");
        String dateNow = formatter.format(currentDate.getTime());
        return dateNow;    	
    }
	
	
	public static  ArrayList<String> getdata(){
		
		ArrayList<String> list = new ArrayList<>();
		list.add("JOCATA20525");
		list.add("JOCATA201050");
		list.add("JOCATA201520");
		list.add("JOCATA204012");
		list.add("JOCATA20525");
		list.add("JOCATA20");
		list.add("JOCATA201");
		list.add("JOCATA204");
		
		System.out.println(list+(Time.tm()));
		
		System.out.println(list.get(2));
		

		return list;
		
		
	}
	
	public static String tm() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
		String formattedDate = sdf.format(date);
		return formattedDate;

	}

	public static void main(String[] args) {
		
		ArrayList<String>abc=Time.getdata();
	
	
	
System.out.println(abc.get(counter));	
counter++;
	
		
	
	}
}
