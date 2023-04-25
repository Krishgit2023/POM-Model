package executetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import elementrepository.HomePage;

public class HomeTest extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void verifyObsquraLogo() {
		 homePage = new HomePage(driver);
		 boolean actualresult = homePage.isObsquraLogoDisplayed();
		 Assert.assertTrue(actualresult);
		
		
	}
	
	@Test
	public void verifyHeaders() {
		homePage = new HomePage(driver);
		homePage.gethomepageheaders();
		 
	}
	
	@Test
	public void verifyShowMessage() {
		
	}

}
