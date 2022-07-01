package verificationUsingTestNgHardAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerificationVCTC {
	@Test
	 public void myTC() throws InterruptedException 
	 {
	        System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			
			//Title of webpage is match or not
//			WebElement Text = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
//			//System.out.println("Title is "+Text);
//			String expectedTitle = "VELOCITY CORPORATE TRAINING CENTER";
//			String actualTitle  = Text.getText();
//			
//			Assert.assertEquals(actualTitle, expectedTitle, "Titles of the website do not match");
//			Reporter.log("Title of Website is match", true);
			
			//Radio Button is select or not
//			WebElement RadioButton = driver.findElement(By.xpath("//input[@value='Radio1']"));  
//			RadioButton.click();
//			
//			Assert.assertTrue(RadioButton.isSelected(),"Radio Button is not Selected TC is failed" );  
//			Reporter.log("Radio Button is Selected TC is Passed", true);
			
			
			//element Displayed or not
			
//			WebElement hideButton = driver.findElement(By.id("hide-textbox"));
//			hideButton.click();
//			
//			Assert.assertFalse(hideButton.isDisplayed(), "HideButton is not Displayed Tc is failed");
//			Reporter.log("HideButton is Displayed Tc is Passed", true);
			
	        
//			WebElement showButton = driver.findElement(By.id("show-textbox"));
//			showButton.click();
//			
//			Assert.assertTrue(showButton.isDisplayed(), "ShowButton is not Displayed Tc is failed");
//			Reporter.log("ShowButton is Displayed Tc is Passed", true);
			
			//Enter name in text field is null or not
			WebElement text = driver.findElement(By.id("displayed-text"));
		    text.sendKeys("Mohini");
			
			
			Assert.assertNotNull(text, "value is Not Null TC failed");
			Reporter.log("Value is NOT Null Tc is passes", true);
			
			
			
	}
	
}
