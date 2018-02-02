package com.jocata.star.practisesecond;

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
import org.testng.annotations.Test;

import com.base.pack.mainbase;
import com.google.common.base.Function;
import com.relevantcodes.extentreports.LogStatus;

public class Misreports extends mainbase {

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

		Thread.sleep(10000);


		//Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverdownloads\\batch12_upload.exe");
		
		Robot robot = new Robot(); // Robot class throws AWT Exception

		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_J);


		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_W);


		robot.keyRelease(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_W);

		robot.keyRelease(KeyEvent.VK_CONTROL);

		

}
}
