package serialParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test
  public void myMethod1() {
  System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://paytm.com/");
  Reporter.log("myMethod1 is running", true);
  }
}
