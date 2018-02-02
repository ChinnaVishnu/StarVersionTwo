package com.jocata.star.practisesecond;

import org.apache.commons.lang3.RandomStringUtils;

public class Gdata {

	public  static String generateRandomString(int length){
		  return RandomStringUtils.randomAlphabetic(length);
		 }
		 
	
public static void main(String[] args) {
	
	
	Gdata.generateRandomString(4);
	System.out.println(Gdata.generateRandomString(7));
	
}	
	
}
