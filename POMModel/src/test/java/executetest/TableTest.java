package executetest;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import elementrepository.InputFormPage;
import elementrepository.TablePage;

public class TableTest extends BaseClass {

	TablePage tablePage;

	@Test()
	public void verifyNames() {
		boolean testcasestatus = true;
		tablePage = new TablePage(driver);
		tablePage.clickonTableHeader();
		
		List<String> actualnames = new ArrayList<String>();
		actualnames = tablePage.getTablePageNames();
		List<String> expectednames = new ArrayList<String>();
		expectednames.add("Tiger Nixon");
		expectednames.add("Garrett Winters");
		expectednames.add("Ashton Cox");
		expectednames.add("Cedric Kelly");
		expectednames.add("Airi Satou");
		expectednames.add("Brielle Williamson");
		expectednames.add("Herrod Chandler");
		expectednames.add("Rhona Davidson");
		expectednames.add("Colleen Hurst");
		expectednames.add("Sonya Frost");
		
		//logic1
		for (int i = 0; i<expectednames.size(); i++) {
			if(!expectednames.get(i).equals(actualnames.get(i))){
				System.out.println("expected :" +expectednames);
				System.out.println("actual :" +actualnames);
				testcasestatus=false;
		}
			Assert.assertTrue(testcasestatus);
	}
	
	}
		@Test
		public void verifySalary(){
			tablePage = new TablePage(driver);
			tablePage.clickonTableHeader();
			tablePage.printsalary();
		}
		
		@Test
		public void verifyPersonsOffice() {
		tablePage = new TablePage(driver);
		tablePage.clickonTableHeader();
		String office = tablePage.getPersonsOffice("Cedric Kelly");
		
		System.out.println(office);
		
		}

}

