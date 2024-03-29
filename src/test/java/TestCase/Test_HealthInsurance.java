package TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HI_menuList;
import PageObject.HomePage;

public class Test_HealthInsurance {
	 WebDriver driver;
  @Test
  public void f() {
	
	  HomePage h = new HomePage(driver);
	  h.hoverHealth();
	  
	  HI_menuList hi = new HI_menuList(driver);
	  hi.menuList();
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	  driver.get("https://www.policybazaar.com/");
	  Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }
}
