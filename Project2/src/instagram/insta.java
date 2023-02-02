package instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("manasa_gayathri___");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Mnbv0123@VM");

		WebElement sumit = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[3]/button/div"));
		sumit.click();

Thread.sleep(5000);
		WebElement emailid = driver.findElement
				(By.xpath("//*[@id=\"react-root\"]/section/main/div[2]/div/div/div/div/div[1]/div[3]/div/div/div[1]/span[2]"));
		emailid.getAttribute("text");

		System.out.println(emailid.getText());                                            

	}

}
