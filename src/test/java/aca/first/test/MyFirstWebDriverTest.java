package aca.first.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstWebDriverTest {
	/*Description: Verify if it is possible to transfer money from sport balance to casino balance.
Precondition: The user have ID both in sport and in casino
Steps:
1. Open any browser,
2. Go to https://totogaming.am,
3. Go to Sport,
4. Press the Login button,
5. In the opened window enter valid login and password,
6. Press login,
7. Press on login wich is written in the right top of the page,
8. From the opened choose transfer,
9. In the opened window enter the Casino ID, the amount and press confirm
Expected result: The Sport ID will decrease and the Casino ID will increase by the same amount
*/
	
	@Test()
	public void myFirstTest(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gevor\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://sport.totogaming.am");
		 driver.findElement(By.xpath("//*[@id=\"main_data_panel\"]/div[2]/div[1]/div[1]/div[1]"));
		 driver.close();
		 driver.quit();
	}

}
