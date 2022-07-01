package verificationUsingTestNgHardAssert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PomTestNg {
     WebDriver driver;
     POMOfVctc POM;
	
	@BeforeClass
  public void LauchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 
		POM = new POMOfVctc(driver);
	}
	
	@Test
	public void verifyRadioButton()
	{
		POM.ClickOnRadioButton();
	}
	
	@Test
	public void getText()
	{
		POM.GetText();
	}
	
	@Test
	public void VerifyhideTextBox()
	{
		POM.ClickOnHideTextBox();
	}
	
	@Test
	public void VerifyshowTextBox()
	{
		POM.ClickOnShowTextBox();
	}
	
	@Test
	public void VerifytextDisplay()
	{
		POM.textDisplayed();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
}
