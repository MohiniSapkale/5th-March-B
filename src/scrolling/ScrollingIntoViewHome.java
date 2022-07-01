package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoViewHome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement Element = driver.findElement(By.id("showSmallModal"));
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		
		j.executeScript("arguments[0].scrollIntoView(true);",Element);
		Thread.sleep(1000);
		Element.click();
		
		System.out.println(Element.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("closeSmallModal")).click();

	}

}
