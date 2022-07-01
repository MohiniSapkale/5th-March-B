package kiteAppBaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtility.UtilityUsingPropertyFile;

public class BaseClassUsingProperty {
	
	protected WebDriver driver;
	//browser setup
	public void openBrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityUsingPropertyFile.readDataFromPropertyFile("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
}
