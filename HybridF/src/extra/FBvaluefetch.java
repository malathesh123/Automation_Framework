package extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBvaluefetch 
{
	@Test
	public void click() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./SoftwareAA/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.name("email"));
	WebElement ele1 = driver.findElement(By.id("pass"));
	driver.findElement(By.name("login")).click(); 


	}
}

