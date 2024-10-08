package Seleneium;

import org.testng.annotations.Test;

public class Testngfeatures {
    
	
	@Test(invocationCount = 3)
	public void sum()
	{
		int a=10;
		int b=10;
		int c= a+b;
		System.out.println("sum is" +c);
	}
	@Test
	public void login()
	{
		System.out.println("login sucessful");
		int i =9/0;
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		System.out.println("logout sucessful");
	}
	
}
