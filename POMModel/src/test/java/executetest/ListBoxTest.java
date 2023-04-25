package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import elementrepository.ListBoxPage;

public class ListBoxTest extends BaseClass {
	
	ListBoxPage listboxpage;
	
	@Test
	public void verifyBootstrapDualListNames() {
		listboxpage = new ListBoxPage(driver);
		listboxpage.clickOnListBoxPage();
		listboxpage.getTextofOptionsinLeftSide();
	}

}
