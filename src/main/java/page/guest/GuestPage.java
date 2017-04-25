package page.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;

public class GuestPage {

	WebDriver driver;
	final String logoXpath = Constants.LOGO_XPATH;

	@FindBy(xpath=logoXpath)
	WebElement logo;
	
	//Constructor
	public GuestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isLogoDisplayed(){
		return this.logo.isDisplayed();
	}
}
