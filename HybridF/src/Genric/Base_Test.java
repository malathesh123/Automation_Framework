package Genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constants1 
{
	public WebDriver driver;
	@BeforeMethod
	public void OpenAppln()
	{
		System.setProperty(chrome_key,chrome_Val);
		driver=new ChromeDriver();
		
	}

}
