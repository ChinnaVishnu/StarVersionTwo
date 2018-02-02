package com.jocata.star.RuleBulider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.mainbaseLatest;

public class RuleBuilderCustomerFilter  extends mainbaseLatest {

	
	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
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
	@Test
	public void clickrulebuliderupdate() {
		
		fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();
        fluentWait(By.xpath("//a[text()='Rule Builder']")).click();
	
		//.......................................Customer/Account Filter....................................................//
        //.........................................Account Age...............................................................//
        
        fluentWait(By.xpath("//table[@id='temp_ruleBldrVOAccCusValDetList[0].custAccValDetFilterVal']")).click();
        fluentWait(By.xpath("//li[text()='Account Age']")).click();
        
        fluentWait(By.xpath(".//*[@id='ruleBldrVOAccCusValDetList[0].custAccValDetFilterFromVal']")).sendKeys("5");
        fluentWait(By.xpath(".//*[@id='ruleBldrVOAccCusValDetList[0].custAccValDetFilterToVal']")).sendKeys("10");        
        
        fluentWait(By.xpath("//a[text()='Add Condition']")).click();
        
        //............................................Account Balance.........................................................//
        
        fluentWait(By.xpath("//table[@id='temp_ruleBldrVOAccCusValDetList[1].custAccValDetFilterVal']")).click();
        fluentWait(By.cssSelector(".x-boundlist:not([style*='display: none']) ul li:nth-child(3)")).click();
        
        fluentWait(By.xpath(".//*[@id='ruleBldrVOAccCusValDetList[1].custAccValDetFilterFromVal']")).sendKeys("5000");
        fluentWait(By.xpath(".//*[@id='ruleBldrVOAccCusValDetList[1].custAccValDetFilterToVal']")).sendKeys("10000");
        
        fluentWait(By.xpath("//a[text()='Add Condition']")).click();
        
        //...............................................Account Status.......................................................//
        
        fluentWait(By.xpath("//table[@id='temp_ruleBldrVOAccCusValDetList[2].custAccValDetFilterVal']")).click();
        
        fluentWait(By.cssSelector(".x-boundlist:not([style*='display: none']) ul li:nth-child(4)")).click();
        
        fluentWait(By.xpath("//table[@id='ruleBldrVOAccCusValDetList[2].custAccValDetFilterSubVal']")).click();
        
        
        fluentWait(By.cssSelector(".x-boundlist:not([style*='display: none']) div span")).click();

        fluentWait(By.xpath("//a[text()='Add Condition']")).click();
        
        fluentWait(By.xpath("//a[text()='Add Condition']")).click();
        
        
        //............................Business Unit........................................................................//
        
        
        fluentWait(By.xpath("//table[@id='temp_ruleBldrVOAccCusValDetList[3].custAccValDetFilterVal']")).click();
        
        
        fluentWait(By.cssSelector(".x-boundlist:not([style*='display: none']) ul li:nth-child(5)")).click();

        fluentWait(By.xpath("//table[@id='ruleBldrVOAccCusValDetList[3].custAccValDetFilterSubVal-triggerWrap']")).click();
        
        fluentWait(By.cssSelector(".x-boundlist:not([style*='display: none']) div span")).click();

        fluentWait(By.xpath("//a[text()='Add Condition']")).click();

        fluentWait(By.xpath("//a[text()='Add Condition']")).click();

        
        
		
	}
	
}
