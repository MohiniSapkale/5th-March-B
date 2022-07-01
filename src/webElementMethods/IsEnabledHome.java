package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledHome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(3000);
		
		WebElement OTPButton = driver.findElement(By.xpath("//button[@class='sc-1kx5g6g-1 dlCvBh sc-cNnxps dOnLWu']"));
		boolean result = OTPButton.isEnabled();
		System.out.println("Send OTP Button Status is "+result);
		
		WebElement MobileNo = driver.findElement(By.xpath("//input[@type='number']"));
		MobileNo.sendKeys("9588600936");
		Thread.sleep(3000);
		
		boolean result1 = OTPButton.isEnabled();
		System.out.println("Send OTP Button is "+result1);

	}

}
