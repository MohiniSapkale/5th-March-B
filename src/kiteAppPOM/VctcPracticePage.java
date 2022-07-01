package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VctcPracticePage {
	
	@FindBy(xpath = "//input[@value='Radio2']") private WebElement RadioButton2;
	@FindBy(id = "show-textbox") private WebElement ShowTexBox;
	@FindBy(id = "displayed-text") private WebElement EnterName;
	@FindBy(xpath = "//input[@type='date']") private WebElement Calender;
	
	public VctcPracticePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickOnRadioButton()
	{
		 WebElement button = RadioButton2;
		 button.click();
		 return button;
	}
	
	public WebElement clickOnShowTextBox()
	{
		WebElement TextBox = ShowTexBox;
		TextBox.click();
		return TextBox;
	}
	
//	public WebElement ClickOnEnterName()
//	{
//		WebElement name = EnterName;
//		String value = name.sendKeys(EnterName);
//		return name;
//	}
	
	public WebElement clickOnCalender()
	{
		WebElement value = Calender;
		value.click();
		return value;
	}

}
