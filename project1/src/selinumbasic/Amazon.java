package selinumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.switchTo().frame("Sofa cum beds");
		//ads\
		
	   WebElement ads = driver.findElement(By.xpath("//*[@id=\"ai3pp_8sh_YL3dyAg-yNsw\"]/div[2]/div[1]/div[1]/a/div[1]"));
	   ads.click();

	}

}
