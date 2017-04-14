package aca.first.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MyFirstWebDriverTest {
	/*Description: Verify if it is possible to transfer money from sport balance to casino balance.
Precondition: The user have ID both in sport and in casino
Steps:
1. Open any browser,
2. Go to https://totogaming.am,
3. Press the Login button,
4. In the opened window enter valid login and password,
5. Press login,
6. Press on login wich is written in the right top of the page,
7. From the opened choose transfer,
8. In the opened window enter the Casino ID, the amount and press confirm
Expected result: The Sport ID will decrease and the Casino ID will increase by the same amount
*/
	

	/*@Test()
	public void myFirstTest() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://sport.totogaming.am");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(Constants.logo));
		 Assert.assertTrue(driver.findElement(By.xpath(Constants.logo)) != null);
		 driver.findElement(By.xpath(Constants.login1)).click();
		 WebElement login = driver.findElement(By.xpath(Constants.username));
		 login.sendKeys("gevsafaryan");
		 WebElement password = driver.findElement(By.xpath(Constants.parol));
		 password.sendKeys("A");
		 driver.findElement(By.xpath(Constants.login2)).click();
		 Assert.assertTrue(driver.findElement(By.xpath(Constants.balance)) != null);
		 driver.findElement(By.xpath(Constants.transfer)).click();
		 Thread.sleep(6000);
		 WebElement Amount = driver.findElement(By.xpath(Constants.amount));
		 Amount.sendKeys("100");
		 driver.findElement(By.xpath(Constants.confirm)).click();
		 //driver.close();
		 //driver.quit();
	}
	@Test()
	public void mySecondTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Constants.logo));
		Assert.assertTrue(driver.findElement(By.xpath(Constants.logo)) != null);
		driver.findElement(By.xpath(Constants.login1)).click();
		WebElement login = driver.findElement(By.xpath(Constants.username));
		login.sendKeys("gevsafaryan");
		WebElement password = driver.findElement(By.xpath(Constants.parol));
		password.sendKeys("A");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.login2)).click();
		Assert.assertTrue(driver.findElement(By.xpath(Constants.balance)) != null);
		driver.findElement(By.xpath(Constants.usericon)).click();
		driver.findElement(By.xpath(Constants.logout)).click();
		
	}
	@Test()
	public void myThirdTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Constants.logo));
		Assert.assertTrue(driver.findElement(By.xpath(Constants.logo)) != null);
		driver.findElement(By.xpath(Constants.calendar)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.sportfilter)).click();
		driver.findElement(By.xpath(Constants.football)).click();
		driver.findElement(By.xpath(Constants.firstmatch)).click();
		
	}
	
	@Test()
	public void myFourthTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Constants.logo));
		Assert.assertTrue(driver.findElement(By.xpath(Constants.logo)) != null);
		WebElement draggable = driver.findElement(By.xpath(Constants.content));
		WebElement target = driver.findElement(By.xpath(Constants.menu));
		Thread.sleep(2000);
		new Actions(driver).dragAndDrop(draggable, target).perform();
	}
	
	@Test()
	public void myFifthTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Constants.logo));
		Assert.assertTrue(driver.findElement(By.xpath(Constants.logo)) != null);
		driver.findElement(By.xpath(Constants.login1)).click();
		WebElement login = driver.findElement(By.xpath(Constants.username));
		login.sendKeys("gevsafaryan");
		WebElement password = driver.findElement(By.xpath(Constants.parol));
		password.sendKeys("A");
		driver.findElement(By.xpath(Constants.login2)).click();
		Assert.assertTrue(driver.findElement(By.xpath(Constants.balance)) != null);
		driver.findElement(By.xpath(Constants.livetv)).click();
		driver.findElement(By.xpath(Constants.panel)).click();
		driver.findElement(By.xpath(Constants.match)).click();
		driver.findElement(By.xpath(Constants.movetv)).click();
		
	}
	
	@Test()
	public void mySixthTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Constants.logo));
		Assert.assertTrue(driver.findElement(By.xpath(Constants.logo)) != null);
		driver.findElement(By.xpath(Constants.statistics)).click();
		ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(2));
		Thread.sleep(10000);
		driver.findElement(By.xpath(Constants.stmenu)).click();
		driver.findElement(By.xpath(Constants.cont)).click();
		driver.findElement(By.xpath(Constants.acountry)).click();
		driver.findElement(By.xpath(Constants.atour)).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(Constants.amatch)).click();
		
	}
	
	@Test()
	public void mySeventhTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Constants.logo));
		Assert.assertTrue(driver.findElement(By.xpath(Constants.logo)) != null);
		driver.findElement(By.xpath(Constants.lang)).click();
		driver.findElement(By.xpath(Constants.en)).click();
		driver.findElement(By.xpath(Constants.results)).click();
		driver.findElement(By.xpath(Constants.countmenu)).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(Constants.country)).click();
		driver.findElement(By.xpath(Constants.show)).click();
		
	}
	
	@Test()
	public void myEightTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Constants.logo));
		Assert.assertTrue(driver.findElement(By.xpath(Constants.logo)) != null);
		driver.findElement(By.xpath(Constants.login1)).click();
		WebElement login = driver.findElement(By.xpath(Constants.username));
		login.sendKeys("gevsafaryan");
		WebElement password = driver.findElement(By.xpath(Constants.parol));
		password.sendKeys("A");
		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.login2)).click();
		Assert.assertTrue(driver.findElement(By.xpath(Constants.balance)) != null);
		driver.findElement(By.xpath(Constants.usericon)).click();
		driver.findElement(By.xpath(Constants.details)).click();
	}*/
	
	/*@Test()
	public void aFacebook(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		Select bday = new Select(driver.findElement(By.id("day")));
		bday.selectByIndex(15);
		Select bmonth = new Select(driver.findElement(By.id("month")));
		bmonth.selectByValue("11");
		Select byear = new Select(driver.findElement(By.id("year")));
		byear.selectByVisibleText("1988");
	}*/
	
	@Test()
	public void regTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Constants.logo));
		Assert.assertTrue(driver.findElement(By.xpath(Constants.logo)) != null);
		driver.findElement(By.xpath(Constants.lang)).click();
		driver.findElement(By.xpath(Constants.en)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.register)).click();
		WebElement email = driver.findElement(By.xpath(Constants.regemail));
		email.sendKeys("gevs--88@mail.ru");
		WebElement mobile = driver.findElement(By.xpath(Constants.regmobile));
		mobile.sendKeys("+37411111111111");
		WebElement username = driver.findElement(By.xpath(Constants.regusername));
		username.sendKeys("qaaca");
		WebElement passreg = driver.findElement(By.xpath(Constants.regpass));
		passreg.sendKeys("t");
		WebElement passreg1 = driver.findElement(By.xpath(Constants.regpass1));
		passreg1.sendKeys("totoaca2017");
		WebElement fname = driver.findElement(By.xpath(Constants.regfname));
		fname.sendKeys("Mamikon");
		WebElement lname = driver.findElement(By.xpath(Constants.reglname));
		lname.sendKeys("Mamikonyan");
		driver.findElement(By.xpath(Constants.reggender)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.male)).click();
		driver.findElement(By.xpath(Constants.bday)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.bday1)).click();
		driver.findElement(By.xpath(Constants.bmonth)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.bmonth1)).click();
		driver.findElement(By.xpath(Constants.byear)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.byear1)).click();
		driver.findElement(By.xpath(Constants.regcountry)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.regcountry1)).click();
		driver.findElement(By.xpath(Constants.regcity)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Constants.regcity1)).click();
		WebElement address = driver.findElement(By.xpath(Constants.regaddress));
		address.sendKeys("Abovyan 1");
		WebElement passport = driver.findElement(By.xpath(Constants.regpassport));
		passport.sendKeys("AH1265478");
		driver.findElement(By.xpath(Constants.regconfirm)).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath(Constants.regsubmit)).click();
		
	}
	
}