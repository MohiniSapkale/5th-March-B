package kiteExcelReading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
         
			 //1. data members/variables
		    //Data member should be declared globally with access level private using @findBy Annotation
		   @FindBy(xpath = "//span[@class='user-id']") private WebElement UserId;
		   @FindBy(xpath = "//a[@target='_self']") private WebElement LogOutButton;
		   
		    //2. constructor  ==>a constructor with access level public using pagefactory class
		   public KiteHomePage(WebDriver driver)
		   {
		   	PageFactory.initElements(driver, this);
		   }
		
		   //3.method ==>a method with access level public
		   //here 2 webElement then action perform on 2 webElement i.e 2 Method
		   public void clickOnUserId()
		   {
		   	UserId.click();
		   }
		   
		   public void clickOnLogOut()
		   {
		   	LogOutButton.click();
		   }
		   
		   public String getActualUserID()
		   {
		   String actualUserID = UserId.getText();
		   return actualUserID;
		   }
		   
		   public void UserIdValidation(String ExpectedUserName)
			{
				String ActualUserId = UserId.getText();
						
				String ExpecxtedUserId= ExpectedUserName;
				
				if(ActualUserId.equals(ExpecxtedUserId))
					
				{
					System.out.println("TC passed user id is matching");
				}
				else 
				{
					System.out.println("TC failed user id is not-matching");
					
				}
			}
		   public void clickOnLogoutButton() throws InterruptedException
		   {
		   UserId.click();
		   Thread.sleep(2000);
		   LogOutButton.click();
		   }
}
