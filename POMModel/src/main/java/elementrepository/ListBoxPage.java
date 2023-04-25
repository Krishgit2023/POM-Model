package elementrepository;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class ListBoxPage {
	
	WebDriver driver;
	@FindBy(xpath = "//a[@id='list0box']")
	WebElement list_box_page;
	
	UtilityClass utilityclass;
	
	
	public ListBoxPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnListBoxPage() {
		list_box_page.click();
		
	}
	
	public void getTextofOptionsinLeftSide() {
		utilityclass = new UtilityClass(driver);
		List<String> ListNames = 	new ArrayList<String>();
		ListNames = utilityclass.GetTextOfElements("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']");
		System.out.println("List names are: " +ListNames);
	}
	
	
}
