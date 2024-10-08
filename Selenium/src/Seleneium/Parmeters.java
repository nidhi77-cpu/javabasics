package Seleneium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parmeters {
	
	WebDriver driver;
	@Test
	@Parameters({"browser","url","username"})
	public void yahoologin( String browser,String url, String username )
	{
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(username);
		
		
	WebElement ele=	driver.findElement(By.xpath("//input[@id='login-signin']"));
	ele.click();
	}

}
