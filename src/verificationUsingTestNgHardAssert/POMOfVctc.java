package verificationUsingTestNgHardAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POMOfVctc {
	
	@FindBy(xpath = "//input[@value='Radio1']") private WebElement RadioButton;
	@FindBy(xpath = "//a[text()='Velocity Corporate Training Center']") private WebElement Text;
	@FindBy(id = "hide-textbox") private WebElement hideButton;
	@FindBy(id = "show-textbox") private WebElement showButton;
	@FindBy(id = "displayed-text") private WebElement Text1;
	
	public POMOfVctc(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnRadioButton()
	{
		RadioButton.click();
		Assert.assertTrue(RadioButton.isSelected(),"Radio Button is not Selected TC is failed" );
	}
	
	public void GetText()
	{
		String expectedTitle = "VELOCITY CORPORATE TRAINING CENTER";
     	String actualTitle  = Text.getText();

		Assert.assertEquals(actualTitle, expectedTitle, "Titles of the website do not match");
	}

	public void ClickOnHideTextBox()
	{
		hideButton.click();
		
		Assert.assertTrue(hideButton.isDisplayed(), "HideButton is not Displayed Tc is failed");
	}
	
	public void ClickOnShowTextBox()
	{
		showButton.click();
		
		Assert.assertTrue(showButton.isDisplayed(), "ShowButton is not Displayed Tc is failed");
	}
	
	public void textDisplayed()
	{
		 Text1.sendKeys("Mohini");
		 Assert.assertNotNull(Text1, "value is Not Null TC failed");
	}
}
