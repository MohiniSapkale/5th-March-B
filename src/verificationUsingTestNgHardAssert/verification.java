package verificationUsingTestNgHardAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class verification {
	@Test
	 public void myTC() throws InterruptedException 
	 {
	        System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));     //inspect the element which we have selected
			 
			// if(checkBox1.isSelected())             //this is too lengthy procedure so we used Assert Class
			// {                                        in Assert Class all the menthods are static i.e 
	         // Reporter.log("TC is passed", true);           1) assertEquals()
			//}                                               2)assertNotEquals()
			// else {                                         3)assertTrue()
			// Reporter.log("TC is failed", true);            4)assertFalse()
			// }                                              5)assertNull()
			                                             //   6)assertNotNull()
														//    7)assertFail()
			 
			checkBox1.click();
			Thread.sleep(100);
			Assert.assertTrue(checkBox1.isSelected(), "CheckBox is not Selected TC is faild");    
			Reporter.log("CheckBox is Selected TC is Passed", true);
			 
			 }

}
