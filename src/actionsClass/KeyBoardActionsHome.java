package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyBoardActionsHome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 // Enter the Full Name
		WebElement Name = driver.findElement(By.id("userName"));
		Actions act = new Actions(driver);
		//act.sendKeys(Name, "Mohini Nathu Sapkale").perform();
		
		act.keyDown(Name,Keys.SHIFT).sendKeys("M").keyUp(Keys.SHIFT).sendKeys("ohini Sapkale").build().perform();
		
		//Enter the Email
		WebElement Email = driver.findElement(By.id("userEmail"));
		Email.sendKeys("mohini@gmail.com");
		
		// Enter the Current Address
		WebElement CurrentAddress = driver.findElement(By.id("currentAddress"));
		CurrentAddress.sendKeys("Vrindavan Society");
		
		// Select the Current Address using CTRL + A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
       
		// Copy the Current Address using CTRL + C
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        
      //Press the TAB Key to Switch Focus to Permanent Address
        act.sendKeys(Keys.TAB).perform();
        
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        
      //Compare Text of current Address and Permanent Address
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        act.moveToElement(submit).click().build().perform();
        

	}


}
