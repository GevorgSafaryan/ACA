package page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import page.guest.GuestPage;
import page.transfer.TransferPage;

public class HomePage {
	WebDriver driver;
	
	final String balanceXpath = Constants.BALANCE_XPATH;
	final String transferXpath = Constants.TRANSFER_XPATH;
	final String usericonXpath = Constants.USERICON_XPATH;
	final String logoutXpath = Constants.LOGOUT_XPATH;
	final String livetvXpath = Constants.LIVETV_XPATH;
	final String panelXpath = Constants.PANEL_XPATH;
	final String matchXpath = Constants.MATCH_XPATH;
	final String movetvXpath = Constants.MOVETV_XPATH;
	
	@FindBy(xpath=balanceXpath)
	WebElement balance;
	
	@FindBy(xpath=transferXpath)
	WebElement transfer;
	
	@FindBy(xpath=usericonXpath)
	WebElement usericon;
	
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
}
