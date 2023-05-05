package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import elementrepository.DatePickersPage;

public class DatePickersTest extends BaseClass{
	
	DatePickersPage datePickersPage;
	
	@Test
	public void verifyDatePickersPageClicked() {
		datePickersPage = new DatePickersPage(driver);
		datePickersPage.clickonDatePickers();
	}
	
	@Test
	public void verifyDateShowed() {
		datePickersPage = new DatePickersPage(driver);
		datePickersPage.clickonDatePickers();
		datePickersPage.showDate();
	}
	
	
	@Test
	public void verifyDatePicker() {
		String date = "22-03-2026";
		datePickersPage = new DatePickersPage(driver);
		datePickersPage.clickonDatePickers();
		datePickersPage.selectDate(date);
		
	}

}
