package page.transfer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;

public class TransferPage {
	WebDriver driver;
	
	final String amountXpath = Constants.AMOUNT_XPATH;
	final String confirmXpath = Constants.CONFIRM_XPATH;
	
	@FindBy(xpath=amountXpath)
	WebElement amount;
	
	@FindBy(xpath=confirmXpath)
	WebElement confirm;
	
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
}
