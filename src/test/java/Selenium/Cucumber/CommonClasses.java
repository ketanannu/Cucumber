package Selenium.Cucumber;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import cucumber.api.Scenario;

public class CommonClasses {
	
	static WebDriver driver = Hooks.driver;
	
	
	//Search Product
	public void search_product() throws Throwable {
		{
			driver.findElement(By.id("searchInput")).sendKeys("1010233607");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@aria-label ='Search']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@elementclicked='Image']")).click();
		}}

	public void signin() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='accountLink']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='signin-email']")).sendKeys("ketan@gmail.com");

		driver.findElement(By.xpath("//*[@id='signin-password']")).sendKeys("Test@123");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@id='signin-submit']")).click();
		Thread.sleep(5000);
		
	}



		public void takeScreenShot(WebDriver driver, Scenario scenario) throws IOException
		{
			TakesScreenshot sc = (TakesScreenshot) driver;
			byte[] screenshot = sc.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
	
		public void shipto() throws Throwable
		{
		//Click on ship to link 
			Thread.sleep(5000);
		    driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
		    Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@id='ShipToUSA']")).click();
			
	
	}
		public void shipto_Country_change() throws Throwable
		{
		//Click on ship to link 
		driver.findElement(By.xpath("//button[@name='shipToLink']")).click();
		//Flag
		driver.findElement(By.xpath("//span[@class='flag flagin']")).click();
		//Ship to usa 
		driver.findElement(By.xpath("//button[@id='ShipToUSA']")).click();
		//Verify ship to modal open 
		driver.findElement(By.xpath("//img[@class='CountryCurrencyModal_6L9a4R']")).click();
		//Country
		driver.findElement(By.xpath("//button[@id='countryDropdown-button']")).click();
		//select country Algeria
		driver.findElement(By.xpath("//button[contains(text(),'Algeria')][@index=3]")).click();
		//Select button update county

	}
		
	
	public void scroll()
	{
		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		scroll1.executeScript("window.scrollBy(0,500)", "");
	}};



