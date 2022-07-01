package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	        //1. data members/variables
            //Data member should be declared globally with access level private using @findBy Annotation
	       @FindBy(id = "pin") private WebElement PIN;
	       @FindBy(xpath = "//button[@type='submit']")  private WebElement Continue;
	       
	       //2. constructor ==>a constructor with access level public using pagefactory
	         public KitePinPage(WebDriver driver)
	         {
	        	 PageFactory.initElements(driver, this);
	         }
	         
	       //3.method  ==>a method with access level public
	         //here 2 webElement then action perform on 2 webElement i.e 2 Methods
	         
	         public void sendPin()
	         {
	        	 PIN.sendKeys("982278");
	         }
	         
	         public void clickOnContinue()
	         {
	        	 Continue.click();
	         }

}
