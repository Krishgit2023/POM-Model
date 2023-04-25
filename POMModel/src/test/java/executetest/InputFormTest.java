package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import elementrepository.InputFormPage;

public class InputFormTest extends BaseClass {
	
	InputFormPage inputformpage;
	
	@Test
	public void verifyShowMessageButtonMessage() {
		inputformpage = new InputFormPage(driver);
		inputformpage.clickonInputForm();
		
	}
	
	@Test
	public void verifySingleCheckboxClicked() {
		inputformpage = new InputFormPage(driver);
		
		inputformpage.clickonInputForm();
		inputformpage.clickonCheckboxDemo();
		
	}
	
	

}
