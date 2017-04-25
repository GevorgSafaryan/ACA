package page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.login.LoginConstants;
import page.home.HomePage;

	public class LoginPage {
		
		final String loginPanelXPath = LoginConstants.LOGIN_PANEL;
		final String userNameXPath = LoginConstants.USER_NAME;
		final String passwordXpath = LoginConstants.PASSWORD;
		final String loginXpath = LoginConstants.LOGIN_2;
	
		@FindBy(xpath=loginPanelXPath)
		WebElement loginPanel;
		
		@FindBy(xpath=userNameXPath)
		WebElement userName;
		
		@FindBy(xpath=passwordXpath)
		WebElement password;
		
		@FindBy(xpath=loginXpath)
		WebElement login;
	
	private WebDriver driver;

	public LoginPage(WebDriver dr) {
		PageFactory.initElements(dr, this);
		this.driver = dr;
	}
	

	
	public void clickOnLoginPanel(){
		this.loginPanel.click();
	}

	public void fillUsername(String userName){
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void fillPassword(String password){
		this.password.clear();
		this.password.sendKeys(password);
	}

	public HomePage clickOnLogin(){
		this.login.click();
		return new HomePage(driver);
	}
	
}

