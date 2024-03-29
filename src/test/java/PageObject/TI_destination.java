package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TI_destination {
	
	 WebDriver driver;
		public TI_destination(WebDriver driver) {
			this.driver= driver;
			}
	
     public void country(){
	 
	List<WebElement> l1 = driver.findElements(By.xpath(" //*[@class='countryButton']"));
	 for(WebElement we : l1 ) {

	 	if(we.getText().equalsIgnoreCase("United Kingdom")) {
	 		we.click();
	 		break;
	 	}
	   }
	 
	 driver.findElement(By.tagName("button")).click();
	 
	
}
}
