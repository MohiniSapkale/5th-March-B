package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		//move to element using mouse actions
		
		WebElement Element = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		Actions act = new Actions(driver);
		act.moveToElement(Element).perform();   // mouse move to the desired element ====> Sales
		
		//click using mouse actions
		
		WebElement Element1 = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		//act.moveToElement(Element1).perform();       //1st way
		//act.click().perform();
		
		//act.moveToElement(Element1).click().build().perform();      //2nd Way ====> When action Perform together then used ---> build().perform();
		
		//act.click(Element1).perform();   //3rd way ===> to click on desired element
		
		//act.moveToElement(Element1).contextClick(Element1).build().perform();   ////right click on desired Element--context click
		
		act.contextClick(Element1).perform();

	}

}
