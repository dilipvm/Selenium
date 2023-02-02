package selinum_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mymarriage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.mymarriage.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement age = driver.findElement(By.name("agefrom"));
		Select select = new Select(age);
		select.selectByVisibleText("23");
		Thread.sleep(3000);

		WebElement community = driver.findElement(By.id("community"));
		Select s1 = new Select(community);
		s1.selectByVisibleText("Hindu");
		Thread.sleep(3000);

		WebElement mothertongue = driver.findElement(By.name("mothertongue"));
		Select s2 = new Select(mothertongue);
		s2.selectByVisibleText("Tamil");
		Thread.sleep(3000);

		WebElement Caste = driver.findElement(By.id("caste"));
		Select s5 = new Select(Caste);
		s5.selectByVisibleText("Vanniyakullak Kshatriya");
		Thread.sleep(3000);

		WebElement educationlevel = driver.findElement(By.name("educationlevel"));
		Select s3 = new Select(educationlevel);
		s3.selectByVisibleText("Undergraduate");
		Thread.sleep(3000);

		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("dilip100@gmail.com");
		Thread.sleep(3000);

		WebElement search = driver.findElement(By.xpath("//*[@id=\"signin\"]"));
		search.click();
	}

}
