package kiteExcelReading;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;

public class KiteTestCrossBrowser {
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	WebDriver driver;
	Sheet MySheet;
	
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String browser) throws EncryptedDocumentException, IOException
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\5th march batch\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}
	
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("lauching url",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	login= new KiteLoginPage(driver);
	home= new KiteHomePage(driver);
	pin= new KitePinPage(driver);
	File MyFile=new File("D:\\5th march batch\\MyFile.xlsx");
    MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
	}
	@BeforeMethod
	public void loginToKite() 
	{
	login.sendUsername(MySheet.getRow(0).getCell(0).getStringCellValue());
	Reporter.log("Sending Username", true);
	login.sendPassword(MySheet.getRow(0).getCell(1).getStringCellValue());
	Reporter.log("Sending Password",true);
	login.clickOnLoginButton();
	Reporter.log("Clicking on login button",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	pin.sendPin(MySheet.getRow(0).getCell(2).getStringCellValue());
	Reporter.log("Sending PIN",true);
	pin.clickOnContinue();
	Reporter.log("Clicking on continue button",true);
	}
	@Test
	public void verifyKiteUserName() 
	{
	// expected uSernAMe--> excell
	//actual userNAme???
	String expectedUserID = MySheet.getRow(0).getCell(0).getStringCellValue();
	String actualUserID = home.getActualUserID();
	Reporter.log("Validating user ID ",true);
	Assert.assertEquals(expectedUserID, actualUserID,"Expected UserID and Actual UserID are not matching TC is FAILED");
	Reporter.log("Expected UserID and Actual UserID are matching TC is PASSED", 
	true);
	}
	@AfterMethod 
	public void logOutFromKiteApp() throws InterruptedException
	{
	home.clickOnLogoutButton();
	Reporter.log("Logging out.......",true);
	}
	@AfterClass
	public void closeBrowser()
	{
	Reporter.log("closing browser", true);
	driver.close();
	}
}
