package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		WebElement Element = driver.findElement(By.id("hide-textbox"));
		boolean result = Element.isDisplayed();
		System.out.println(result);
		
		WebElement Element1 = driver.findElement(By.id("displayed-text"));
		boolean result1 = Element1.isDisplayed();
		System.out.println(result1);
		Thread.sleep(500);
		Element1.sendKeys("Mohini");
	}

}
