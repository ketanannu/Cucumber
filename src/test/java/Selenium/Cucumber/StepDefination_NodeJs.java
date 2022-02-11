package Selenium.Cucumber;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination_NodeJs {

	// static WebDriver driver = Hooks.driver;
	static WebDriver driver = Hooks.driver;
	public static String Url = "https://www.buybuybaby.com/";

	@When("^Launch browserss$")
	public static void read_nodeJS() throws Exception {

		System.out.println("Launch Browser");
	}

	@Then("^Verify the home page on nextJS$")
	public static void run_nodeJS() throws Exception {

		// String url = ExcelRead2.readURLFromExcel();
		// String url1 ="https://www.buybuybaby.com/";
		driver.get(Url + "?contenstack=true&web3feo");
		Thread.sleep(5000);
		HttpURLConnection huc = null;
		int respCode = 200;
		if (Url == null || Url.isEmpty()) {
			System.out.println("URL is either not configured for anchor tag or it is empty");

		}
		try {
			huc = (HttpURLConnection) (new URL(Url).openConnection());

			huc.setRequestMethod("HEAD");

			huc.connect();

			respCode = huc.getResponseCode();

			System.out.println(respCode);

			if (respCode >= 400) {
				System.out.println(Url + " is a broken link");
			} else {
				System.out.println(Url + " is a valid link");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();

	}
};
