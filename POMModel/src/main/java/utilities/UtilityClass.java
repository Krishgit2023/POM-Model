package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Table.Cell;

public class UtilityClass {
	
	WebDriver driver;
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	XSSFRow row;
	XSSFCell cell;
	
	
	public String get_textofelement(WebElement element) {
		return element.getText();	
	}
	
	public UtilityClass(WebDriver driver) {
		this.driver = driver;
	}
	
	 public List<String> GetTextOfElements(String xpath){
		 List<String> text=new ArrayList<String>();
		 List<WebElement> elements = driver.findElements(By.xpath(xpath));
		 for(WebElement element:elements) {
				String data = element.getText();
				text.add(data);
			}
		 return text;
	
	 }
	 
	 public List<String> GetTextOfElements(List<WebElement> Listofelements){
		 List<String> text=new ArrayList<String>();
		 for(WebElement element:Listofelements) {
				String data = element.getText();
				//System.out.println(data);
				text.add(data);
				
			}
		 return text;
	 }
	 
	 public boolean get_elementselected(WebElement element) {
			return element.isSelected();	
		}
	 
	 //excel read//
	 public void getExceldata(int r, int c) {
		 String path ="C:\\Users\\krishna\\Desktop\\Book1.xlsx";
		 try {
			 File src = new File(path);
			 FileInputStream fi = new FileInputStream(src);
			 workbook = new XSSFWorkbook(fi);
			 sheet = workbook.getSheet("Sheet1");
			 row = sheet.getRow(r);
			 cell = row.getCell(c);
			 System.out.println(cell.getNumericCellValue());  //to get numeric values
		 }catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 }
	 
	
	
	 
	 


