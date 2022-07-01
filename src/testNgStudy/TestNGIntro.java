package testNgStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGIntro {
       @Test
       public void kiteZerodhaLogin() {
	  
	     System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://kite.zerodha.com/");  
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	     System.out.println("Kite Zerodha Login is Passed");
			
       }
       
       @Test
       public void facebookLogin()
       {
    	 System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver();
  	     driver.manage().window().maximize();
  	     driver.get("https://www.facebook.com/"); 
  	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  	     Reporter.log("Facebook Login Is passed", true);
       }
       
       @Test
       public void youtubeLogin()
       {
    	     System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
    	     WebDriver driver = new ChromeDriver();
    	     driver.manage().window().maximize();
    	     driver.get("https://www.youtube.com/");
    	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	     Reporter.log("Youtube Login is passed");
       }
       
       @Test
       public void vctcLogin()
       {
    	 System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver();
  	     driver.manage().window().maximize();
  	     driver.get("https://vctcpune.com/selenium/practice.html");
  	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
  	     Reporter.log("Velocity is login", true);
       }
    
      
}
