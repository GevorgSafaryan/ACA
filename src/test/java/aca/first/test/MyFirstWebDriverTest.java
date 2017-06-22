package aca.first.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MyFirstWebDriverTest {
	WebDriver driver;
	Random random = new Random();
	private String urlToto = Constants.TOTO_URL;
	private String url = Constants.SPORT_URL;

	@BeforeClass
	private void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		this.driver = new ChromeDriver(options);
		this.driver.get(url);
		this.driver.manage().window().maximize();
	}

	@AfterClass
	private void cleanUp() {
		this.driver.close();
		this.driver.quit();
	}

	@Test()
	public void myFirstTest() throws InterruptedException {

		GuestPage guest = new GuestPage(driver);
		Assert.assertTrue(guest.isLogoDisplayed());

		LoginPage login = new LoginPage(driver);
		login.clickOnLoginPanel();
		login.fillUsername("gevsafaryan");
		login.fillPassword("AcaQa2017");

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
		login.fillUsername("gevsafaryan");
		login.fillPassword("AcaQa2017");

		HomePage home = login.clickOnLogin();
		Assert.assertTrue(home.isBalanceDisplayed());
		Thread.sleep(3000);
		home.logout();
	}

	@Test()
	public void myThirdTest() throws Exception {

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

	@Test()
	public void myFourthTest() throws Exception {
		GuestPage draganddrop = new GuestPage(driver);
		Assert.assertTrue(draganddrop.isLogoDisplayed());
		WebElement draggable = draganddrop.getDraggable();
		WebElement target = draganddrop.getTarget();
		Thread.sleep(2000);
		new Actions(driver).dragAndDrop(draggable, target).perform();
		Thread.sleep(2000);
	}

	@Test()
	public void myFifthTest() throws Exception {
		GuestPage guest = new GuestPage(driver);
		Assert.assertTrue(guest.isLogoDisplayed());

		LoginPage login = new LoginPage(driver);
		login.clickOnLoginPanel();
		login.fillUsername("gevsafaryan");
		login.fillPassword("Aca2017");

		HomePage home = login.clickOnLogin();
		Assert.assertTrue(home.isBalanceDisplayed());
		Thread.sleep(3000);
		home.clickOnLiveTv();
		home.clickOnPanel();
		home.clickOnMatch();
		home.clickOnMoveTv();
		home.logout();
	}

	@Test()
	public void mySixthTest() throws Exception {
		GuestPage guest = new GuestPage(driver);
		Assert.assertTrue(guest.isLogoDisplayed());

		StatisticsPage statistics = guest.clickOnStatistics();
		ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(2));
		Thread.sleep(10000);
		statistics.clickOnStatmenu();
		statistics.clickOnContinent();
		statistics.clickOnaCountry();
		statistics.clickOnaTournament();
		Thread.sleep(10000);
		statistics.clickOnaMatch();
	}

	@Test()
	public void mySeventhTest() throws Exception {
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

	@Test()
	public void myEightTest() throws Exception {

		GuestPage guest = new GuestPage(driver);
		Assert.assertTrue(guest.isLogoDisplayed());

		LoginPage login = new LoginPage(driver);
		login.clickOnLoginPanel();
		login.fillUsername("gevsafaryan");
		login.fillPassword("AcaQa2018");
		HomePage home = login.clickOnLogin();
		Thread.sleep(3000);
		Assert.assertTrue(home.isBalanceDisplayed());
		Thread.sleep(3000);
		home.clickOnUsericon();
		Thread.sleep(3000);
		TransferPage transfer = home.clickOnDetails();
		Thread.sleep(3000);
		transfer.enterOldPassword("AcaQa2018");
		transfer.enterNewPassword("AcaQa2017");
		transfer.confirmPassword("AcaQa2017");
		Thread.sleep(2000);
		transfer.clickOnUpdate();
		Thread.sleep(3000);
		home = transfer.clickOnCloseButton();
		Assert.assertTrue(home.isBalanceDisplayed());
		Thread.sleep(3000);
		home.clickOnUsericon();
		Thread.sleep(3000);
		guest = home.clickOnLogout();
		Thread.sleep(3000);
		Assert.assertTrue(guest.isLogoDisplayed());
		login.clickOnLoginPanel();
		login.fillUsername("gevsafaryan");
		login.fillPassword("AcaQa2018");
		login.clickOnLogin();
		Thread.sleep(3000);
		Assert.assertTrue(login.isMessageDisplayed());
		Thread.sleep(3000);
		login.fillPassword("AcaQa2017");
		home = login.clickOnLogin();
		Assert.assertTrue(home.isBalanceDisplayed());
	}

	@Test()
	public void regTest() throws InterruptedException {

		GuestPage guest = new GuestPage(driver);
		Assert.assertTrue(guest.isLogoDisplayed());
		guest.clickOnLanguage();
		guest.clickOnEnglish();
		Thread.sleep(2000);
		RegistrationPage registration = guest.clickOnRegistration();
		Thread.sleep(1000);
		registration.fillUsername();
		registration.fillEmail();
		registration.fillBothPasswords();
		registration.fillFirstName("Mamikon");
		registration.fillLastName("Mamikonyan");
		Thread.sleep(2000);
		registration.clickOnBirthday();
		registration.clickOnDay();
		registration.clickOnBirthMonth();
		registration.clickOnMonth();
		registration.clickOnBirthYear();
		registration.clickOnYear();
		registration.clickOnRegCountry();
		Thread.sleep(2000);
		registration.clickOnRegCountry1();
		registration.clickOnCity();
		Thread.sleep(3000);
		registration.clickOncity1();
		registration.fillAddres();
		registration.fillMobile();
		registration.fillPassport();
		registration.clickOnConfirmation();
		Thread.sleep(15000);
		registration.clickOnregSumbit();
	}

	@Test()
	public void beloteTest() throws InterruptedException, AWTException {

		GuestPage guest = new GuestPage(driver);
		Assert.assertTrue(guest.isLogoDisplayed());

		LoginPage login = new LoginPage(driver);
		login.clickOnLoginPanel();
		login.fillUsername("gevsafaryan");
		login.fillPassword("AcaQa2017");
		HomePage home = login.clickOnLogin();
		Thread.sleep(3000);
		Assert.assertTrue(home.isBalanceDisplayed());
		BelotePage belote = home.clickOnBelote();
		Assert.assertTrue(belote.isBalanceDisplayed());
		Thread.sleep(5000);
		driver.get("https://blot.totogaming.am");
		belote.fillBetSum("100");
		belote.clickOnGameScore();
		Thread.sleep(2000);
		belote.clickOnGameScore1();
		belote.clickOnStepTime();
		Thread.sleep(2000);
		belote.clickOnStepTime1();
		belote.clickOnPrivateGame();
		belote.clickOnFourCards();
		Thread.sleep(2000);
		belote.clickOnSubmitButton();
	}
}