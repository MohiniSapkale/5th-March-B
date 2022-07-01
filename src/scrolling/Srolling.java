package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Srolling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		
		        // +ve x value--> right hand side, Y value +ve --> down 
				// +ve x value--> right hand side, Y value -ve --> up 
				// -ve x value--> left hand side, Y value +ve --> down 
				// -ve x value--> left hand side, Y value -ve --> up 
		
		j.executeScript("window.scrollBy(80,5000)");  // move to down side
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(80,-200)");
		Thread.sleep(2000);
		
		//j.executeScript("window.scrollBy(-80,500)");
		//Thread.sleep(2000);
		
		//j.executeScript("window.scrollBy(-800,-2000)");



	}

}
