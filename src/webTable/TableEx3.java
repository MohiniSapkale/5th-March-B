package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEx3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);

		List<WebElement> NoRows = driver.findElements(By.xpath("//tr"));
		List<WebElement> NoColumn = driver.findElements(By.xpath("//th"));
		
		int TotalNoRows = NoRows.size();
		int TotalNoColumn = NoColumn.size();
		
		System.out.println("Total number of rows are "+TotalNoRows);
		System.out.println("Total number of columns are "+TotalNoColumn);
		
		for(int i=1; i<=TotalNoRows; i++)
		{
			for(int j=1; j<=TotalNoColumn; j++)
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//th["+j+"]")).getText();
				    System.out.print(text+" ");

				}
				else
				{
					String text = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+" ");
				}
			}
			System.out.println();
		}

	}

}
