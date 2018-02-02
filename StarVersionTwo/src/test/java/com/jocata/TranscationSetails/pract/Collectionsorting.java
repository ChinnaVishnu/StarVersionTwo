package com.jocata.TranscationSetails.pract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Collectionsorting {

	
	//[Geeks For Geeks, Friends, Dear, Is, Superb]
	//[Dear, Friends, Geeks For Geeks, Is, Superb]
	
	 public static void main(String[] args)
	    {
	        // Create a list of strings
	        LinkedList<String> al = new LinkedList<String>();
	        al.add("Geeks For Geeks");
	        al.add("Friends");
	        al.add("Dear");
	        al.add("Is");
	        al.add("Superb");
	 
	        /* Collections.sort method is sorting the
	        elements of ArrayList in ascending order. */
	        Collections.sort(al);
	 
	        // Let us print the sorted list
	        System.out.println("List after the use of" +
	                           " Collection.sort() :\n" + al);
	    }	
	
}
