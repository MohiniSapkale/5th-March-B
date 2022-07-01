package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getSize());
		
		//To set size--> use Dimension class and create object of Dimension class
		
		Dimension d= new Dimension(1200, 900);
		
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		}

}
