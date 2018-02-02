package com.jocata.star.practisesecond;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
public class RaghuTesting {

	static int count=0;
	public static void main(String[] args) throws FileNotFoundException {	
		//FileInputStream fis=new FileInputStream("E://JavaLearn//ravi");
		try {
	        if ( !new File("D://JavaLearn//raghutest.txt").exists())
	        	System.out.println("result "  + RaghuTesting.getData(0));
	        else {
	        	BufferedReader br=new BufferedReader(new FileReader(new File("D://JavaLearn//raghutest.txt")));
	                 
	            String countString = br.readLine(); 
	            if(countString!=null){
	            count=Integer.parseInt(countString);
	            }
	            br.close();
	             System.out.println("count before reader "  + count);
	           System.out.println("result "  + RaghuTesting.getData(count));
	        }   
	        count=count+1;
	        BufferedWriter bw=new BufferedWriter(new FileWriter(new File("D://JavaLearn//raghutest.txt")));        
	        System.out.println("count before writer "  + count);
	        bw.write(Integer.toString(count));
	        bw.close();
	    } catch(Exception e) {
	        e.printStackTrace();
	    }	
	}

	public static  String getData(Integer number)
	{
		HashMap<Integer, String> hmap=new HashMap<>();
			hmap.put(0,"Ravi");
			hmap.put(1, "Yadav");
			hmap.put(2, "Gopalpet");
			hmap.put(3, "Saurabh");
			hmap.put(4, "Vamshi");
			hmap.put(5, "Ashok");
		
			String result=hmap.get(number);
		return result;
	}
	
}
