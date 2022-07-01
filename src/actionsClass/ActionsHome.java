package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.mouseprogram.com/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

			//1. Moving the Mouse
//    	driver.findElement(By.xpath("//a[text()='1. Moving the Mouse']")).click();  //inspect the element Moving the mouse
		Actions act = new Actions(driver);  //use action class to to perform actions on mouse
//	
//		WebElement Element = driver.findElement(By.name("C"));  //inspect the squirrel element 
//		act.moveToElement(Element).click().build().perform();   //Click on squirrel and squirrel is move
//		driver.findElement(By.xpath("//a[text()='Return']")).click(); //click on return
		
		//2.Left Clicking
//		driver.findElement(By.xpath("//a[text()='2. Left Clicking']")).click();  //inspect the left clickking element
//		WebElement Element1 = driver.findElement(By.name("A"));   //inspect the squirrel 
//		act.moveToElement(Element1).click().build().perform();    //click on squirrel and squirrel moved
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[text()='Return']")).click(); //click on return
//		
//		//3.Right Clicking
//		driver.findElement(By.xpath("//a[text()='3. Right Clicking']")).click();   //inspect the Right Clicking Element
//		WebElement Element2 = driver.findElement(By.name("A"));           //Inspect the squirrrel
//		act.moveToElement(Element2).contextClick().build().perform();    //right click on squirrel
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[text()='Return']")).click(); //click on return
//		
		//4.Double Clicking
//		driver.findElement(By.xpath("//a[text()='4. Double Clicking']")).click();
//		WebElement Element3 = driver.findElement(By.name("C"));
//		act.moveToElement(Element3).doubleClick().build().perform();
//		Thread.sleep(1000);
//    	driver.findElement(By.xpath("//a[text()='Return']")).click(); //click on return
//		
    	//5. Dragging and Dropping
		driver.findElement(By.xpath("//a[text()='6. Dragging and Dropping']")).click();
		WebElement src = driver.findElement(By.xpath("//img[@class='drag']"));
		WebElement dest = driver.findElement(By.xpath("//input[@type='button']"));
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Return']")).click(); //click on return
	

	}

}
