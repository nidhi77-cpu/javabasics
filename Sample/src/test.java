
public class test {

	public static <WebDriver> void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver");
		WebDriver driver =  new ChromeDriver;
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		
	}
}