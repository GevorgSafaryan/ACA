package page.result;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;

public class ResultPage {
	
	WebDriver driver;
	
	final String countryMenuXPath = Constants.COUNTRY_MENU_XPATH;
	final String countryXpath = Constants.COUNTRY_XPATH;
	final String tournamnetMenuXpath = Constants.TOURNAMENT_MENU_XPATH;
	final String tournamentXpath = Constants.TOURNAMENT_XPATH;
	final String showXpath = Constants.SHOW_XPATH;
	
	@FindBy(xpath=countryMenuXPath)
	WebElement caountrymenu;
	
	@FindBy(xpath=countryXpath)
	WebElement country;
	
	@FindBy(xpath=tournamnetMenuXpath)
	WebElement tournamentmenu;
	
	@FindBy(xpath=tournamentXpath)
	WebElement tournament;
	
	@FindBy(xpath=showXpath)
	WebElement show;
	
	public ResultPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCountryMenu(){
		this.country.click();
	}
	
	public void clickOnCountry(){
		this.country.click();
	}
	
	public void clickOnTournamentMenu(){
		this.tournament.click();
	}
	
	public void clickOnTournament(){
		this.tournament.click();
	}
	
	public void clickOnShow(){
		this.show.click();
	}

}
