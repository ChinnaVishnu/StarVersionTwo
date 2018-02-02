package com.jocata.star.practisesecond;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

	public static String getCurrentDateTime() {
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy:HH.mm.ss");
		String dateNow = formatter.format(currentDate.getTime());
		// System.out.println(dateNow);
		return dateNow;
	}

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> resultMap = new HashMap<String, String>();

		map.put("JOCATA20525",MapExample1.getCurrentDateTime());
		map.put("JOCATA201050",MapExample1.getCurrentDateTime());
		map.put("JOCATA201520",MapExample1.getCurrentDateTime() );
		map.put("JOCATA20",MapExample1.getCurrentDateTime());

		// Set set=map.keySet();
		for (Map.Entry m : map.entrySet()) {
			String key=(String) m.getKey();
			if(resultMap.isEmpty()){
				resultMap.put(key, (new Date().toString()));
			}else{
				if(resultMap.containsKey(key)){
					break;
				}else{
					System.out.println(m.getKey() + " " + m.getValue());
				}
			}
			
//			resultMap.put(key, (new Date().toString()));
			
			
			

		}

	}
}
