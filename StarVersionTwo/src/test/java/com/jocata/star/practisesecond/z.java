package com.jocata.star.practisesecond;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class z {

	public static String  getCurrentDateTime()
    {
    	Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MMM-yyyy:HH.mm.ss");
        String dateNow = formatter.format(currentDate.getTime());
        
       // int dd=Integer.parseInt(dateNow);
        System.out.println(dateNow);
        
        
        //System.out.println(String.valueOf(dateNow));
        //return dateNow;    	
		return dateNow;
    }
	
public static void main(String[] args) {
	
	z.getCurrentDateTime();
	
}	
	
}
