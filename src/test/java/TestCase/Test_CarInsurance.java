package TestCase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.CI_details;
import PageObject.HomePage;

public class Test_CarInsurance {
	WebDriver driver;
	  @Test
	  public void f() throws IOException {
		  HomePage h = new HomePage(driver);
		  h.clickCar();
		  
		  CI_details ci = new CI_details(driver);
		  ci.details();
		  
	  }
	  @BeforeTest
	  public void beforeTest() throws InterruptedException 
	  {  driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	  driver.get("https://www.policybazaar.com/");
	  Thread.sleep(5000);
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  driver.quit();
	  }
}