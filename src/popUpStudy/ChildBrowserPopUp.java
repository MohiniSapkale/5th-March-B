package popUpStudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("NewWindow")).click();   //Click on New Window -- open Child browser
		Thread.sleep(500);
		String idOfMainPage = driver.getWindowHandle();
		System.out.println("ID of Main page is "+idOfMainPage);
		
		Set<String> allId = driver.getWindowHandles();   //Child Browser are multiple So Id store in set of string 
		ArrayList<String> ar = new ArrayList<>(allId);    //convert String to Array because get method is not presernt in String
		
		for(int i=0; i<=ar.size()-1; i++)   //dynamic method
        {
              System.out.println(ar.get(i));	 //get Multiple window Id so we used get()
        }
		
		String MainPageId = ar.get(0);   //Main Page Id
		String ChildPageId = ar.get(1);  //child browser Id 
		
		driver.switchTo().window(ChildPageId);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("the7-search")).sendKeys("Selenium");
		driver.close();// will close only current open tab
		//driver.quit();// will close all windows open by selenuim in current session
		Thread.sleep(1000);
         
		driver.switchTo().window(MainPageId);// switching selenium focus from child page to main page
		//driver.switchTo().window(ar.get(0));
		driver.findElement(By.name("NewTab")).click();


		
	}

}
