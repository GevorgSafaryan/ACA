package aca.first.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import calendar.page.CalendarPage;
import constants.Constants;
import page.belote.BelotePage;
import page.guest.GuestPage;
import page.home.HomePage;
import page.login.LoginPage;
import page.match.MatchPage;
import page.registration.RegistrationPage;
import page.result.ResultPage;
import page.statistics.StatisticsPage;
import page.transfer.TransferPage;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyFirstWebDriverTest {
	WebDriver driver;
	private String urlToto = Constants.TOTO_URL;
	private String url = Constants.SPORT_URL;

	@BeforeClass
	private void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.get(url);
		this.driver.manage().window().maximize();
	}
	
	@AfterClass
	private void cleanUp(){
		this.driver.close();
		this.driver.quit();
	}
	
//	@BeforeMethod
//	public void newTab(){
//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
//		driver.findElement(By.linkText(url)).sendKeys(selectLinkOpeninNewTab);
//	}
	
	
	@Test()
	 public void myFirstTest() throws InterruptedException  {

		GuestPage guest = new GuestPage(driver);
		Assert.assertTrue(guest.isLogoDisplayed());

		LoginPage login = new LoginPage(driver);
		login.clickOnLoginPanel();
		login.fillUsername("gevsafn");
		login.fillPassword("AcaQa");
		
		HomePage home = login.clickOnLogin();
		Assert.assertTrue(home.isBalanceDisplayed());
		Thread.sleep(3000);
		Assert.assertTrue(home.isTransferDisplayed());
		TransferPage transfer = home.clickOnTransfer();
		Thread.sleep(3000);
		transfer.fillAmount("10");
		transfer.clikOnConfirm();
		home = transfer.clickOnCloseButton();
		Thread.sleep(3000);
		home.logout();
	}
	
	@Test()
	public void mySecondTest() throws Exception {
		
		GuestPage guest = new GuestPage(driver);
		Assert.assertTrue(guest.isLogoDisplayed());
		
		LoginPage login = new LoginPage(driver);
		login.clickOnLoginPanel();
		login.fillUsername("gevsryan");
		login.fillPassword("AcaQ17");
		
		HomePage home = login.clickOnLogin();
		Assert.assertTrue(home.isBalanceDisplayed());
		Thread.sleep(3000);
		home.logout();
	}
	
	
	
	 @Test() public void myThirdTest() throws Exception{
		 
		GuestPage guest = new GuestPage(driver);
		Assert.assertTrue(guest.isLogoDisplayed());
		
		CalendarPage calendar = guest.clickOnCalendar();
		Thread.sleep(2000);
		calendar.clickOnSportFilter();
		Thread.sleep(2000);
		calendar.clickOnFootball();
		Thread.sleep(2000);
		MatchPage match = calendar.clickOnFirstMatch();
		Assert.assertTrue(match.isMainDisplayed());
	 
	 }
	 
	 
	  @Test() public void myFourthTest() throws Exception {
		  GuestPage draganddrop = new GuestPage(driver);
		  Assert.assertTrue(draganddrop.isLogoDisplayed());
		  WebElement draggable = draganddrop.getDraggable();
		  WebElement target = draganddrop.getTarget();
		  Thread.sleep(2000); 
		  new Actions(driver).dragAndDrop(draggable,target).perform();
		  Thread.sleep(2000);
	 }
	  
		@Test() public void myFifthTest() throws Exception{
			GuestPage guest = new GuestPage(driver);
			Assert.assertTrue(guest.isLogoDisplayed());
			
			LoginPage login = new LoginPage(driver);
			login.clickOnLoginPanel();
			login.fillUsername("gevsn");
			login.fillPassword("Aca2017");
			
			HomePage home = login.clickOnLogin();
			Assert.assertTrue(home.isBalanceDisplayed());
			Thread.sleep(3000);
			home.clickOnLiveTv();
			home.clickOnPanel();
			home.clickOnMatch();
			home.clickOnMoveTv();
	 }

	  @Test() public void mySixthTest() throws Exception{
		  GuestPage guest = new GuestPage(driver);
		  Assert.assertTrue(guest.isLogoDisplayed());
		  
		  StatisticsPage statistics = guest.clickOnStatistics();
		  ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(windowHandles.get(2)); 
		  Thread.sleep(10000);
		  statistics.clickOnStatmenu();
		  statistics.clickOnContinent();
		  statistics.clickOnaCountry();
		  statistics.clickOnaTournament();
		  Thread.sleep(10000);
		  statistics.clickOnaMatch();
	 }
	  
	 @Test() public void mySeventhTest() throws Exception{
		 GuestPage guest = new GuestPage(driver);
		 Assert.assertTrue(guest.isLogoDisplayed());
		 guest.clickOnLanguage();
		 guest.clickOnEnglish();
		 
		 ResultPage result = guest.clickOnResult();
		 result.clickOnCountryMenu();
		 result.clickOnCountry();
		 result.clickOnTournamentMenu();
		 result.clickOnCountry();
		 result.clickOnShow();
	 }

	  @Test() public void myEightTest() throws Exception{
		  
		  	GuestPage guest = new GuestPage(driver);
			Assert.assertTrue(guest.isLogoDisplayed());
			
			LoginPage login = new LoginPage(driver);
			login.clickOnLoginPanel();
			login.fillUsername("gevaryan");
			login.fillPassword("Aca2017");
			HomePage home = login.clickOnLogin();
			Thread.sleep(3000);
			Assert.assertTrue(home.isBalanceDisplayed());
			Thread.sleep(3000);
			home.clickOnUsericon();
			Thread.sleep(3000);
			TransferPage transfer = home.clickOnDetails();
			Thread.sleep(3000);
			transfer.enterOldPassword("Ac2017");
			transfer.enterNewPassword("AcaQa18");
			transfer.confirmPassword("AQa2018");
			Thread.sleep(3000);
			transfer.clickOnUpdate();
			Thread.sleep(5000);
			home = transfer.clickOnCloseButton();
			Assert.assertTrue(home.isBalanceDisplayed());
			Thread.sleep(3000);
			home.clickOnUsericon();
			Thread.sleep(3000);
			guest = home.clickOnLogout();
			Thread.sleep(3000);
			Assert.assertTrue(guest.isLogoDisplayed());
			login.clickOnLoginPanel();
			login.fillUsername("gevryan");
			login.fillPassword("Qa2017");
			login.clickOnLogin();
			Thread.sleep(3000);
			Assert.assertTrue(login.isMessageDisplayed());
			Thread.sleep(3000);
			login.fillPassword("Aa2018");
			home = login.clickOnLogin();
			Assert.assertTrue(home.isBalanceDisplayed());
		  }
	  
	 
		@Test() public void regTest() throws InterruptedException, FileNotFoundException{
			
			GuestPage guest = new GuestPage(driver);
			Assert.assertTrue(guest.isLogoDisplayed());
			guest.clickOnLanguage();
			guest.clickOnEnglish();
			Thread.sleep(2000);
			RegistrationPage registration = guest.clickOnRegistration();
			registration.fillEmail();
			registration.fillMobile();
			registration.fillUsername();
			Thread.sleep(2000);
			//registration.fillUsername("qaaca");
			registration.fillPassword("totoaca2017");
			registration.fillPassword1("totoaca2017");
			registration.fillFirstName("Mamikon");
			registration.fillLastName("Mamikonyan");
			registration.clickOnGender();
			Thread.sleep(2000);
			registration.clickOnMale();
			registration.clickOnBirthday();
			Thread.sleep(2000);
			registration.clickOnDay();
			registration.clickOnBirthMonth();
			Thread.sleep(2000);
			registration.clickOnMonth();
			registration.clickOnBirthYear();
			Thread.sleep(2000);
			registration.clickOnYear();
			registration.clickOnRegCountry();
			Thread.sleep(2000);
			registration.clickOnRegCountry1();
			registration.clickOnCity();
			Thread.sleep(3000);
			registration.clickOncity1();
			registration.fillAddres("Abovyan 1");
			registration.fillPassport("AH1265478");
			registration.clickOnConfirmation();
			Thread.sleep(15000);
			registration.clickOnregSumbit();
		}

		@Test() public void beloteTest() throws InterruptedException{
			
			GuestPage guest = new GuestPage(driver);
			Assert.assertTrue(guest.isLogoDisplayed());
			
			LoginPage login = new LoginPage(driver);
			login.clickOnLoginPanel();
			login.fillUsername("gevryan");
			login.fillPassword("a2017");
			HomePage home = login.clickOnLogin();
			Thread.sleep(3000);
			Assert.assertTrue(home.isBalanceDisplayed());
			BelotePage belote = home.clickOnBelote();
			Assert.assertTrue(belote.isBalanceDisplayed());
			Thread.sleep(2000);
			belote.clickOnBeloteLanguage();
			Thread.sleep(2000);
			belote.clickOnEnglish();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,450)", ""); 
			Thread.sleep(2000);
			belote.fillBetSum("100");
			Thread.sleep(10000);
			belote.clickOnGameScore();
			Thread.sleep(2000);
			belote.clickOnGameScore1();
			belote.clickOnStepTime();
			Thread.sleep(2000);
			belote.clickOnStepTime1();
			belote.clickOnPrivateGame();
			belote.clickOnFourCards();
			belote.clickOnSubmitButton();
	  
	  }
	 
}