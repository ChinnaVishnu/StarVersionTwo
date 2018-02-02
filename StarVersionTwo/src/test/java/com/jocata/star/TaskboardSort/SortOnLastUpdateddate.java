package com.jocata.star.TaskboardSort;

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
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class SortOnLastUpdateddate extends mainbaseLatest {

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
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

	@Test(priority = 9)
	public void clickonSortonLastupdate() {

		try {
			ExtentTestManager.startTest(" TaskBoard Sort on last updated date ");

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			// ..........................................................Case
			// Type............................................................//

			sleep(6);
			fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screensho rtbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			// .................................................................Search.......................................................//

			sleep(6);
			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
			sleep(9);

			WebElement lassst = driver.findElement(By.xpath("//span[@data-qtip='Last Update']"));
			Actions action = new Actions(driver);

			action.moveToElement(lassst).build().perform();

			sleep(9);

			driver.findElement(By.xpath("//div[12]/div/div")).click();

			sleep(8);

			driver.findElement(By.xpath("//div[2]/div[2]/div/a/span")).click();

			sleep(10);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screensho rtbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			WebElement lassstccc = driver.findElement(By.xpath("//span[@data-qtip='Last Update']"));
			Actions actionlassssu = new Actions(driver);

			actionlassssu.moveToElement(lassstccc).build().perform();

			sleep(9);

			driver.findElement(By.xpath("//div[12]/div/div")).click();

			sleep(8);

			driver.findElement(By.xpath("//div[2]/div[2]/div[2]/a/span")).click();

			sleep(10);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screensho rtbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		} catch (Exception e) {

			System.out.println(e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.FAIL,
					"TaskBoard Sort on last updated date  Fail because No Matching Records ");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		}

	}

}
