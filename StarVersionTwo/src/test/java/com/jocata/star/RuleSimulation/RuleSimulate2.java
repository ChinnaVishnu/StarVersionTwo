package com.jocata.star.RuleSimulation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class RuleSimulate2 extends mainbaseLatest {

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

	@Test(priority = 30)
	public void clickRulesimualtes() {

		//try {

			ExtentTestManager.startTest("  Rule Simulator : Simulate  ");

			fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();

			fluentWait(By.xpath("//a[text()='Rule Simulator']")).click();

			sleep(3);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='rulesdropdown-inputEl']")).click();

			fluentWait(By.xpath("//li[text()='High value cash deposits in a day']")).click();

			fluentWait(By.xpath(".//*[@id='benchMarkIdCombo-inputEl']")).click();

			fluentWait(By.xpath("//li[text()='--New BenchMark--']")).click();

			sleep(5);
			// .....................customerType...............................................................//

			
			List<WebElement> text = driver.findElements(By.xpath("//li/div"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(text.get(0)).click(text.get(1)).keyUp(Keys.CONTROL).build().perform();
			
		sleep(3);
		
		List<WebElement> textse = driver.findElements(By.xpath("//li/div"));
		Actions actionsse = new Actions(driver);
		actionsse.keyDown(Keys.CONTROL).click(textse.get(2)).click(textse.get(3)).click(textse.get(4)).keyUp(Keys.CONTROL).build().perform();
			
		/*WebDriverWait wait = new WebDriverWait(driver, 100000);
		wait.until(elementIdentified(By.xpath("//li/div")));        
*/

		sleep(21);
		WebDriverWait waitseee = new WebDriverWait(driver, 100000);
		//waitseee.until(elementIdentified(By.xpath("//li/div")));
	//	waitseee.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/div")));


		//
		
		
		List<WebElement> textthrid = driver.findElements(By.xpath("//li/div"));
		waitseee.until(ExpectedConditions.visibilityOfAllElements(textthrid));
		waitseee.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li/div")));


		Actions actionsthrid = new Actions(driver);
        actionsthrid.keyDown(Keys.CONTROL).click(textthrid.get(5)).click(textthrid.get(6)).click(textthrid.get(7)).click(textthrid.get(8)).keyUp(Keys.CONTROL).build().perform();

        
        
		WebDriverWait waitlatest = new WebDriverWait(driver, 100000);
        List<WebElement> telatest = driver.findElements(By.xpath("//li/div"));
        waitlatest.until(ExpectedConditions.visibilityOfAllElements(telatest));
        waitlatest.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li/div")));
        Actions actionlatest = new Actions(driver);
        actionlatest.keyDown(Keys.CONTROL).click(telatest.get(9)).click(telatest.get(10)).click(telatest.get(11)).click(telatest.get(12)).keyUp(Keys.CONTROL).build().perform();

        
        
		WebDriverWait waitfour = new WebDriverWait(driver, 100000);
        List<WebElement> teltfour = driver.findElements(By.xpath("//li/div"));
        waitfour.until(ExpectedConditions.visibilityOfAllElements(teltfour));
        waitfour.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li/div")));
        Actions actionfour = new Actions(driver);
        actionfour.keyDown(Keys.CONTROL).click(teltfour.get(13)).click(teltfour.get(14)).click(teltfour.get(15)).click(teltfour.get(16))
        .click(teltfour.get(17)) .click(teltfour.get(18)) .click(teltfour.get(19)) .click(teltfour.get(20)) .click(teltfour.get(21))
        .click(teltfour.get(22)) .click(teltfour.get(23)).click(teltfour.get(24)).click(teltfour.get(25)).click(teltfour.get(26)).click(teltfour.get(27))
        .keyUp(Keys.CONTROL).build().perform();

        //........................................clicking the Tran. Type:.......................................................//
        
        sleep(3);

		WebDriverWait waitfive = new WebDriverWait(driver, 100000);
        List<WebElement> teltfive = driver.findElements(By.xpath("//li/div"));
        waitfour.until(ExpectedConditions.visibilityOfAllElements(teltfive));
        waitfour.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li/div")));
        Actions actionfive = new Actions(driver);
        actionfour.keyDown(Keys.CONTROL).click(teltfour.get(13)).click(teltfour.get(14)).click(teltfour.get(15)).click(teltfour.get(16))
        .click(teltfour.get(17)) .click(teltfour.get(18)) .click(teltfour.get(19)) .click(teltfour.get(20)) .click(teltfour.get(21))
        .click(teltfour.get(22)) .click(teltfour.get(23)).click(teltfour.get(24)).click(teltfour.get(25)).click(teltfour.get(26)).click(teltfour.get(27))
        .keyUp(Keys.CONTROL).build().perform();

        
        
        
        

		
			
			/*WebDriverWait wait = new WebDriverWait(driver, 100000);
			wait.until(elementIdentified(By.xpath("//li/div")));        
*/
			
		/*	Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL)
			       .click(text.get(0))
			       .click(text.get(1))
			       .click(text.get(2))
			       .click(text.get(3))
			       .click(text.get(4))
			       .click(text.get(5))
			    
			       .click(text.get(6))
			       .click(text.get(7))
			       .click(text.get(8))
			       .click(text.get(9))
			       .click(text.get(10))
			       .click(text.get(11))
			       .click(text.get(12))
			       .click(text.get(13))
			       .click(text.get(14))
			       .click(text.get(15))
			       
			       .keyUp(Keys.CONTROL).build()
			       .perform();*/
			
			
			/*sleep(6);
			List<WebElement> textsecond = driver.findElements(By.xpath("//li/div"));
			Actions actionssecond = new Actions(driver);
			actionssecond.keyDown(Keys.CONTROL)
			   .click(textsecond.get(6))
		       .click(textsecond.get(7))
		       .click(textsecond.get(8))
		       .click(textsecond.get(9))
		       .click(textsecond.get(10))
		       .click(textsecond.get(11))
		       .click(textsecond.get(12))
		       .click(textsecond.get(13))
		       .click(textsecond.get(14))
		       .click(textsecond.get(15))
		       .click(textsecond.get(16))
		       .click(textsecond.get(17))
		       .click(textsecond.get(18))
		       .click(textsecond.get(19))
		       .click(textsecond.get(20))
		       .click(textsecond.get(21))
		       .click(textsecond.get(22))
		       .click(textsecond.get(23))
		       .click(textsecond.get(14))
		       .click(textsecond.get(15))
		       

		       .keyUp(Keys.CONTROL)
		       .perform();
			*/
			
			

	driver.findElement(By.xpath(".//*[@id='rulesConfValueses5thresholdValue1']")).sendKeys("100");		
			

			
			
			/*
			fluentWait(By.xpath("//li/div")).click();
			WebElement ele = driver.findElement(By.xpath("//li/div"));

			Actions action = new Actions(driver);
			action.clickAndHold(ele).sendKeys(Keys.CONTROL, Keys.SHIFT).build().perform();

			// driver.findElement(By.xpath("//li/div")).sendKeys(Keys.SHIFT);

		
			WebElement toElement = driver.findElement(By.xpath("//li[2]/div"));
			toElement.click();
*/
			
			/*
			 * fluentWait(By.xpath(".//*[@id='frequency']")).sendKeys("80");
			 * 
			 * fluentWait(By.xpath(".//*[@id='no_of_slices']")).sendKeys("8");
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * "Screenshortbelow :" + ExtentTestManager.getTest()
			 * .addScreenCapture(GetScreenshort.capture(driver,
			 * "ScreenshortForExtentReport")));
			 * 
			 * fluentWait(By.xpath("//span[4]/a/span/span/span[2]")).click();
			 * 
			 * sleep(12); ExtentTestManager.getTest().log(LogStatus.INFO,
			 * "Screenshortbelow :" + ExtentTestManager.getTest()
			 * .addScreenCapture(GetScreenshort.capture(driver,
			 * "ScreenshortForExtentReport")));
			 * 
			 * fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click
			 * ();
			 * 
			 * sleep(15); ExtentTestManager.getTest().log(LogStatus.INFO,
			 * "Screenshortbelow :" + ExtentTestManager.getTest()
			 * .addScreenCapture(GetScreenshort.capture(driver,
			 * "ScreenshortForExtentReport")));
			 * 
			 * JavascriptExecutor jse = (JavascriptExecutor) driver;
			 * 
			 * jse.executeScript("scroll(0, -350);");
			 * 
			 * sleep(3);
			 * 
			 * System.out.println("pass");
			 */

		/*} catch (Exception e) {

			System.out.println(e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.FAIL, " Rule Simulator : Simulate   ");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		}*/

	}

	private static Function<WebDriver, List<WebElement>> elementIdentified(final By locator) {
		
	    return new Function<WebDriver,  List<WebElement>>() {
	        @Override
	        public List<WebElement> apply(WebDriver driver) {
	        	
	        
	            return (List<WebElement>) driver.findElements(locator);
	        };
	

	    };

}
}
