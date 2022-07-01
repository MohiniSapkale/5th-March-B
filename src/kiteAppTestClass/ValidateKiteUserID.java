package kiteAppTestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClasses;
import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;
import kiteAppUtility.Utility;

public class  ValidateKiteUserID extends BaseClasses {
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	@BeforeClass
	public void launchBrowser()
	{
	openBrowser();
	login=new KiteLoginPage(driver);
	pin= new KitePinPage(driver);
	home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException 
	{
	login.sendUsername(Utility.readDataFormExcel(0, 0));
	Reporter.log("Sending Username", true);
	login.sendPassword(Utility.readDataFormExcel(0, 1));
	Reporter.log("Sending Password",true);
	login.clickOnLoginButton();
	Reporter.log("Clicking on login button",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	pin.sendPin(Utility.readDataFormExcel(0, 2));
	Reporter.log("Sending PIN",true);
	pin.clickOnContinue();
	Reporter.log("Clicking on continue button",true);
	}
	@Test
	 public void validateUserName() throws EncryptedDocumentException, IOException  
	{
	String actualUserName = home.getActualUserID();
	String expectedUserName=Utility.readDataFormExcel(0, 0);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	Reporter.log("Validating user ID ",true);
	Assert.assertEquals(actualUserName, expectedUserName,"TC is FAILED actual and expected user names not matching");
	Reporter.log("User names are matching TC is passed", true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	Utility.takeScreenshot(driver);
	 }
	@AfterMethod
	public void logoutfromKiteApp() throws InterruptedException
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
