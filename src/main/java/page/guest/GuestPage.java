package page.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import calendar.page.CalendarPage;
import constants.Constants;

public class GuestPage {

	WebDriver driver;
	final String logoXpath = Constants.LOGO_XPATH;
	final String calendarXpath = Constants.CALENDAR_XPATH;
	final String contentXpath = Constants.CONTENT_XPATH;
	final String menuXpath = Constants.MENU_XPATH;

	@FindBy(xpath=logoXpath)
	WebElement logo;
	
	@FindBy(xpath=calendarXpath)
	WebElement calendar;
	
	@FindBy(xpath=contentXpath)
	WebElement draggable;
	
	@FindBy(xpath=menuXpath)
	WebElement target;
	
	//Constructor
	public GuestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isLogoDisplayed(){
		return this.logo.isDisplayed();
	}
	
	public CalendarPage clickOnCalendar(){
		this.calendar.click();
		return new CalendarPage(driver);
	}
	
	public WebElement getDraggable(){
		return draggable;
	}
	public WebElement getTarget(){
		return target;
	}
}
