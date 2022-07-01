package kiteAppTestClass;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClassVCTCUsingProperty;
import kiteAppPOM.VctcPracticePage;
import kiteAppUtility.UtilityVCTCUsingPropertyFile;

public class VctcTestClass extends BaseClassVCTCUsingProperty{
	
	VctcPracticePage page;
	
	@BeforeClass
	public void LaunchBrowser() throws IOException
	{
		openBrowser();
		UtilityVCTCUsingPropertyFile.implicitWait(driver, 500);
		page = new VctcPracticePage(driver);
	}
 
	
	@Test
    public void ScrollPageAndTakeSS() throws IOException {
		
		UtilityVCTCUsingPropertyFile.ScrollIntoView(driver,page.clickOnRadioButton());
		UtilityVCTCUsingPropertyFile.takeScreenshots(driver);
		UtilityVCTCUsingPropertyFile.implicitWait(driver, 500);
		
		UtilityVCTCUsingPropertyFile.ScrollIntoView(driver, page.clickOnShowTextBox());
		UtilityVCTCUsingPropertyFile.takeScreenshots(driver);
		UtilityVCTCUsingPropertyFile.implicitWait(driver, 500);
		
		UtilityVCTCUsingPropertyFile.ScrollIntoView(driver, page.clickOnCalender());
		UtilityVCTCUsingPropertyFile.takeScreenshots(driver);
		UtilityVCTCUsingPropertyFile.implicitWait(driver, 500);
		
  }
}