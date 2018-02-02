package com.jocata.star.RuleSimulation;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationForm {

	
	 WebDriver driver;
	 GenerateData genData;
	 
	 @Before
	 public void before(){
	  driver=new FirefoxDriver();
	  genData=new GenerateData();
	 }
	 
	 @Test
	 public void testRegistrationForm() {
	  driver.findElement(By.id("f_name")).sendKeys(genData.generateRandomAlphaNumeric(30));    
	  driver.findElement(By.id("l_name")).sendKeys(genData.generateRandomString(20));
	  driver.findElement(By.id("email")).sendKeys(genData.generateEmail(30));
	  driver.findElement(By.id("skype")).sendKeys(genData.generateStringWithAllobedSplChars(30, "abc123_-."));
	  driver.findElement(By.id("phone")).sendKeys(genData.generateRandomNumber(10));
	  driver.findElement(By.id("income")).sendKeys(genData.generateRandomNumber(9));
	  driver.findElement(By.id("submit")).click();
	  assertEquals("Success", driver.getTitle());
	 }
	 
	 @After
	 public void after(){
	  driver.quit();
	 }
	
	
}
