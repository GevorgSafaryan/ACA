package calendar.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import page.match.MatchPage;

public class CalendarPage {
	
	final String sportfilterXpath = Constants.SPORTFILTER_XPATH;
	final String footballXpath = Constants.FOOTBALL_XPATH;
	final String firstmatchXpath = Constants.FIRSTMATCH_XPATH;
	
	@FindBy(xpath=sportfilterXpath)
	WebElement sportfilter;
	
	@FindBy(xpath=footballXpath)
	WebElement football;
	
	@FindBy(xpath=firstmatchXpath)
	WebElement firstmatch;
	
	WebDriver driver;
	
	public CalendarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSportFilter(){
		this.sportfilter.click();
	}
	
	public void clickOnFootball(){
		this.football.click();
	}
	
	public MatchPage clickOnFirstMatch(){
		this.firstmatch.click();
		return new MatchPage(driver);
	}

}
