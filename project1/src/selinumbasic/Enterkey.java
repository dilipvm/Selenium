package selinumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enterkey {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/sql/");
		
		// we need to find the link text value in html code in (a-tag) get the name in a tag
		driver.findElement(By.linkText("Python Tutorial")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		                                                                             
	}

}
