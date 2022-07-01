package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkedTextStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://meesho.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement Element = driver.findElement(By.partialLinkText("Women Casual"));
		Thread.sleep(300);
		Element.click();
   }
}
