package PageObject;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TI_travellersAge {
	WebDriver driver;
	public TI_travellersAge(WebDriver driver) {
		this.driver= driver;
		}

public void ages(String age1,String age2) throws InterruptedException{
	 //Count
	
List<WebElement> count = driver.findElements(By.xpath("//*[@class='memSelectRadioWrapper__radio']"));
int mem = 2;

for(WebElement s1 : count) {

	 int exp =Integer.parseInt(s1.getText().substring(0,1));
	if(exp==mem) {
		s1.click();
		break;
	}
	else if(exp>=4) {
		s1.click();
		break;
	}
}
    //Age

List<String> ages = new LinkedList<String>();
ages.add(age1);
ages.add(age2);

List<WebElement> l3 = driver.findElements(By.id("divarrow_undefined"));


for(int i = 0; i<l3.size();i++) {
l3.get(i).click();

List<WebElement> age = driver.findElements(By.xpath("//*[@class='options_box_wrapper__option']"));

for(WebElement element : age ) {
	
	 if(element.getText().equals(ages.get(i))) { 
		 element.click();
		 //((JavascriptExecutor)driver).executeScript("arguments[0].click();",element); 
	     break;
	 }
	
	}
}

Thread.sleep(3000);
driver.findElement(By.tagName("button")).click(); 
}
}
