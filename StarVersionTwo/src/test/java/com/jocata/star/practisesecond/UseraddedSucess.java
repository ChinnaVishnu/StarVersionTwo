package com.jocata.star.practisesecond;

public class UseraddedSucess {

public static void main(String[] args) {
	
 String sentence="Error in sending email. User has been added successfully. Please note system generated password is urbwrqg!t2Lfu";	
	
 //System.out.println(sentence);

 
 String [] sen=sentence.split(" ");
 System.out.println(sen[4]+sen[5]+sen[6]+sen[7]+sen[8]);
 
}
}