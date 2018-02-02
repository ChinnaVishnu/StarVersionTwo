package com.jocata.star.WorkFlow;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class Transcationdetails extends mainbaseLatest {

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
	public void clickingtrancations() {

		fluentWait(By.xpath("//span[text()='Case Files']")).click();

		fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

		// ..........................................................Case Type............................................................//

		fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

		fluentWait(By.xpath("//li[text()='Other Cases']")).click();

		// .................................................................Search.......................................................//

		fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

		fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
   
		sleep(10);
		
		fluentWait(By.xpath("//div[contains(@id,'workflowBtn')]/a")).click();

		fluentWait(By.xpath("//div[@class='workflowpanelDivinPopUpContent_title tleft sstr']/img")).click();
		
		
		fluentWait(By.xpath("//span[text()='Details of Related Account']")).click();


		sleep(10);

		driver.findElement(By
				.xpath("//a[@class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']"))
				.click();
		fluentWait(By.xpath("//table[3]/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click(); // click


		
	}

}
