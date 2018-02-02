package com.jocata.star.practisesecond;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dom {

public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	
	Thread.sleep(6000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	WebElement email = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.getElementById('identifierId');");  
	 email.sendKeys("abcdef@gmail.com");  
	 	
	 
	 
	
	
	
	
	
}	
	
}
