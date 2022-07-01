package kiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtility.UtilityUsingPropertyFile;

public class BaseClassUsingPropertyWhenTCFailTakeSS {

	
	protected static WebDriver driver;
	//browser setup
	public void openBrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityUsingPropertyFile.readDataFromPropertyFile("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	public void takeScreenshot(String TcName) throws IOException   // To take ScreenShot then used TakeScreenShot method
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest= new File("D:\\5th march batch\\Screeshots\\"+TcName+".png");
	FileHandler.copy(src, dest);
    }
}
