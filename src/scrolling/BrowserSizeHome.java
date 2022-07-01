package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSizeHome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension d = new Dimension(1200, 900);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		

	}

}
