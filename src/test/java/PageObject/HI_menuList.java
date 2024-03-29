package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HI_menuList {
     WebDriver driver;
	public HI_menuList(WebDriver driver) {
		this.driver= driver;
		}
	public void menuList() {
		List<WebElement> l1 = driver.findElements(By.xpath("//ul/li[2]//div[3]//li"));
		for(WebElement we : l1) {
		System.out.println(we.getText());
	}
	}
}