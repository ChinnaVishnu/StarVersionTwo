package com.jocata.star.practisesecond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Click {
	RaghuTesting2 rr=new RaghuTesting2();

	
	WebDriver driver ;	
	
    String baseUrl = null;
	
@Test	
public void start(){
	driver = new FirefoxDriver();
    driver.get(baseUrl);
    rr.click();
    driver.findElement(By.xpath("//input[@id='text']")).sendKeys();
    

	
}
	
}
