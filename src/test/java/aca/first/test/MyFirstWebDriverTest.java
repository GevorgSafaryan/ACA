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
	

	@Test()
	public void myFirstTest() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://sport.totogaming.am");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//div[@class=\"logo\"]"));
		 Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"logo\"]")) != null);
		 driver.findElement(By.xpath("//*[@id=\"login_panel\"]/a[2]")).click();
		 WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		 login.sendKeys("gevsafaryan");
		 WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 password.sendKeys("A");
		 driver.findElement(By.xpath("//*[@id=\"login_dialogue\"]/input")).click();
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"lblBalance\"]")) != null);
		 driver.findElement(By.xpath("//div[@class='name' and text()='totobasket']")).click();
		 driver.findElement(By.xpath("//div[@class='valueList ']/div[7]")).click();
		 driver.findElement(By.xpath("//a[@title=\"Трансфер\"]")).click();
		 Thread.sleep(6000);
		 WebElement Amount = driver.findElement(By.xpath("//label[text() = \"Сумма\"]/../div/input"));
		 Amount.sendKeys("100");
		 driver.findElement(By.xpath("//input[@value=\"Подтвердить\"]")).click();
		 //driver.close();
		 //driver.quit();
	}
	@Test()
	public void mySecondTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"logo\"]"));
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"logo\"]")) != null);
		driver.findElement(By.xpath("//*[@id=\"login_panel\"]/a[2]")).click();
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		login.sendKeys("gevsafaryan");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("A");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login_dialogue\"]/input")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"lblBalance\"]")) != null);
		Select dropdown = new Select(driver.findElement(By.xpath("//div[@id=\"login_panel\"]/div[1]/select")));
		dropdown.selectByValue("0");
		//driver.findElement(By.xpath("//a[@class=\"usericon\"]")).click();
		//driver.findElement(By.xpath("//div[@class='valueList ']/div[8]")).click();
		
	}
	@Test()
	public void myThirdTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"logo\"]"));
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"logo\"]")) != null);
		driver.findElement(By.xpath("//a[text() = \"Календарь\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id=\"sport_filter\"]")).click();
		driver.findElement(By.xpath("//div[@title = \"Футбол\"]")).click();
		
	}
	
	@Test()
	public void myFourthTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\sport.totogaming.am");
		driver.manage().window().maximize();
		WebElement draggable = driver.findElement(By.xpath("//div[@id=\"reOrder\"]/div[2]"));
		WebElement target = driver.findElement(By.xpath("//div[@id=\"reOrder\"]/div[1]"));
		Thread.sleep(10000);
		new Actions(driver).dragAndDrop(draggable, target).perform();
	}
	
	@Test()
	public void myFifthTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"logo\"]"));
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"logo\"]")) != null);
		driver.findElement(By.xpath("//*[@id=\"login_panel\"]/a[2]")).click();
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		login.sendKeys("gevsafaryan");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"login_dialogue\"]/input")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"lblBalance\"]")) != null);
		driver.findElement(By.xpath("//span[text() = \"Live TV\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"player_panel\"]/div[1]")).click();
		driver.findElement(By.xpath("//div[@class=\"player_panel\"]/div[1]/div[1]/div[5]")).click();
	}
	
	@Test()
	public void mySixthTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"logo\"]"));
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"logo\"]")) != null);
		driver.findElement(By.xpath("//a[@title = \"Статистика\" and @class = \"sm ic\"]")).click();
		ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(2));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class = \"menu\"]/div[1]")).click();
		driver.findElement(By.xpath("//div[@id=\"sp_1\"]/div[3]")).click();
		driver.findElement(By.xpath("//div[@id=\"cont_1_1\"]/div[21]")).click();
		driver.findElement(By.xpath("//div[@id=\"cnt_1_74\"]/div[1]")).click();
	}
	
	@Test()
	public void mySeventhTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"logo\"]"));
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"logo\"]")) != null);
		driver.findElement(By.xpath("//a[text() = \"Результаты\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"res_cmb_ev\"]/label")).click();
		driver.findElement(By.xpath("//input[@value=\"Показать\"]")).click();
	}
	
	/*@Test()
	public void myEightTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sport.totogaming.am");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"logo\"]"));
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"logo\"]")) != null);
		driver.findElement(By.xpath("//*[@id=\"login_panel\"]/a[2]")).click();
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		login.sendKeys("gevsafaryan");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("AcaQa2017");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login_dialogue\"]/input")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"lblBalance\"]")) != null);
		driver.findElement(By.xpath("//a[@class=\"usericon\"]")).click();
		driver.findElement(By.xpath("//div[@class='valueList ']/div[1]")).click();
	}*/
	
}