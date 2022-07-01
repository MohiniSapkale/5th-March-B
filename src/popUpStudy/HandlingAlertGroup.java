package popUpStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertGroup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(5000);
		//1.To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
		
		Alert alt = driver.switchTo().alert();      //2.Alert is an interface which contains abstract methods like
		System.out.println(alt.getText());
		
		alt.accept();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(5000);
		//Alert alt1 = driver.switchTo().alert();
		//System.out.println(alt1.getText());
		//alt1.accept();
		}

}
