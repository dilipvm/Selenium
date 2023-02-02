package testleafe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Samplefoundit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");

		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		
		String oldwindow =	driver.getWindowHandle();
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement company1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"themeDefault\"]/section[2]/section/div/div/div/div/div[1]/div/a[4]/ul/li/a/img")));
		company1.click();

		Set<String> handels = driver.getWindowHandles();

		for (String newwindow : handels) {
			driver.switchTo().window(newwindow);    
		}
		Thread.sleep(5000);
		driver.close();
		
		
		
//		driver.switchTo().window(oldwindow);	
//		WebDriverWait wait1 = new WebDriverWait(driver, 20);
//		WebElement company2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath
//				("//*[@id=\"themeDefault\"]/section[2]/section/div/div/div/div/div[1]/div/a[6]/ul/li/a/img")));
//		company2.click();

	}

}
