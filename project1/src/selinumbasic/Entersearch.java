package selinumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entersearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		// we need to find the link text value in html code in (a-tag) get the name in a tag 
// send key is used to enter the value in the search bar and we need to give the key enter to enter the search
	    driver.findElement(By.name("q")).sendKeys("fackbook"+Keys.ENTER);
	}

}
