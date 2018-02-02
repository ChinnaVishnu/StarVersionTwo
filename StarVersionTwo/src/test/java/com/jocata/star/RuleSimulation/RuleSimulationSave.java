package com.jocata.star.RuleSimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.Randomwords;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class RuleSimulationSave extends mainbaseLatest {

	
	
	private static final int MEDIUMWAIT = 200;
	private static final int IMPLICITWAIT = 500;
public 	String user="Raghu";



	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(10, TimeUnit.SECONDS)
	        .pollingEvery(5, TimeUnit.SECONDS)
	        .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(
	        new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(locator);
	            }
	        }
	    );
	    return foo;
	};
	
	
	
	 public void sleep(int seconds){
		   
		   try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }	
	 public int getWaitTime(int[] optionalWaitArray)
		{
			if(optionalWaitArray.length<=0)
			{
				return MEDIUMWAIT;
			}
			else
			{
				return optionalWaitArray[0];
			}
		}
	 
	 public void setImplicitWait(int waitTimeInSeconds)
		{
			driver.manage().timeouts().implicitlyWait(waitTimeInSeconds, TimeUnit.SECONDS);
		}
	 public void nullifyImplicitWait()
		{
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //nullify implicitlyWait()
		}

	 
		public boolean waitUntilElementDisappears(By locator,int... optionWaitTime)
	    {   
			int waitTime =  getWaitTime(optionWaitTime);
			boolean isNotVisible = false;
			//log.info("Waiting until element " + locator+" is invisible");
			System.out.println("Waiting until element " + locator+" is invisible");
			
			try
			{						
				nullifyImplicitWait(); 
				
				Thread.sleep(15000);
				WebDriverWait wait = new WebDriverWait(driver, waitTime);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(locator)); 	
				isNotVisible = true;            
			}
			catch(Exception e)
			{           
				//log.error("Element " + locator + " is not disappearing"+UtilityMethods.getStackTrace());	
				
				System.out.println("is not disappearing."+e.getMessage());
				//Assert.fail("Element " + locator + " is not disappearing." + UtilityMethods.getStackTrace());
			}
			setImplicitWait(IMPLICITWAIT); 
			return isNotVisible;		
	    }

	 
	 
	 @Test
	 public void clickrulesimualetionsave(){
		 
		 
		 try{
		 
		 ExtentTestManager.startTest("  Rule Simulator : Simulate   Save "); 	
		 
		 fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();
		 
		 fluentWait(By.xpath("//a[text()='Rule Simulator']")).click();
		 
		 sleep(7);
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		 fluentWait(By.xpath(".//*[@id='rulesdropdown-inputEl']")).click();
         
		 fluentWait(By.xpath("//li[81]")).click();
		 
		 
		 fluentWait(By.xpath("//tr[2]/td[2]/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();
		 
		 fluentWait(By.xpath("//li[text()='B966']")).click();
		 
		 
		 sleep(5);
		 //..................................................................................................................//
		 
		 fluentWait(By.xpath(".//*[@id='frequency']")).sendKeys("3");

		 fluentWait(By.xpath(".//*[@id='no_of_slices']")).sendKeys("3");

		 fluentWait(By.xpath("//span[@id='simulationbutton']")).click();
		 
		 
//WebElement elementfor =		fluentWait(By.xpath("")); 
		
		 waitUntilElementDisappears(By.xpath("//div[text()='Loading...']"), 1300);
		 
		 
		 
		 fluentWait(By.xpath("//span[@id='saveSimulation']")).click();
		 
		 
		 

Randomwords h=new Randomwords();

String raaaa=h.stp();

System.out.println(user+raaaa);
		 
sleep(5);

		 fluentWait(By.xpath(".//*[@id='simulationGroupNameInput']")).sendKeys(user+raaaa);
		 
		 fluentWait(By.xpath("//div[@id='simulationsave']//a")).click();
		 
		 
		 sleep(5);
		 fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		 
		 
		 
		 
		 
	 }catch(Exception e){
		 
		 System.out.println(e.getMessage());
		 
		 ExtentTestManager.getTest().log(LogStatus.FAIL, " Rule Simulator : Simulate   ");
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();
		 
	 }
		 
		 
		 
		 

		 
		 
	 }
	
	
}
