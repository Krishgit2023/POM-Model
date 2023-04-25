package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class InputFormPage {
	
	WebDriver driver;
	By input_form = By.xpath("//li[@class='nav-item']//a[@href='simple-form-demo.php']");
	By show_message_button = By.xpath("//button[@id='button-one']");
	
	//using pagefactory
	@FindBy(xpath = "//li[@class='list-group-item']//a[@href='check-box-demo.php']")
	WebElement simpleformdemo;
	
	UtilityClass utilityclass;
	
	public InputFormPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void clickonInputForm() {
		WebElement InputForm = driver.findElement(input_form);
		InputForm.click();
		
	}
	
	public void gettextofshowmessagebutton() {
		WebElement ShowMessageButton = driver.findElement(show_message_button);
		String text=utilityclass.get_textofelement(ShowMessageButton);
		
	}
	
	public void clickonCheckboxDemo() {
		simpleformdemo.click();
		
	}

}
