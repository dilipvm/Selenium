package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login {

	@Test
	public  void mytest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		// username 
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("");
		//password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("");
		WebElement loginbutton = driver.findElement(By.id("log-in"));
		loginbutton.click();
		Thread.sleep(5000);
		String actualerror=	driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getText();
		String expectedmessage = "Both Username and Password must be present";	
		Assert.assertEquals(actualerror, expectedmessage);


	}

}
