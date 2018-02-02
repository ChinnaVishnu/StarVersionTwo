package com.jocata.TranscationSetails.pract;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class Misreports3 extends mainbaseLatest {

	//...........Working fine in progress...........................................//
	
	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(69, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};
	
	@Test(priority = 36)
	public void clickingmisreports() throws InterruptedException, IOException, HeadlessException, AWTException {


		//sleep(13);

		fluentWait(By.xpath("//span[text()='CENTRA']")).click();

	//	sleep(12);

		fluentWait(By.xpath("//a[text()='MIS Reports']")).click();

		//sleep(13);

		
		fluentWait(By.xpath("(//img[@title='VIEW'])[1]")).click();

		Thread.sleep(8000);

		Runtime.getRuntime().exec("D:\\AutoitDownloadsSecond\\batch12_upload.exe");

		//Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");
		
		
		Thread.sleep(10000);
		Robot robot = new Robot();
		
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 
		 Thread.sleep(3000);

		 robot.keyPress(KeyEvent.VK_END);
		 
		 Thread.sleep(3000);

		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 
		 Thread.sleep(3000);

		 robot.keyRelease(KeyEvent.VK_END);
		
		
			String getURL = driver.getCurrentUrl();
			Assert.assertTrue(getURL.contains(".pdf"));

		 
		
		 Thread.sleep(23000);		
		 
		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_F4);
		
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_ALT);
		
		
		
		
		System.out.println("pass");
		
		
		
	

}
}
