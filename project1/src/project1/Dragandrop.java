package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragandrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://beej.us/blog/data/drag-n-drop/");
		
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.xpath("//*[@id=\"goat0\"]"));
		WebElement draggablestayinparent = driver.findElement(By.xpath("//*[@id=\"goat1\"]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(draggablestayinparent,draggable ).build().perform();
		
		WebElement draggableblue =driver.findElement(By.xpath("//*[@id=\"goat3\"]"));
		WebElement draggablestayinparent1 = driver.findElement(By.xpath("//*[@id=\"goat2\"]"));
		
		Actions action1 = new Actions(driver);
		action1.clickAndHold(draggableblue).moveToElement(draggablestayinparent1).release().build().perform();
		
		WebElement draggableblue1 = driver.findElement(By.xpath("//*[@id=\"goat1\"]"));
		WebElement draggablestayinparent2 =driver.findElement(By.xpath("//*[@id=\"goat3\"]"));
		
		Actions action2 = new Actions(driver);
		action2.dragAndDrop(draggableblue1, draggablestayinparent2).build().perform();
		
		
		
		
		
		
		
		
		
		
	}

}
