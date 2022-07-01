package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolHome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframeResult");   //Move to Iframe
		 WebElement Element = driver.findElement(By.xpath("//button[@type='button']"));   //Find path using Xpath by Attribute
		 Element.click();    //Click on web Element
		 String Result = Element.getText();  //Get text the current webPage store string in Result
		 System.out.println("The Text of Frame is "+Result);  //Print the result
		 
		 driver.switchTo().defaultContent();       //move Iframe to main Page
		 driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();   //Click on change theme 
		 }

}
