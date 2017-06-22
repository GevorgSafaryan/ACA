package page.registration;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;

public class RegistrationPage {
	WebDriver driver;
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(100);
	final String regEmailXpath = Constants.REGISTRATION_EMAIL_XPATH;
	final String regMobileXpath = Constants.REGISTRATION_MOBILE_XPATH;
	final String regUsernameXpath = Constants.REGISTRATION_USERNAME_XPATH;
	final String regPasswordXpath = Constants.REGISTRATION_PASSWORD_XPATH;
	final String regPassword1Xpath = Constants.REGISTRATION_PASSWORD1_XPATH;
	final String firstNameXpath = Constants.FIRST_NAME_XPATH;
	final String lastNameXpath = Constants.LAST_NAME_XPATH;
	final String genderXpath = Constants.GENDER_XPATH;
	final String maleXpath = Constants.MALE_XPATH;
	final String birthdayXpath = Constants.BIRTHDAY_XPATH;
	final String dayXpath = Constants.DAY_XPATH;
	final String birthMonthXpath = Constants.BIRTH_MONTH_XPATH;
	final String monthXpath = Constants.MONTH_XPATH;
	final String birthYearXpath = Constants.BIRTH_YEAR_XPATH;
	final String yearXpath = Constants.YEAR_XPATH;
	final String regCountry = Constants.REGISTRATION_COUNTRY_XPATH;
	final String regCountry1 = Constants.REGISTRATION_COUNTRY1_XPATH;
	final String cityXpath = Constants.CITY_XPATH;
	final String city1Xpath = Constants.CITY1_XPATH;
	final String addressXpath = Constants.ADDRESS_XPATH;
	final String passportXpath = Constants.PASSPORT_XPATH;
	final String confirmationXpath = Constants.CONFIRMATION_XPATH;
	final String regSubmitXpath = Constants.REGISTRATION_SUBMIT_XPATH;
	
	
	@FindBy(xpath=regEmailXpath)
	WebElement regemail;
	
	@FindBy(xpath=regMobileXpath)
	WebElement regmobile;
	
	@FindBy(xpath=regUsernameXpath)
	WebElement regusername;
	
	@FindBy(xpath=regPasswordXpath)
	WebElement regpassword;
	
	@FindBy(xpath=regPassword1Xpath)
	WebElement regpassword1;
	
	@FindBy(xpath=firstNameXpath)
	WebElement firstname;
	
	@FindBy(xpath=lastNameXpath)
	WebElement lastname;
	
	@FindBy(xpath=genderXpath)
	WebElement gender;
	
	@FindBy(xpath=maleXpath)
	WebElement male;
	
	@FindBy(xpath=birthdayXpath)
	WebElement birthday;
	
	@FindBy(xpath=dayXpath)
	WebElement day;
	
	@FindBy(xpath=birthMonthXpath)
	WebElement birthmonth;
	
	@FindBy(xpath=monthXpath)
	WebElement month;
	
	@FindBy(xpath=birthYearXpath)
	WebElement birthyear;
	
	@FindBy(xpath=yearXpath)
	WebElement year;
	
	@FindBy(xpath=regCountry)
	WebElement regcountry;
	
	@FindBy(xpath=regCountry1)
	WebElement regcountry1;
	
	@FindBy(xpath=cityXpath)
	WebElement city;
	
	@FindBy(xpath=city1Xpath)
	WebElement city1;
	
	@FindBy(xpath=addressXpath)
	WebElement address;
	
	@FindBy(xpath=passportXpath)
	WebElement passport;
	
	@FindBy(xpath=confirmationXpath)
	WebElement confirmation;
	
	@FindBy(xpath=regSubmitXpath)
	WebElement regsubmit;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillEmail(){
		this.regemail.clear();
		int randomInt = randomGenerator.nextInt(1000);  
		regemail.sendKeys("username"+ randomInt +"@gmail.com");
		//this.regemail.sendKeys(regemail);
	}
	
	public void fillMobile(){
		this.regmobile.clear();
		int randomInt = randomGenerator.nextInt(999999);  
		regmobile.sendKeys("+374"+ randomInt);
		//this.regmobile.sendKeys(regmobile);
	}
	
	public void fillUsername() {
		this.regusername.clear();
		int randomInt = randomGenerator.nextInt(2020);
		regusername.sendKeys("qaaca" + randomInt);
		//this.regusername.sendKeys(regusername);
	}
	
	public void fillPassword(){
		this.regpassword.clear();
		regpassword.sendKeys("totoaca" + randomInt);
		
	}
	
	public void fillConfirmPassword(){
		this.regpassword1.clear();
		regpassword1.sendKeys("totoaca" + randomInt);
	}
	
	public void fillBothPasswords(){
		fillPassword();
		fillConfirmPassword();
	}
	
	public void fillFirstName(String firstname){
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}
	
	public void fillLastName(String lastname){
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}
	
	public void clickOnGender(){
		this.gender.click();
	}
	
	public void clickOnMale(){
		this.male.click();
	}
	
	public void clickOnBirthday(){
		this.birthday.click();
	}
	
	public void clickOnDay(){
		this.day.click();
	}
	
	public void clickOnBirthMonth(){
		this.birthmonth.click();
	}
	
	public void clickOnMonth(){
		this.month.click();
	}
	
	public void clickOnBirthYear(){
		this.birthyear.click();
	}
	
	public void clickOnYear(){
		this.year.click();
	}
	
	public void clickOnRegCountry(){
		this.regcountry.click();
	}
	
	public void clickOnRegCountry1(){
		this.regcountry1.click();
	}
	
	public void clickOnCity(){
		this.city.click();
	}
	
	public void clickOncity1(){
		this.city1.click();
	}
	
	public void fillPassport(){
		this.passport.clear();
		int randomInt = randomGenerator.nextInt(99999);
		passport.sendKeys("AH0" + randomInt + "0");
		//this.passport.sendKeys(passport);
	}
	
	public void fillAddres(){
		this.address.clear();
		int randomInt = randomGenerator.nextInt(99);
		address.sendKeys("Abovyan" + randomInt);
		//this.address.sendKeys(address);
	}
	
	public void clickOnConfirmation(){
		this.confirmation.click();
	}
	
	public void clickOnregSumbit(){
		this.regsubmit.click();
	}
}
