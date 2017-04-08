package aca.first.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


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
	public void myFirstTest(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://sport.totogaming.am");
		 driver.findElement(By.xpath("//div[@class=\"logo\"]"));
		 Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"logo\"]")) != null);
		 driver.findElement(By.xpath("//*[@id=\"login_panel\"]/a[2]")).click();
		 WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		 login.sendKeys("totobasket");
		 WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 password.sendKeys("toto1");
		 driver.findElement(By.xpath("//*[@id=\"login_dialogue\"]/input")).click();
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"lblBalance\"]")) != null);
		 driver.findElement(By.xpath("//div[@class='name' and text()='totobasket']")).click();
		 driver.findElement(By.xpath("//div[@class='valueList ']/div[7]")).click();
		 //driver.findElement(By.xpath("//a[@title=\"Трансфер\"]")).click();
		 WebElement CasinoID = driver.findElement(By.xpath("//label[text() =  'Casino ID']/../input"));
		 CasinoID.sendKeys("137783");
		 //driver.close();
		 //driver.quit();
	}

}
