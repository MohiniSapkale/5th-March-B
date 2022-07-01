package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementUnorderedList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.name("q")).sendKeys("honda");   //inspect the Search bar of google and type "honda"
		
		List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));  //we get list of Web Element inspect the path of Element which is present in List
		
		for(WebElement search:searchResults)
		{
			System.out.println(search.getText());   //print the list of web element 
			
		}
		
		String exectedResult = "honda amaze";    //but our excepted result is "Honada amaze"
		
		for(WebElement results:searchResults)   //then we search on list of element i.e Search Results using For each loop
		{
//			System.out.println(results.getText());
			String actualResult = results.getText();//honda
			
			if(actualResult.equals(exectedResult))
			{
				results.click();
				break;
			}
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	//	driver.findElement(By.linkText("Images")).click();
		
     	driver.findElement(By.partialLinkText("Ima")).click();


	}

}
