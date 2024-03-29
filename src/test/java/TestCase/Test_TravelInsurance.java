package TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.TI_contactDetails;
import PageObject.TI_destination;
import PageObject.TI_finalPlan;
import PageObject.TI_medicalHistory;
import PageObject.TI_travellersAge;
import PageObject.TI_tripDates;

public class Test_TravelInsurance {
	WebDriver driver;
	  @Test
	  public void tHealth() throws InterruptedException {
		  HomePage h = new HomePage(driver);
		  h.clickTravel();
		
		  Thread.sleep(3000);
		 
		  
		  TI_destination ti = new TI_destination(driver);
		  ti.country();

		  Thread.sleep(3000);
		  
		  TI_tripDates td = new TI_tripDates(driver);
		  td.dates("15","April","2024","10","June","2024");
		  Thread.sleep(3000);
		  
		  TI_travellersAge ta = new TI_travellersAge(driver);
		  ta.ages("22 years","23 years");
	
		  Thread.sleep(3000);
		  
		  TI_medicalHistory mh = new TI_medicalHistory(driver);
		  mh.med();
		
		  Thread.sleep(3000);
		  
		  TI_contactDetails cd =  new TI_contactDetails(driver);
		  cd.mob("8953580988");
		
		  Thread.sleep(3000);
		  
		  TI_finalPlan fp = new TI_finalPlan(driver);
		  fp.plan();
		  
		  Thread.sleep(3000);
		  
	  }
	  @BeforeTest
	  public void beforeTest()
	  {
		  driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		  driver.get("https://www.policybazaar.com/");
		
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  driver.quit();
	  }
	}