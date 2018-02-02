package com.jocata.star.practisesecond;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

@Test(dataProvider="SearchProvider")
public void click(String frist,String second){
	System.out.println(frist);
	System.out.println(second);
	
}
	
@DataProvider(name="SearchProvider")
public Object[][] secondclick(){
	
	 return new Object[][] {
         { "Guru99", "India" },
         { "Krishna", "UK" },
         { "Bhupesh", "USA" }
     };
	
	
	
	
	
	
	
}
	
	
}
