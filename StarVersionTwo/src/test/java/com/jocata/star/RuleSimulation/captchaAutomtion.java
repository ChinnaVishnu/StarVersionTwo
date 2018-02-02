package com.jocata.star.RuleSimulation;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
public class captchaAutomtion {

	WebDriver driver;  
	   
	 @BeforeTest  
	 public void start(){  
	  driver = new FirefoxDriver();  
	 }  
	   
	 @Test  
	 public void Test() throws InterruptedException{   
	  //Loading jQuery Real Person Captcha demonstration page  
	  driver.get("http://keith-wood.name/realPerson.html");  
	  
	  Thread.sleep(4000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;  
	  //Setting the captcha values  
	  js.executeScript("document.getElementsByName('defaultRealHash')[1].setAttribute('value', '-897204064')");  
	  driver.findElement(By.name("defaultReal")).sendKeys("QNXCUL");  
	  //Submit the form  
	  driver.findElement(By.xpath(".//*[@id='default']/form/p[2]/input")).submit();   
	 }  
	
}
