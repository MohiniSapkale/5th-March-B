package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEx1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html");
				Thread.sleep(5000);

				WebElement searchTable = driver.findElement(By.xpath("//legend[text()='Web Table Example']"));
				searchTable.click();
				System.out.println("Table Name is ==> "+searchTable.getText());
				
				List<WebElement> tableHeader = driver.findElements(By.xpath("//tbody//th"));
				for(WebElement th :tableHeader)
				{
					System.out.print(th.getText()+ " || ");
				}

	}

}
