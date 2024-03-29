package PageObject;

import java.io.IOException;


 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.screenshot;

 
public class CI_details {
	WebDriver driver;
	public CI_details(WebDriver driver)
	{
		this.driver=driver;
	}
	public void details() throws IOException{
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//*[contains(text(),'Click here')]")).click();
        driver.findElement(By.xpath("//*[starts-with(text(),'Mumbai')]")).click();
        driver.findElement(By.xpath("//*[text()='MH43']")).click();        
        driver.findElement(By.xpath("//*[text()='VOLKSWAGEN']/parent::span|//*[text()='VOLKSWAGEN']")).click();
        driver.findElement(By.xpath("//*[text()='POLO GT']/parent::span|//li[text()='POLO GT']")).click();
        driver.findElement(By.xpath("//*[text()='Diesel']")).click();
        driver.findElement(By.xpath("//*[text()='1.6 TDI HIGHLINE DIESEL (1598 cc)']")).click();
        driver.findElement(By.xpath("//input[@id='name']|//input[@placeholder='Full name']")).sendKeys("Darshan Raval");
        driver.findElement(By.xpath("//input[@id='email']|//input[@placeholder='Your email']")).sendKeys("Raval@test");
        driver.findElement(By.xpath("//input[@id='mobileNo']|//input[@placeholder='Mobile number']")).sendKeys("8953580980");
        
        screenshot sc = new screenshot(driver);
        sc.ss();
	}
 
}