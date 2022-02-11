package Selenium.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination_brand_pages extends LocatorClass implements locator {

	static WebDriver driver = Hooks.driver;

	public static String Url = "https://www.buybuybaby.com/";

	@When("^Launch browser$")
	public static void read_brand_title() throws Exception {

		System.out.println("Launch Browser");
		
		driver.get(Url);
		Thread.sleep(5000);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@data-test='sddLink']")).click();
	}

	@Then("^Go to shop brand page$")
	public static void Go_to_shop_brand_page() throws Exception {

		// String url = ExcelRead2.readURLFromExcel();
		// String url1 ="https://www.buybuybaby.com/";
		driver.get(Url + "store/page/brands");
		Thread.sleep(5000);
		Thread.sleep(5000);

		// driver.get(url"store/page/brands");

		String Browseallbrands = driver.findElement(brandallpages).getText();
		System.out.println("Brand Title name is  " + Browseallbrands);
		String Brandwelove = driver.findElement(brandwelove).getText();
		System.out.println("Brand Title name is  " + Brandwelove);
	}

	@And("^Click on brand logo and link and verify user is redirected to correct page$")
	public static void Click_on_brand_logo_and_link() throws Exception {

		Thread.sleep(10000);

		driver.get(Url + "store/page/brands");
		String BrandNameOnBrandPage = driver.findElement(Gracoimage).getText();
		BrandNameOnBrandPage = "Graco";
		Thread.sleep(5000);
		System.out.println("Brand Title name is " + BrandNameOnBrandPage);
		Thread.sleep(10000);
		driver.findElement(Gracoimage).click();

		Thread.sleep(7000);
		String BrandNameonplp = driver.findElement(By.xpath("//h2[contains(text(),'Graco')]")).getText();
		System.out.println("Brand Title name is  " + BrandNameonplp);
		Thread.sleep(4000);

		if (BrandNameOnBrandPage.equals(BrandNameonplp)) {

			System.out.println("###############Test Case Pass#############");

		} else {
			System.out.println("##Test case Fail ##");

		}

	}
};
