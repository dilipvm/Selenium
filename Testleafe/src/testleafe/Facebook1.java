package testleafe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement lanbutton = driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[12]/a"));
		lanbutton.click();
		Thread.sleep(3000);

		List<WebElement> lang = driver.findElements
				(By.xpath("//*[@id=\"intl-region-container\"]/div[1]/table/tbody/tr/td[1]/ul/li"));
		Thread.sleep(3000);
		
		






	}



	//div[@id='intl-region-container']/div[1]/table[1]/tbody[1]/tr[1]/td[1]
	//*[@id="intl-region-container"]/div[1]/table/tbody/tr/td[1]/ul/li

}


