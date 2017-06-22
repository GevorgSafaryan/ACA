package page.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import page.belote.BelotePage;
import page.guest.GuestPage;
import page.transfer.TransferPage;

public class HomePage {
	WebDriver driver;
	
	final String balanceXpath = Constants.BALANCE_XPATH;
	final String transferXpath = Constants.TRANSFER_XPATH;
	final String usericonXpath = Constants.USERICON_XPATH;
	final String detailsXpath = Constants.DETAILS_XPATH;
	final String logoutXpath = Constants.LOGOUT_XPATH;
	final String livetvXpath = Constants.LIVETV_XPATH;
	final String panelXpath = Constants.PANEL_XPATH;
	final String matchXpath = Constants.MATCH_XPATH;
	final String movetvXpath = Constants.MOVETV_XPATH;
	final String beloteXpath = Constants.BELOTE_XPATH;
	final String gamesXpath = Constants.GAMES_XPATH;
	
	@FindBy(xpath=balanceXpath)
	WebElement balance;
	
	@FindBy(xpath=transferXpath)
	WebElement transfer;
	
	@FindBy(xpath=usericonXpath)
	WebElement usericon;
	
	@FindBy(xpath=detailsXpath)
	WebElement details;
	
	@FindBy(xpath=logoutXpath)
	WebElement logout;
	
	@FindBy(xpath=livetvXpath)
	WebElement livetv;
	
	@FindBy(xpath=panelXpath)
	WebElement panel;
	
	@FindBy(xpath=matchXpath)
	WebElement match;
	
	@FindBy(xpath=movetvXpath)
	WebElement movetv;
	
	@FindBy(xpath=beloteXpath)
	WebElement belote;
	
	@FindBy (xpath=gamesXpath)
	WebElement games;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isBalanceDisplayed(){
		return this.balance.isDisplayed();
	}
	
	public boolean isTransferDisplayed(){
		return this.transfer.isDisplayed();
	}
	
	public TransferPage clickOnTransfer(){
		this.transfer.click();
		return new TransferPage(driver);
	}
	
	public void clickOnUsericon(){
		this.usericon.click();
	}
	
	public TransferPage clickOnDetails(){
		this.details.click();
		return new TransferPage(driver);
	}
	
	public void clickOnLiveTv(){
		this.livetv.click();
	}
	
	public void clickOnPanel(){
		this.panel.click();
	}
	
	public void clickOnMatch(){
		this.match.click();
	}
	
	public void clickOnMoveTv(){
		this.movetv.click();
	}
	
	public GuestPage clickOnLogout(){
		this.logout.click();
		return new GuestPage(driver);
		
	}
	
	public BelotePage clickOnBelote(){
		Actions action = new Actions(driver);
		action.moveToElement(games).moveToElement(belote).click().build().perform();
		return new BelotePage(driver);
	}
	public GuestPage logout() throws InterruptedException{
		clickOnUsericon();
		Thread.sleep(3000);
		return clickOnLogout();
	}
}
