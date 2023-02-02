package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebbrowserTest {
  
	@Test
	public void chromedriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.close();
	}
	
	@Test
	public void firefoxdriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dilip\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.close();
		
	}
	
	
	
	
	
	
	
}
