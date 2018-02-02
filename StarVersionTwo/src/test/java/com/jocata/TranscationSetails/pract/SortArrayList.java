package com.jocata.TranscationSetails.pract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortArrayList {

	public static void main(String[] args) {
		  
		//create an ArrayList object
		 ArrayList<Integer> arrayList = new ArrayList<Integer>();
		       
		 //Add elements to Arraylist
		arrayList.add(10);
		arrayList.add(7);
		arrayList.add(11);
		arrayList.add(4);
		arrayList.add(9);
		arrayList.add(6);
		arrayList.add(2);
		arrayList.add(8);
		arrayList.add(5);
		arrayList.add(1);
		        
		        
		 System.out.println("Before sorting ArrayList ...");
		 Iterator itr=arrayList.iterator();
		        
		while (itr.hasNext()) {
		 
		System.out.println(itr.next());
		     
		}
		 
		       
		 /*
		 To sort an ArrayList object, use Collection.sort method. This is a
		  static method. It sorts an ArrayList object's elements into ascending order.
		*/
		  Collections.sort(arrayList);
		     
		  System.out.println("After sorting ArrayList ...");
		       
		    
		        
		Iterator itr1=arrayList.iterator();
		        
		while (itr1.hasNext()) {

		System.out.println(itr1.next());
		            
		}
		    
		  
		}	
	
}
