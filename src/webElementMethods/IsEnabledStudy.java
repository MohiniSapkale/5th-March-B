package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
        Thread.sleep(5000);
		
		WebElement OTPButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    boolean result = OTPButton.isEnabled();
	    System.out.println("OTP button status is "+result);
	    
	    WebElement MobileNo = driver.findElement(By.id("mobileNumber"));
	    MobileNo.sendKeys("9587123654");
	    Thread.sleep(500);
	    
	    boolean result1 = OTPButton.isEnabled();
	    System.out.println("OTP button status is "+result1);
	    
	}

}
