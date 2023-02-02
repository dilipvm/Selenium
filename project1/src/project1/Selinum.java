package project1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selinum {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver", "\\Users\\dilip\\Downloads\\chromedriver_win32.exe");
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.makemytrip.com/");
	}

}
