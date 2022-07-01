package popUpStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionStudy {

	public static void main(String[] args) throws InterruptedException {
		
		        System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("q")).sendKeys("iphone 13 pro");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
       }

}
