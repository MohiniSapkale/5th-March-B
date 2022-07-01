package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQAHome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\5th march batch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://demoqa.com/nestedframes");  // open URL
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	     driver.switchTo().frame("frame1");   //Move Main page to Frame1
	     WebElement Element = driver.findElement(By.xpath("//body[text()='Parent frame']"));  //find Element of Frame1
	     Thread.sleep(300);
	     System.out.println(Element.getText());         //Get Text of Frame1
	     Thread.sleep(300);
	     
	     WebElement Element1 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));  //find path of Frame2
	     //Element1.click();
	     driver.switchTo().frame(Element1);          //move to Frame2 i.e Child Frame
	     WebElement Element2 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));  //find text of Child Frame
	     //Element2.click();  // Click on Child Text
	     System.out.println(Element2.getText());               //Get text of Frame2
	     
	     driver.switchTo().defaultContent();        // Move to main page from Child path
	     WebElement Element3 = driver.findElement(By.xpath("//div[@id='framesWrapper']"));        //Find path of Text
	     System.out.println(Element3.getText());      //get text of main page
	     
	     driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).click();     //Click on ToolsQA 
	     Thread.sleep(500);
	     driver.navigate().back();         // Move page from ToolsQA to Main page 
	     Thread.sleep(500);
	     
	     driver.findElement(By.xpath("//div[text()='Nested Frames']"));    //find path of main page Title
	     String Title = driver.getTitle();        //used get title method to get current title of web Page and return type is string.
	     System.out.println("Title of WebPage is "+Title);  //print the Title
    }

}
