package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyStudy {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(100);
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mohini");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		
		userName.sendKeys("Mohini");    //Using Refernce variable to resuse the methods
		Thread.sleep(1000);
		userName.clear();
		
		
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mohini123");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Mohini123");
		Thread.sleep(1000);
		password.clear();
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
