package elementrepository;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.UtilityClass;

public class HomePage {
	
	WebDriver driver;
	By obsqura_logo = By.xpath("//div[@class='top-logo']//img[@alt='logo']");
	UtilityClass utilityclass;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isObsquraLogoDisplayed() {
		WebElement logo = driver.findElement(obsqura_logo);
		return logo.isDisplayed();
		
	}
	
	public void gethomepageheaders() {
		utilityclass = new UtilityClass(driver);
		List<String> headers = 	new ArrayList<String>();
		headers=utilityclass.GetTextOfElements("//div[@id='collapsibleNavbar']");
		System.out.println(headers);
	}

}
