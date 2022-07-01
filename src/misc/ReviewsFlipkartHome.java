package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewsFlipkartHome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.name("q")).sendKeys("flipkart");
		
		List<WebElement> SearchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		 for( WebElement search : SearchResults)
		 {
			 System.out.println(search.getText());
		 }
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 System.out.println("===========================");
		 String expectedResult = "flipkart login";
		 
		 for(WebElement results : SearchResults)
		 {
			String actualResult = results.getText(); 
			
			if(actualResult.equals(expectedResult))
			{
				results.click();
				break;
			}
		 }
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 driver.findElement(By.xpath("//h3[text()='Flipkart']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("q")).sendKeys("dell laptop i5 genration");
		 Thread.sleep(1000);
		 
		 WebElement SearchResult1 = driver.findElement(By.xpath("//button[@type='submit']"));
		 SearchResult1.click();
		 Thread.sleep(1000);
		 
		 WebElement ratings = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]"));
		 System.out.println(ratings.getText());
		 
		 WebElement reviews = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]"));
		 System.out.println(reviews.getText());
		 

	}

}
