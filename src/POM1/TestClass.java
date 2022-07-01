package POM1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://kite.zerodha.com/");  
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			KiteLoginPage login = new KiteLoginPage(driver);
			login.sendUserName();
			login.sendPassword();
			login.clickOnLoginButton();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			KitePinPage pinPage = new KitePinPage(driver);
			pinPage.sendPin();
			pinPage.clickOnContinue();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			KiteHomePage HomePage = new KiteHomePage(driver);
			HomePage.clickOnUserId();
			HomePage.UserIdValidation();
			HomePage.clickOnLogOut();
	}

}
