package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		WebElement firstimg1 = driver.findElement(By.id("draggable"));
		WebElement tosecond = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);

		//*[@id="content"]/iframe
		Actions action = new Actions(driver);
		action.dragAndDrop(firstimg1, tosecond).build().perform();
		
		
	}

}
