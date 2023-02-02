package testleafe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		
		WebElement alertbutton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertbutton.click();
		Thread.sleep(3000);
		Alert alertok = driver.switchTo().alert(); 

		alertok.accept();

		WebElement button2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		button2.click();
		
		Alert action1 = driver.switchTo().alert();
		Thread.sleep(3000);
		action1.dismiss();
	
		WebElement button3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		button3.click();
		
		Alert action2 = driver.switchTo().alert();
		Thread.sleep(3000);

		action2.sendKeys("dilip");
		Thread.sleep(3000);

		action2.accept();
	
	
	
	
	
	}
	

}
