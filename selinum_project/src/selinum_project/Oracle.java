package selinum_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oracle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oracle.com/java/");

		WebElement visit = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/a"));
		visit.click();

		WebElement download = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[2]/div[1]/div[2]/div/div/div/a"));
		download.click();
		
		WebElement pagedown =driver.findElement(By.xpath("html"));
		pagedown.sendKeys(Keys.PAGE_DOWN);

		WebElement wintab = driver.findElement(By.xpath("//*[@id=\"rt01tab4-java8-windows\"]"));
		wintab.click();

		WebElement installer = driver.findElement(By.xpath("//*[@id=\"java8-windows\"]/section/div/div/div/table/tbody/tr[2]/td[3]/div/a"));
		installer.click();

		WebElement  enabled = driver.findElement(By.xpath("//*[@id=\"w11\"]/div/div[1]/div/div/div/form/div/div[2]/div"));
		boolean bo =	enabled.isEnabled();
		System.out.println(bo);

		WebElement checkbox =driver.findElement(By.xpath("//*[@id=\"w11\"]/div/div[1]/div/div/div/form/ul/li/label/input"));
		if(checkbox.isSelected()) {
			System.out.println("The checkbox is selected");
		}
		else {
			checkbox.click();
		}
		WebElement  enabled1 = driver.findElement(By.xpath("//*[@id=\"w11\"]/div/div[1]/div/div/div/form/div/div[2]/div"));
		boolean bo1 =	enabled1.isEnabled();
		System.out.println(bo1);

	}

}
