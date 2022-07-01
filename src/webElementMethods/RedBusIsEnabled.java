package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("hc")).click();
		
		WebElement MobileNo = driver.findElement(By.xpath("//input[@type='number']"));
		MobileNo.sendKeys("9588600936");
		Thread.sleep(7000);
		
		//WebElement GenerateOtp = driver.findElement(By.xpath(""));
		//boolean result = GenerateOtp.isEnabled();
		//System.out.println(result);
		//Thread.sleep(5000);
		
		
	}

}
