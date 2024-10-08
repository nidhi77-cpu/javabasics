package test;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver");
		WebDriver driver =  new WebDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		
	}

}
