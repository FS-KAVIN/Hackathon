package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TI_medicalHistory {
	WebDriver driver;
	public TI_medicalHistory(WebDriver driver) {
		this.driver= driver;
		}

public void med(){
	 driver.findElement(By.id("ped_no")).click();
	 driver.findElement(By.tagName("button")).click(); 
}
}
