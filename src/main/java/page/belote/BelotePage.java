package page.belote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;

public class BelotePage {
	WebDriver driver;
		
	final String beloteLanguageXpath = Constants.BELOTE_LANGUAGE_XPATH;
	final String beloteEnglsihXpath = Constants.BELOTE_ENGLISH_XPATH;
	final String betSumXpath = Constants.BET_SUM_XPATH;
	final String gameScoreXpath = Constants.GAME_SCORE_XPATH;
	final String gameScore1Xpath = Constants.GAME_SCORE1_XPATH;
	final String stepTimeXpath = Constants.STEP_TIME_XPATH;
	final String stepTime1Xpath = Constants.STEP_TIME1_XPATH;
	final String privateGameXpath = Constants.PRIVATE_GAME_XPATH;
	final String fourCardsXpath = Constants.FOUR_CARDS_XPATH;
	final String submitButtonXpath = Constants.SUBMIT_BUTTON_XPATH;
	final String balanceXpath = Constants.BALANCE_XPATH;
	final String betSumID = Constants.BET_SUM_ID;
	
	@FindBy(xpath=beloteLanguageXpath)
	WebElement beloteLanguage;
	
	@FindBy(xpath=beloteEnglsihXpath)
	WebElement beloteEnglsih;
	
	@FindBy(xpath=betSumXpath)
	WebElement betSum;
	
	@FindBy(xpath=gameScoreXpath)
	WebElement gameScore;
	
	@FindBy(xpath=gameScore1Xpath)
	WebElement gameScore1;
	
	@FindBy(xpath=stepTimeXpath)
	WebElement stepTime;
	
	@FindBy(xpath=stepTime1Xpath)
	WebElement stepTime1;
	
	@FindBy(xpath=privateGameXpath)
	WebElement privateGame;
	
	@FindBy(xpath=fourCardsXpath)
	WebElement fourCaards;
	
	@FindBy(xpath=submitButtonXpath)
	WebElement submitButton;
	
	@FindBy(xpath=balanceXpath)
	WebElement balance;
	
	public BelotePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isBalanceDisplayed(){
		return this.balance.isDisplayed();
	}
	
	public void clickOnBeloteLanguage(){
		this.beloteLanguage.click();
	}
	
	public void clickOnEnglish(){
		this.beloteEnglsih.click();
	}
	
	public void fillBetSum(String betSum){
		//Actions action = new Actions(driver);
		//action.click(betSum).sendKeys("100");
		this.betSum.clear();
		this.betSum.sendKeys(betSum);
	}
	
	public void clickOnGameScore(){
		this.gameScore.click();
	}
	
	public void clickOnGameScore1(){
		this.gameScore1.click();
	}
	
	public void clickOnStepTime(){
		this.stepTime.click();
	}
	
	public void clickOnStepTime1(){
		this.stepTime1.click();
	}
	
	public void clickOnPrivateGame(){
		this.privateGame.click();
	}
	
	public void clickOnFourCards(){
		this.fourCaards.click();
	}
	
	public void clickOnSubmitButton(){
		this.submitButton.click();
	}

}
