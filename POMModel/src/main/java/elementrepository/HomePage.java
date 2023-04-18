package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	By obsqura_logo = By.xpath("//div[@class='top-logo']//img[@alt='logo']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isObsquraLogoDisplayed() {
		WebElement logo = driver.findElement(obsqura_logo);
		return logo.isDisplayed();
		
	}

}
