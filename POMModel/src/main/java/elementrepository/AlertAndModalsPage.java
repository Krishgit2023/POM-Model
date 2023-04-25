package elementrepository;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class AlertAndModalsPage {

	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Alerts and Modals')]")
	WebElement alert_and_modal;
	@FindBy(xpath = "//a[contains(text(),'Javascript Alert')]")
	WebElement javascript_alert;
	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement javascript_alert_box1;
	@FindBy(xpath = "//button[@class='btn btn-warning']")
	WebElement javascript_alert_box2;
	@FindBy(xpath = "//p[text()='You pressed Cancel!']")
	WebElement canceled_message;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement javascript_alert_box3;
	@FindBy(xpath = "//p[@id='prompt-demo']")
	WebElement entered_message;
	
	UtilityClass utilityclass;
	
	public AlertAndModalsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonAlertandModalHeader() {
		alert_and_modal.click();
		
	}
	
	public void clickonJavascriptAlert() {
		javascript_alert.click();
	}
	
	public void clickonAlertBox1() throws InterruptedException {
		javascript_alert_box1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	public void clickonAlertBox2() throws InterruptedException {
		javascript_alert_box2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		utilityclass = new UtilityClass(driver);
		String CanceledMessage = utilityclass.get_textofelement(canceled_message);
		System.out.println("Message displayed after canceling alert : " +CanceledMessage);
	}
	
	public void clickonAlertBox3() throws InterruptedException {
		javascript_alert_box3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Test");
		driver.switchTo().alert().accept();
		utilityclass = new UtilityClass(driver);
		String EnteredMessage = utilityclass.get_textofelement(entered_message);
		System.out.println("Message displayed after entering text : " +EnteredMessage);
		
	}
}
