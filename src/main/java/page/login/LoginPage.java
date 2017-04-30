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
		final String incorrectXpath = LoginConstants.INCORRECT_XPATH;
	
		@FindBy(xpath=loginPanelXPath)
		WebElement loginPanel;
		
		@FindBy(xpath=userNameXPath)
		WebElement userName;
		
		@FindBy(xpath=passwordXpath)
		WebElement password;
		
		@FindBy(xpath=loginXpath)
		WebElement login;
		
		@FindBy(xpath=incorrectXpath)
		WebElement incorrect;
	
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

	//java-um, ete method@ asum a throws exception, apa iran kanchogh mehtod@ kam piti iran try/catch-i mej arni
	// kam piti ed kanchogh methodn el asi throws exception
	public HomePage clickOnLogin() throws InterruptedException{
		this.login.click();
		//es HomePage@ sarqvum a, bayc der ej@ chi bacel, hima Thread.sleep dnem estex, tesnenq kogni?
		Thread.sleep(3000);
		return new HomePage(driver);
	}
	
	public boolean isMessageDisplayed(){
		return this.incorrect.isDisplayed();
	}
	
}

