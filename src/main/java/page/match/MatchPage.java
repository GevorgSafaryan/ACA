package page.match;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MatchPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='tabText']")
	WebElement main;
	
	public MatchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isMainDisplayed(){
		return this.main.isDisplayed();
	}

}
