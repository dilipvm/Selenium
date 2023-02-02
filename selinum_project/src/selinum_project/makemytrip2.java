package selinum_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		//from
		WebElement from = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label"));
		from.click();

		WebElement search = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		search.sendKeys("che");

		Thread.sleep(3000);
		List<WebElement> city =driver.findElements(By.xpath("//*[@id=\"react-autowhatever-1\"]/div/ul/li"));
		Thread.sleep(3000);

		for (WebElement webElement : city) {
			if(webElement.getText().contains("Chennai")) {
				webElement.click();
				break;
			}
		}
		

		//to
		//WebElement 














	}

}
