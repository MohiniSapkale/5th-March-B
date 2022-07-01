package locatorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		//driver.findElement(By.xpath("//input[@value=\'Radio4\']")).click();   //1.	xpath by attribute  Syntax : //tagname[@attribute name = 'attribute value']
		
		//driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));   //2.	xpath by text Syntax ---> //tagname[text() = ‘textvalue’]
		
		//driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate')]"));    //I.	Contains with text() ://tagname[contains(text(),'textvalue’)]
		
          //driver.findElement(By.xpath("//input[contains(@id,'show')]")).click();     //II.	Contains with attribute ://tagname[contains(@attribute name, ‘attribute value’)]



		
		
		
		

	}

}
