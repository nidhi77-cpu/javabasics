package Seleneium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert;

public class Googletest
{
    WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
	}
	
	
	@Test(priority = 1 , groups = "title")
	public void googletitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	
	@Test(priority = 2, groups = "logotitle")
	public void googlelogotitle()
	{
		boolean s = driver.findElement(By.xpath("//div[@id='logo']")).isDisplayed();
	}
	
	@Test(priority = 3,groups = "test")
	public void test1()
	{
		
		System.out.println("koraiiii");
	}
	@Test(priority = 4, groups = "test")
	public void test2()
	{
		
		System.out.println("koraiiiirr");
	}
	@Test(priority = 5, groups = "test")
	public void test3()
	{
		
		System.out.println("koraiiiirfrdsd");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
