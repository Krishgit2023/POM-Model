package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickersPage {
	
	WebDriver driver;
	@FindBy(xpath="//a[@href='date-picker.php']")
	WebElement datepickers;
	@FindBy(xpath ="//input[@id='single-input-field']")
	WebElement datefield;
	
	/*@FindBy(xpath="//div[@class='datepicker-days']//th[@class='prev']")
	WebElement previousElement;
	@FindBy(xpath="//div[@class='datepicker-days']//th[@class='next']")
	WebElement nextElement;*/
	
	
	public DatePickersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void clickonDatePickers() {
		datepickers.click();
		
	}
	
	public void showDate() {
		datefield.click();
		
		
	}

}
