package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextStudy {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(100);
			
			WebElement Element1 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
			System.out.println(Element1.getText());
			
			String actualText = Element1.getText();
			String expextedtext="facebook helps you connect and share with the people in your life.";
			
			if(actualText.equals(expextedtext))
			{
				System.out.println("Tast case is matching then Tc is passed");
			}
			else
			{
				System.out.println("Tast case is not matching then Tc is failed");
			}

	}

}
