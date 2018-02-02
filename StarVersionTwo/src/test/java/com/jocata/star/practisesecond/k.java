package com.jocata.star.practisesecond;

public class k {

	
	public static  String email(){
		 String s = "Error in sending email. User has been added successfully. Please note system generated password is urbwrqg!t2Lfu";
		  int indexOfLast = s.lastIndexOf(".");
		  String newString = s;
		  if(indexOfLast >= 0) newString = s.substring(24, indexOfLast);
		  
		return newString;
	}
	
	
	public static void main(String[] args) {
String rr=		k.email();
		  
		 }
	
}
