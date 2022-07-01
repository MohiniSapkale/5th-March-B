package fireFoxIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\5th march batch\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
		}

}
