package page.transfer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import page.home.HomePage;

public class TransferPage {
	WebDriver driver;
	
	final String amountXpath = Constants.AMOUNT_XPATH;
	final String confirmXpath = Constants.CONFIRM_XPATH;
	final String oldPaswwordXpath = Constants.OLD_PASSWORD_XPATH;
	final String newPasswordXpath = Constants.NEW_PASSWORD_XPATH;
	final String confirmPasswordXpath = Constants.CONFIRM_PASSWORD_XPATH;
	final String updateXpath = Constants.UPDATE_XPATH;
	final String closeButtonXpath = Constants.CLOSE_BUTTON_XPATH;
	
	@FindBy(xpath=amountXpath)
	WebElement amount;
	
	@FindBy(xpath=confirmXpath)
	WebElement confirm;
	
	@FindBy(xpath=oldPaswwordXpath)
	WebElement oldPassword;
	
	@FindBy(xpath=newPasswordXpath)
	WebElement newPassword;
	
	@FindBy(xpath=confirmPasswordXpath)
	WebElement confirmPassword;
	
	@FindBy(xpath=updateXpath)
	WebElement update;
	
	@FindBy(xpath=closeButtonXpath)
	WebElement closeButton;
	
	
	public TransferPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void fillAmount(String amount){
		this.amount.clear();
		this.amount.sendKeys(amount);
	}
	public void clikOnConfirm(){
		this.confirm.click();
	}
	
	public void enterOldPassword(String oldPassword){
		this.oldPassword.clear();
		this.oldPassword.sendKeys(oldPassword);
	}
	
	public void enterNewPassword(String newPassword){
		this.newPassword.clear();
		this.newPassword.sendKeys(newPassword);
	}
	
	public void confirmPassword(String confirmPassword){
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(confirmPassword);
	}
	
	public void clickOnUpdate(){
//		Actions actions = new Actions(driver);
//		actions.click(update).build().perform();
		this.update.click();
	}
	
	public HomePage clickOnCloseButton(){
		this.closeButton.click();
		return new HomePage(driver);
	}
}
