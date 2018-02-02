package com.jocata.star.WorkFlow;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class WorkflowSave extends mainbaseLatest {

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

	@Test(priority = 35)
	public void login() throws IOException {

		ExtentTestManager.startTest("  WorkFlow Dispiration : Suggest STR  Save  ");

		/*
		 * driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(
		 * "l3_user");
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
		 * "Star@123");
		 * driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")
		 * ).click();
		 */ clickDashboard();
	}

	public void clickDashboard() throws IOException {
		// driver.findElement(By.xpath("//span[text()='Rules and
		// Patterns']")).click();
		// driver.findElement(By.xpath("//span[text()='Dashboard']")).click();

		try {

			fluentWait(By.xpath("//span[text()='Case Files']")).click();
			// sleep(11);

			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			// ..........................................................Case
			// Type............................................................//

			//sleep(4);

	/*		fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();
			sleep(4);

			fluentWait(By.xpath("//li[text()='Other Cases']")).click();*/
			
			
			sleep(6);

			

			WebElement element=	driver.findElement(By.xpath("//td[2]/div"));
			Actions action=new Actions(driver);
			
			action.moveToElement(element).build().perform();
			
			action.click().build().perform();
			
			sleep(6);
			driver.findElement(By.xpath("//td[2]/div")).click();

			sleep(6);	

			//driver.findElement(By.xpath("//li[text()='Other Cases']")).click();

		   driver.findElement(By.xpath("//li[3]/span")).click();
			
			
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			// .................................................................Search.......................................................//

			sleep(4);
			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(6);

			List<WebElement> jocata = driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));

			for (WebElement ele : jocata) {

				String text = ele.getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, text);

			}

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

			// ............................................clicking the
			// workflow...........................................................//

			//

			sleep(6);

			fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='escalCommCombo-inputEl']")).click();

			fluentWait(By.xpath("//div[contains(@id,'boundlist-')][2]//ul/li")).click();

			fluentWait(By.xpath("//div[4]/div/div[2]/div/div/a/span/span/span[2]")).click();

			// ..................Click o Suggest
			// STR........................................................................//

			// fluentWait(By.xpath("//div[@class='workflowpanelDivinPopUpContent_title
			// tleft']//following::img[5]")).click();

			fluentWait(By.xpath("//img[@id='tool-1661-toolEl_3']")).click();

			fluentWait(By.xpath("//span[text()='STR Note']")).click();

			fluentWait(By.xpath("//div[2]/div/div/span/div/div[2]/div/div/div/div/div[2]/img")).click();

			sleep(6);
			fluentWait(By.xpath("//textarea[@id='orgnofcaseacc-inputEl']")).sendKeys("jhdcbjhb");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(6);
			fluentWait(By.xpath("//textarea[@id='totalturnover-inputEl']")).sendKeys("dbhsshcg");

			fluentWait(By.xpath("//textarea[@id='trgrofsuspcn-inputEl']")).sendKeys("hcjzcnb");
			sleep(6);
			fluentWait(By.xpath("//td[@id='trnsctnptrndtlobsrvtn-bodyEl']/textarea")).sendKeys("zzbbjhbjhb");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[3]/div[2]/div/div/a/span/span/span[2]")).click();

			fluentWait(By.xpath("//div[3]/div/div/a[2]/span/span/span[2]")).click();
			sleep(4);
			fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			JavascriptExecutor jse = (JavascriptExecutor) driver;

			jse.executeScript("window.scrollBy(0,-450)", "");

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		} catch (Exception e) {

			System.out.println(e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.FAIL, "Missing Modules");

			sleep(8);

			driver.navigate().refresh();

		}

	}
}