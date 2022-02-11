package Selenium.Cucumber;

import org.openqa.selenium.By;

import cucumber.api.java.en.And;

public interface locator {
	
	

	public static By brandallpages = (By.xpath("//*[@class='Header_KDVg mb15 Heading-inline_5Rtm']"));
	public static By brandwelove =  (By.xpath("//*[@class='BrandsWeLove-inline_6E83 mb3 BrandsWeLove-inline_4xAV Heading-inline_3joe']"));
	public static By Gracoimage = (By.xpath("//img[@alt='Shop Graco']"));			
	public static By BrandNameonplp = (By.xpath("//h2[contains(text(),'Graco')]"));
			

}
