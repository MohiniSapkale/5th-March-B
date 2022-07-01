package kiteAppTestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClassUsingPropertyWhenTCFailTakeSS;
import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;
import kiteAppUtility.UtilityUsingPropertyFileWhenTcFailTakeSS;

@Listeners(testNgListener.Listener1.class)
public class KiteUNUsingPropertyWhenTcFailTakeSS extends BaseClassUsingPropertyWhenTCFailTakeSS {
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
	login.sendUsername(UtilityUsingPropertyFileWhenTcFailTakeSS.readDataFromPropertyFile("UN"));
	login.sendPassword(UtilityUsingPropertyFileWhenTcFailTakeSS.readDataFromPropertyFile("PWD"));
	login.clickOnLoginButton();
	UtilityUsingPropertyFileWhenTcFailTakeSS.implicitWait(driver, 200);
	pin.sendPin(UtilityUsingPropertyFileWhenTcFailTakeSS.readDataFromPropertyFile("PIN"));
	pin.clickOnContinue();
	UtilityUsingPropertyFileWhenTcFailTakeSS.implicitWait(driver, 200);
	}
	@Test
	 public void ValidateUserName() throws IOException 
	{
	String actualUserID = home.getActualUserID();
	String expectedUserID = UtilityUsingPropertyFileWhenTcFailTakeSS.readDataFromPropertyFile("UN1");  //TC is failed i.e Username=UN
	Assert.assertEquals(actualUserID, expectedUserID,"Actual and Expected are not matching, TC is failed");
	Reporter.log("Actual and Expected are matching, TC is PASSED", true);
	//UtilityUsingPropertyFile.takeScreenshot(driver);
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
