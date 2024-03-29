package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {

	WebDriver driver;
	public screenshot(WebDriver driver)
	{
		this.driver=driver;
	}
	public void ss() throws IOException {
    TakesScreenshot scr = ((TakesScreenshot) driver);
    File scrFile = scr.getScreenshotAs(OutputType.FILE);
    File destFile = new File("C:\\Users\\2320028\\OneDrive - Cognizant\\Desktop\\Project\\Project\\Screenshots\\screenshot.png");
    FileUtils.copyFile(scrFile, destFile);   
}
}
