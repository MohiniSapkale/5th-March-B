package zerodha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaExcelReading {

	private static String temp;

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		 System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://kite.zerodha.com/");  
			//driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
			File MyFile = new File("D:\\5th march batch\\MyFile.xlsx");
			Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
			int totalRowNum = sheet.getLastRowNum();
			int totalCellNum = sheet.getRow(totalRowNum).getLastCellNum()-1;
			
			System.out.println(totalRowNum);
			System.out.println(totalCellNum);
			
			ArrayList<String> al = new ArrayList<String>();
			for(int i=0; i<=totalRowNum; i++)
			{
				for(int j=0; j<=totalCellNum; j++)
				{
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					al.add(value);
					System.out.print(al.get(j)+ "  ");
					
				}
				System.out.println();
			}
			
			
			WebElement userName = driver.findElement(By.id("userid"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			userName.sendKeys(al.get(0));
			password.sendKeys(al.get(1));
			loginButton.click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
			WebElement pin = driver.findElement(By.id("pin"));
			WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
			pin.sendKeys(al.get(2));
			continueButton.click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
			WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']"));
			String actualUserID = userId.getText();
			String expectedUserID="ELR321";
			
			if (actualUserID.equals(expectedUserID))
			{
			    System.out.println("User ID matching TC is passed");
			}
			else 
			{
			System.out.println("User ID not matching TC is failed");
			}
			userId.click();
			Thread.sleep(2000);
			
			WebElement logOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
			logOutButton.click();
			Thread.sleep(2000);
			driver.close();

	}

}
