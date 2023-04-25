package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityClass {
	
	WebDriver driver;
	
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
	 }
	 
	
	
	 
	 


