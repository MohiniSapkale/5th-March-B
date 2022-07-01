package popUpStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/\r\n");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();  //click on Alert Box option
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();   //move to main page to alert pop up..used switchto() 
		System.out.println(alt.getText());     //using getText method we get text from POP Up
		Thread.sleep(2000);
		alt.accept();       //click on ok button
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();   // move alert pop up to Confirm Alert
		Thread.sleep(4000);
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alt1.getText());           //using getText method we get text from POP Up
		Thread.sleep(4000);
		alt1.accept();      //click on Ok button
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
     	Thread.sleep(4000);
		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alt2.getText());

	}

}
