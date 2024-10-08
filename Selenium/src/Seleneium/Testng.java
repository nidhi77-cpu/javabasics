package Seleneium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
   WebDriver driver;
	@BeforeClass

	public void launchBrowser()

	{
		System.out.println("launch the browseeee");
	}

	@BeforeSuite 
   //1
	public void launchBrowserrr()

	{
		System.out.println("launch the browseeee");
	}

	@BeforeMethod
	
	public void setup()
	{
		System.out.println("launch the browseeee");
	}
	
   @BeforeTest
	//2
	public void setupppp()
	{
		System.out.println("launch the browseeee");
	}
	
   @Test
   public void test()
   {
	   System.out.println("test the valuessss");
	   String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "google");
   }
   
   @Test
   public void testingmeans()
   {
	   System.out.println("test the meaninggg");
   }
   
   
   @AfterClass

	public void afterclass()

	{
		System.out.println("launch the browseeee");
	}

	@AfterSuite

	public void aftersuit()

	{
		System.out.println("launch the browseeee");
	}

	@AfterMethod
	
	public void aftermethod()
	{
		System.out.println("launch the browseeee");
	}
	
  @AfterTest
	
	public void aftertesting()
	{
		System.out.println("launch the browseeee");
	}
	
	
}