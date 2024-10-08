package Seleneium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Halfedday {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void  beforesetup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
	}
   
	@Test
	public void ebaypagereg()
	{
		
	}
	
	
	
	@AfterMethod
	public void aftersetup()
	{
		driver.quit();
	}
	
}
