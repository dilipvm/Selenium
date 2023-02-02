package selinumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 1. Using sendKeys.Keys method

		//		driver.get("https://accounts.google.com/SignUp");
		//		Thread.sleep(5000);
		//		driver.findElement(By.id("firstname-placeholder")).sendKeys(Keys.F5);

		//2.Using navigate.refresh() method
		driver.get("https://accounts.google.com/SignUp");  
		Thread.sleep(5000);
		driver.navigate().refresh();

		//3.Using navigate.to() method
		//
		//		driver.get("https://accounts.google.com/SignUp");  
		//		driver.navigate().to(driver.getCurrentUrl());

		//4.Using get() method
		//       
		//		driver.get("https://accounts.google.com/SignUp");  
		//		driver.get(driver.getCurrentUrl());

		//	5.Using sendKeys() method
		//
		//		driver.get("https://accounts.google.com/SignUp"); 
		//		driver.findElement(By.id("firstname-placeholder")).sendKeys("\uE035");
		
		

	}

}
