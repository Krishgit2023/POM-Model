package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class DatePickersPage {

	WebDriver driver;
	
	@FindBy(xpath = "//a[@href='date-picker.php']")
	WebElement datepickers;
	@FindBy(xpath = "//input[@id='single-input-field']")
	WebElement datefield;
	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='datepicker-switch']")
	WebElement monthElement;
	

	
	  @FindBy(xpath="//div[@class='datepicker-days']//th[@class='prev']")
	  WebElement previousElement;
	  
	  @FindBy(xpath="//div[@class='datepicker-days']//th[@class='next']")
	 WebElement nextElement;
	 

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

	public void selectDate(String date) {
		showDate();
		String split[] = date.split("-");
		String year = split[2];
		String day = split[0];
		String monthnumber = split[1];
		String month = "";
		int m = Integer.parseInt(monthnumber);
		int y = Integer.parseInt(year);
		switch (m) {
		case 01:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
		}
		String month_year = month+ " " +year;
		while(true) {
			String currentmonthtext = monthElement.getText();
		if(currentmonthtext.equals(month_year)) {
			break;
		}else if(m>4 && year.equals("2023"))
			nextElement.click();
		else if(y>2023)
			nextElement.click();
		else 
			previousElement.click();
			}
		driver.findElement(By.xpath("//td[@class='day' and text()="+day+"]")).click();
		}
	}

		

