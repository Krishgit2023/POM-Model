package elementrepository;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class TablePage {

	WebDriver driver;
	By table_page = By.xpath("//li[@class='nav-item']//a[@href='table-pagination.php']");

	@FindBy(xpath = "//table[@class='table table-striped table-bordered table-sm dataTable']//td[6]")
	List<WebElement> salarycolumn;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr//td[1]")
	List<WebElement> nameelements;
	
	

	UtilityClass utilityclass;

	public TablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void printsalary() {
		utilityclass = new UtilityClass(driver);
		List<String> salarytable = new ArrayList<String>();
		salarytable = utilityclass.GetTextOfElements(salarycolumn);
		System.out.println(salarytable);

	}

	public void clickonTableHeader() {
		WebElement TableHeader = driver.findElement(table_page);
		TableHeader.click();

	}

	public List<String> getTablePageNames() {
		utilityclass = new UtilityClass(driver);
		List<String> tableheaders = new ArrayList<String>();
		tableheaders = utilityclass.GetTextOfElements(
				"//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr//td[1]");
		// System.out.println(tableheaders);
		return tableheaders;
	}

	public String getPersonsOffice(String personname) {
		utilityclass = new UtilityClass(driver);
		List<String> names = new ArrayList<String>();
		names = utilityclass.GetTextOfElements(nameelements);
		System.out.println(names);
		int i;
		for (i = 0; i < names.size(); i++) {
			if (names.get(i).equals(personname)) {
				i++;
				break;
			}
		}

		WebElement officElement = driver.findElement(
				By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr[" + i
						+ "]//td[3]"));
		return officElement.getText();
	}
}
