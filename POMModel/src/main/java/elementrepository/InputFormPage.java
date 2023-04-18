package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.UtilityClass;

public class InputFormPage {
	
	WebDriver driver;
	By input_form = By.xpath("//li[@class='nav-item']//a[@href='simple-form-demo.php']");
	By show_message_button = By.xpath("//button[@id='button-one']");
	UtilityClass utilityclass = new UtilityClass();
	
	public InputFormPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void clickonInputForm() {
		WebElement InputForm = driver.findElement(input_form);
		InputForm.click();
		
	}
	
	public void gettextofshowmessagebutton() {
		WebElement ShowMessageButton = driver.findElement(show_message_button);
		String text=utilityclass.get_textofelement(ShowMessageButton);
		
	}

}
