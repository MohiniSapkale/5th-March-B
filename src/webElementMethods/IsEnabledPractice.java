package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement Output = driver.findElement(By.id("enabled-example-input"));
        boolean result = Output.isEnabled();
        System.out.println(result);
        
        Output.sendKeys("Mohini");
        boolean result1 = Output.isEnabled();
        System.out.println(result1);
	}

}
