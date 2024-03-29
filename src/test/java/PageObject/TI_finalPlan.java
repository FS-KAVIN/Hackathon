package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TI_finalPlan {
	WebDriver driver;
	public TI_finalPlan(WebDriver driver) {
		this.driver= driver;
		}

public void plan() throws InterruptedException{
	
	 driver.findElement(By.id("studentTrip")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("Traveller_1")).click();
	 driver.findElement(By.id("Traveller_2")).click();
	 
	 Select select=new Select(driver.findElement(By.id("feet")));
		select.selectByValue("1");
		driver.findElement(By.xpath("//*[text()='Apply']")).click();


		  Thread.sleep(2000);
		  
	driver.findElement(By.xpath("//section[1]/details/summary")).click();

	driver.findElement(By.id("17_sort")).click();

	 Thread.sleep(2000);
	 
	//Display least 3 company names and price
	List<WebElement> cmp = driver.findElements(By.xpath("//*[@class='quotesCard--insurerName']"));

	List<WebElement> prc = driver.findElements(By.xpath("//*[@class='premiumPlanPrice']"));

	List<WebElement> pln = driver.findElements(By.xpath("//*[@class='quotesCard--insurerName']/following-sibling::p"));


	for(int i=0;i<3;i++) {
		
		System.out.println("Plan: "+pln.get(i).getText());
		System.out.println("Company Name: "+cmp.get(i).getText());
		System.out.println("Price: "+prc.get(i).getText());
		
	}


		}
}


