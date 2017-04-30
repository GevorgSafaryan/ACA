package page.statistics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;

public class StatisticsPage {
	
	WebDriver driver;
	final String statmenuXpath = Constants.STATMENU_XPATH;
	final String continentXpath = Constants.CONTINENT_XPATH;
	final String acountryXpath = Constants.A_COUNTRY_XPATH;
	final String atournamentXpath = Constants.A_TOURNAMENT_XPATH;
	final String amatchXpath = Constants.A_MATCH_XPATH;
	
	@FindBy(xpath=statmenuXpath)
	WebElement statmenu;
	
	@FindBy(xpath=continentXpath)
	WebElement continent;
	
	@FindBy(xpath=acountryXpath)
	WebElement acountry;
	
	@FindBy(xpath=atournamentXpath)
	WebElement atournament;
	
	@FindBy(xpath=amatchXpath)
	WebElement amatch;
	
	public StatisticsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnStatmenu(){
		this.statmenu.click();
	}
	
	public void clickOnContinent(){
		this.continent.click();
	}
	
	public void clickOnaCountry(){
		this.acountry.click();
	}
	
	public void clickOnaTournament(){
		this.atournament.click();
	}
	
	public void clickOnaMatch(){
		this.amatch.click();
	}
}
