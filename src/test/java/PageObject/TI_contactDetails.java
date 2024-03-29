package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TI_contactDetails {
	WebDriver driver;
	public TI_contactDetails(WebDriver driver) {
		this.driver= driver;
		}

public void mob(String mNo) throws InterruptedException{

	 
	 driver.findElement(By.id("mobileNumber")).sendKeys(mNo);
	Thread.sleep(2000);
	 driver.findElement(By.tagName("button")).click(); 
}
}
