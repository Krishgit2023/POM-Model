package executetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import elementrepository.HomePage;
import utilities.UtilityClass;

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
	
	@Test
	public void verifyExcelRead() {
		UtilityClass utility = new UtilityClass(driver);
		utility.getExceldata(0,0);
		
	}

}
