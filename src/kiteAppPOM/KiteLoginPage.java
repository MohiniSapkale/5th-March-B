package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	       //1. data members/variables
          //Data member should be declared globally with access level private using @findBy Annotation
          @FindBy(id = "userid") private WebElement UserName;
          @FindBy(id = "password")  private WebElement PW;
          @FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
    
          //2. constructor  ==>a constructor with access level public using pagefactory 
    
          public KiteLoginPage(WebDriver driver)
          {
        	  PageFactory.initElements(driver, this);
          }
    
          //3.method ==>a method with access level public
          //here 3 webElement then action perform on 3 webElement i.e 3 Method

          public void sendUsername(String Username)    //Pass parameter Username which is from Test class and test class get the username From Excel sheet
		  {
		   	 UserName.sendKeys(Username);
	      }
		    
		  public void sendPassword(String Password)
		  {
		   	 PW.sendKeys(Password);
	      }
		    
		  public void clickOnLoginButton()
		  {
		   	 LoginButton.click();
	      }
}
