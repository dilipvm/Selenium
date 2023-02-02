package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownbutton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node0176byawad0nna14rig1vwvby72421966.node0");
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(button1);
		select.selectByIndex(1);
		
//		WebElement button2 = driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete\']/ul"));
//		Select select1 = new Select(button2);
		
		WebElement button3 = driver.findElement(By.xpath("//*[@id=\"j_idt87:lang_label\"]"));
		Select select2 = new Select(button3);
		select2.selectByIndex(1);
		
		
	}

}
