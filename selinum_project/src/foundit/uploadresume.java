package foundit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadresume {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		
		
		WebElement uploadbutton = driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]"));
		uploadbutton.click();
		
		//driver.findElement(By.xpath("//div[contains(@class,'uploadResume pr tc')]")).click();
		
	//	driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[4]/div/div/section/div/form/div[1]/div[1]/div/div/p[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[contains(@class,'uploadResume pr tc')]")));
		upload.click();
		

	}

}
