package intro1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		//driver.close();  // to Close current tab of browser
		//driver.quit();   // to close the all the tabs present in browser 
		
		driver.manage().window().maximize();   //used to maximize the browser
		//driver.manage().window().minimize();   //used to minimize the browser
		
		driver.navigate().to("https://meesho.com/");   //used to oepn app
		driver.navigate().forward();                  //used to move forward
		driver.navigate().back();                     //used to move backward
		driver.navigate().refresh();                  //used to refresh webpage
		
		String Title = driver.getTitle();              //used to get title of web page..it is return in String
		System.out.println("The URL Title is "+Title);
		
		String URL = driver.getCurrentUrl();            //used to get URL of Current webpage..it is return in String
		System.out.println("The current URL is "+URL);
		driver.close();

	}

}
