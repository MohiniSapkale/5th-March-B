package kiteExcelReading;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://kite.zerodha.com/");  
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			File MyFile = new File("D:\\5th march batch\\MyFile.xlsx");
			Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
			String Username = MySheet.getRow(0).getCell(0).getStringCellValue();
			String Password = MySheet.getRow(0).getCell(1).getStringCellValue();
			String Pin = MySheet.getRow(0).getCell(2).getStringCellValue();
			
			
			KiteLoginPage login = new KiteLoginPage(driver);
			login.sendUsername(Username);
			login.sendPassword(Password);
			login.clickOnLoginButton();
			
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			KitePinPage pinPage = new KitePinPage(driver);
			pinPage.sendPin(Pin);
			pinPage.clickOnContinue();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			KiteHomePage HomePage = new KiteHomePage(driver);
			HomePage.clickOnUserId();
			HomePage.UserIdValidation(Username);
			Thread.sleep(2000);
			HomePage.clickOnLogOut();
		}

}
