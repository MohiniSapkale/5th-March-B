package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextHome {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		
		WebElement Element = driver.findElement(By.xpath("//a[text()='redbus']"));
		String ActualText = Element.getText();
		System.out.println("The Text is "+ActualText);
		
        String ExpectedText = "BlueBus";
        
        if(ActualText.equals(ExpectedText))
        {
        	System.out.println("Test Case is matching and Passed");
        }
        else
        {
        	System.out.println("Test case is not matching and Failed");
        }

	}

}
