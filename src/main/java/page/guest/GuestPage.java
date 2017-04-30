package page.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import calendar.page.CalendarPage;
import constants.Constants;
import page.registration.RegistrationPage;
import page.result.ResultPage;
import page.statistics.StatisticsPage;

public class GuestPage {

	WebDriver driver;
	final String logoXpath = Constants.LOGO_XPATH;
	final String calendarXpath = Constants.CALENDAR_XPATH;
	final String contentXpath = Constants.CONTENT_XPATH;
	final String menuXpath = Constants.MENU_XPATH;
	final String statisticsXpath = Constants.STATISTICS_XPATH;
	final String languageXpath = Constants.LANGUAGE_XPATH;
	final String englishXpath = Constants.ENGLISH_XPATH;
	final String resultXpath= Constants.RESULTS_XPATH;
	final String registrationXpath = Constants.REGISTRATION_XPATH;
	
	@FindBy(xpath=logoXpath)
	WebElement logo;
	
	@FindBy(xpath=calendarXpath)
	WebElement calendar;
	
	@FindBy(xpath=contentXpath)
	WebElement draggable;
	
	@FindBy(xpath=menuXpath)
	WebElement target;
	
	@FindBy(xpath=statisticsXpath)
	WebElement statistics;
	
	@FindBy(xpath=languageXpath)
	WebElement language;
	
	@FindBy(xpath=englishXpath)
	WebElement englsih;
	
	@FindBy(xpath=resultXpath)
	WebElement result;
	
	@FindBy(xpath=registrationXpath)
	WebElement registration;
	
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
	
	public StatisticsPage clickOnStatistics(){
		this.statistics.click();
		return new StatisticsPage(driver);
	}
	
	public void clickOnLanguage(){
		this.language.click();
	}
	
	public void clickOnEnglish(){
		this.englsih.click();
	}
	
	public ResultPage clickOnResult(){
		this.result.click();
		return new ResultPage(driver);
	}
	
	public RegistrationPage clickOnRegistration(){
		this.registration.click();
		return new RegistrationPage(driver);
	}
}
