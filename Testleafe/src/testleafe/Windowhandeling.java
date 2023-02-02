package testleafe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");

		// current window
		String oldwindow = driver.getWindowHandle();

		WebElement homepagebutton = driver.findElement(By.xpath("//*[@id=\"home\"]"));
		homepagebutton.click();

		Set<String> handels = driver.getWindowHandles();

		for (String newwinmdow : handels) {

			driver.switchTo().window(newwinmdow);

		}

		WebElement editbox =driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		editbox.click();
		//if we need we can close the windows 
		//driver.close();

		driver.switchTo().window(oldwindow);

		WebElement multiwindows = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		multiwindows.click();

		int findwindows = driver.getWindowHandles().size();
		System.out.println(findwindows);

		//this code is use to close the child window and leave the old window open
		Set<String> newwindowhandels =driver.getWindowHandles();

		for (String allwindows : newwindowhandels) {
			if(!allwindows.equals(oldwindow)) {
				driver.switchTo().window(allwindows);
				driver.close();

			}

		}

	}
}
