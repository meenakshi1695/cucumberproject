package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public static  WebDriver driver; 
	
	public static void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\7cancel\\eclipse-workspace\\javacucumber\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.print(driver.getTitle());
		
	}
}
