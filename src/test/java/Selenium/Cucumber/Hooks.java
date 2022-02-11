package Selenium.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Hooks {

	CommonClasses common = new CommonClasses();
	
	

	static WebDriver driver = null;
	 public String Url ="https://www.buybuybaby.com/";

	@SuppressWarnings("unused")
	@Before
	public void BeforeSteps() throws Throwable {
		
		
		//System.setProperty("webdriver.gecko.driver",
			//	"C:\\Users\\ba06875\\Desktop\\Dataa from Test User\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ba06875\\Downloads\\chromedriver_win3291\\chromedriver.exe");
		driver = new ChromeDriver();
					
		driver.manage().window().maximize();
//driver.get(Url);
		
		// String Url = ExcelRead2.readURLFromExcel();
		 driver.get(Url+"?web3feo");
		
		//    Thread.sleep(5000); Thread.sleep(5000);
		    //driver.findElement(By.xpath("//button[contains(text(),'No, Continue without 20% off')]")).click();
		 
		   /*if (driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).isDisplayed());
		   {
		   driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
		   }
		  Thread.sleep(5000);
		  */
		  
	}};
		  
		/*  driver.findElement(By.xpath("//button[@id='ShipToUSA']")).click();
		  Thread.sleep(5000);
		  if(driver.findElement(By.xpath("//button[@data-locator='checkout-crossicon']")).isDisplayed())
			 {
			 driver.findElement(By.xpath("//button[@data-locator='checkout-crossicon']")).
			  click(); Thread.sleep(5000);
			 }
			else if (!driver.findElement(By.xpath("//button[@data-locator='checkout-crossicon']")).isDisplayed())
			{
			System.out.println("Checkout Not appeared");
		 }}

	@After
	public void AfterSteps(Scenario scenario) throws IOException {

		byte[] src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(src, "image/png");
		System.out.println("Screenshot Capture");
		// driver.close();

	}
};*/
