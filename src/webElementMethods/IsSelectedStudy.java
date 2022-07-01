package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		WebElement CheckBox = driver.findElement(By.id("checkBoxOption1"));
		
		if(CheckBox.isSelected())
		{
			System.out.println("CheckBox is already selected");
		}
		else
		{
			System.out.println("Please select Check Box Option");
			CheckBox.click();
			if(CheckBox.isSelected())
			{
				System.out.println("Check box is selected now");
			}
			else
			{
				System.out.println("Failed to Select Check Box");
			}
		}

	}

}
