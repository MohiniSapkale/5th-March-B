package kiteAppBaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtility.UtilityVCTCUsingPropertyFile;

public class BaseClassVCTCUsingProperty {
	
	protected WebDriver driver;
	//browser setup
	public void openBrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityVCTCUsingPropertyFile.readDataFromPropertyFile1("URL"));
	UtilityVCTCUsingPropertyFile.implicitWait(driver, 500);
	}

}
