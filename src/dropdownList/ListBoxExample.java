package dropdownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExample {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(2000);
		
		WebElement Day = driver.findElement(By.id("day"));
		
		Select s = new Select(Day);
		Thread.sleep(1000);
		s.selectByVisibleText("4");
		
		Thread.sleep(2000);
		s.selectByIndex(15);
		
		Thread.sleep(2000);
		s.selectByValue("31");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Thread.sleep(1000);
		
		Select s1 = new Select(month);
		Thread.sleep(1000);
		s1.selectByVisibleText("Feb");
		
		Thread.sleep(1000);
		s1.selectByValue("7");
		
		Thread.sleep(1000);
		s1.selectByIndex(11);
		
		for(int i=1;i<=11;i++)
		{
			Thread.sleep(100);
			s.selectByIndex(i);
        }
		for(int i=9;i>=0;i--)
		{
		Thread.sleep(100);
		s.selectByIndex(i);
		}
		boolean result = s.isMultiple();
		System.out.println("Multiple selection availabe result is "+result);
	}

}
