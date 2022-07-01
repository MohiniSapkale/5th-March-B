package kiteAppTestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClassUsingProperty;
import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;
import kiteAppUtility.UtilityUsingPropertyFile;

public class KiteUNTestUsingProperty extends BaseClassUsingProperty {
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
	openBrowser();
	login = new KiteLoginPage(driver);
	pin= new KitePinPage(driver);
	home= new KiteHomePage(driver);
	}
	
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		login.sendUsername(UtilityUsingPropertyFile.readDataFromPropertyFile("UN"));
		Reporter.log("Sending Username", true);
		login.sendPassword(UtilityUsingPropertyFile.readDataFromPropertyFile("PWD"));
		Reporter.log("Sending Password",true);
		login.clickOnLoginButton();
		Reporter.log("Clicking on login button",true);
		UtilityUsingPropertyFile.implicitWait(driver, 2000);
		
		pin.sendPin(UtilityUsingPropertyFile.readDataFromPropertyFile("PIN"));
		Reporter.log("Sending PIN",true);
		pin.clickOnContinue();
		Reporter.log("Clicking on continue button",true);
		UtilityUsingPropertyFile.implicitWait(driver, 2000);
	}
	
	@Test
	 public void ValidateUserName() throws IOException 
	 {
		String actualUserID=home.getActualUserID();
		String expectedUserID = UtilityUsingPropertyFile.readDataFromPropertyFile("UN");
		UtilityUsingPropertyFile.implicitWait(driver, 2000);
		Assert.assertEquals(actualUserID, expectedUserID,"Actual and Expected are not matching, TC is failed");
		Reporter.log("Actual and Expected are matching, TC is PASSED", true);
		UtilityUsingPropertyFile.takeScreenshot(driver);
	 }
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		home.clickOnLogoutButton();
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}
