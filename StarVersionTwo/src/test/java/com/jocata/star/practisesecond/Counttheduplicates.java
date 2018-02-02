package com.jocata.star.practisesecond;

import java.util.HashMap;
import java.util.Map;

public class Counttheduplicates {

//................Count the  duplicate numbres........................................................................//	
	
public static final void main(String[] args) {
	
	String s="RAGHURAMUDU";

	
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	for (int i = 0; i < s.length(); i++) {
	  char c = s.charAt(i);
	  if (map.containsKey(c)) {
	    int cnt = map.get(c);
	    map.put(c, ++cnt);
	    System.out.println(c);
	  } else {
	    map.put(c, 1);
	  }
	}

}
	
}
