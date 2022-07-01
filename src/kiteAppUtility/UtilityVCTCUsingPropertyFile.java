package kiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityVCTCUsingPropertyFile {
	
	public static void takeScreenshots(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(4);
		File dest = new File("D:\\5th march batch\\Screeshots\\myScreenshot"+random+".png");
		FileHandler.copy(src, dest);
	}
	
	public static String readDataFromPropertyFile1(String key) throws IOException   //To read Data from MyProperty file then used read data from Property File
	{
		Properties prop = new Properties();   //create Properties class object 
		FileInputStream myProp = new FileInputStream("C:\\Users\\mohin\\eclipse-workspace\\Selenium_5th_March\\myProperty1.properties");  //give the path My Property file
		prop.load(myProp);    //load method load the my properties
		String Value = prop.getProperty(key);  
		return Value;
	}
	
	public static void implicitWait(WebDriver driver,int timeUnit)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}
	
	public static void ScrollIntoView(WebDriver driver,WebElement button)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",button);
	}
	
	
	

}
