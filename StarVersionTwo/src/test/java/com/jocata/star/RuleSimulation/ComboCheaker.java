package com.jocata.star.RuleSimulation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.mainbaseLatest;

public class ComboCheaker  extends mainbaseLatest{
	
	
	
	

	private static final String DateTimeConstants = null;

	public void clickComboItem(WebElement input, String target) {
	   input.click(); // click input to pop up the combo list
	    List<WebElement> comboItems = driver.findElements(By.cssSelector(".x-combo-checker"));
	    for (int i = 1; i <= comboItems.size(); i++) {
	        WebElement item = comboItems.get(i);
	        if (item.getText().equals(target)) {
	            item.click();
	            break;
	        }
	    }
	}

	
	
	
	
	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};

	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// .............................................................customerfieldsthree....................................................................//

	@Test(priority = 3)
	public void login() {

		ExtentTestManager.startTest("  Case Expand :  Actions  ");

		/*
		 * driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(
		 * "l3_user");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
		 * "Star@123");
		 * driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")
		 * ).click();
		 */ clickDashboard();
	}

	public void clickDashboard() {
		// driver.findElement(By.xpath("//span[text()='Rules and
		// Patterns']")).click();
		// driver.findElement(By.xpath("//span[text()='Dashboard']")).click();

		sleep(6);

		fluentWait(By.xpath("//span[text()='Case Files']")).click();

		sleep(8);

		fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();
		sleep(8);
	//	fluentWait(By.xpath("//td[2]/div")).click();
		
		WebElement element=	driver.findElement(By.xpath("//td[2]/div"));
		Actions action=new Actions(driver);
		
		action.moveToElement(element).build().perform();
		
		action.click().build().perform();
		
		sleep(6);
		driver.findElement(By.xpath("//td[2]/div")).click();
		
		
		
		
		
		sleep(8);
		
		List<WebElement> listElements = driver.findElements((By.cssSelector(".x-boundlist:not([style*='display: none']) li span ")));
	   
		listElements.get(1).click();  //working.......

		
		
		
	
		
/*		
for (WebElement allelements : listElements) {
	
	
String pp=	allelements.getText();
	System.out.println(pp);	
	   System.out.println("Option value "+pp);
       String  valueToSelect = " My Past Cases";
       
	if (valueToSelect.equals(allelements.getText())) {
		
           allelements.click();
           
           break;
       }

	
	//allelements.click();
	
}*/

		
	
	
	
		
		//fluentWait(By.xpath("//td[2]/div")).click();
		/*
		String target=" My Current Cases";
		WebElement input=driver.findElement(By.xpath("//td[2]/div"));
		clickComboItem(input, target);*/
	

}
}
