package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import elementrepository.AlertAndModalsPage;

public class AlertAndModalsTest extends BaseClass {
	
	AlertAndModalsPage alertandmodalspage;
	
	
	@Test
	public void verifyAlert1clicked() throws InterruptedException {
		alertandmodalspage = new AlertAndModalsPage(driver);
		alertandmodalspage.clickonAlertandModalHeader();
		alertandmodalspage.clickonJavascriptAlert();
		alertandmodalspage.clickonAlertBox1();
		
	}
	
	@Test
	public void verifyAlert2Clicked_GetCancelMessage() throws InterruptedException {
		alertandmodalspage = new AlertAndModalsPage(driver);
		alertandmodalspage.clickonAlertandModalHeader();
		alertandmodalspage.clickonJavascriptAlert();
		alertandmodalspage.clickonAlertBox2();
	}
	
	@Test
	public void verifyAlert3ClickedEnteringText_GetMessage() throws InterruptedException {
		alertandmodalspage = new AlertAndModalsPage(driver);
		alertandmodalspage.clickonAlertandModalHeader();
		alertandmodalspage.clickonJavascriptAlert();
		alertandmodalspage.clickonAlertBox3();
	}


}
