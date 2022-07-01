package actionsClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actions2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement Element = driver.findElement(By.xpath("//span[text()='right click me']"));    // inspect element ==> right click me store in reference variable
		Actions act = new Actions(driver);                           // use actions class object and pass driver argument
		act.moveToElement(Element).contextClick().build().perform();   //Move to element and right click on Element
		System.out.println(Element.getText());                     // getText return text of element
		
	    driver.findElement(By.xpath("//span[text()='Quit']")).click();   //
        Alert alt = driver.switchTo().alert();	
        System.out.println(alt.getText());
        alt.accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		
        WebElement Element1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.moveToElement(Element1).doubleClick().build().perform();
		System.out.println(alt.getText());
		alt.accept();

	}

}
