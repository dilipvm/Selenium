package button;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		// button enabled or not
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt92\"]"));
		Boolean buton =  button1.isEnabled();
		System.out.println(buton);
		// Find the position of the Submit button

		WebElement position = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]"));
		// in java we have point class to find the position 
		Point xypoint = position.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		System.out.println("X value is :"+xvalue + " Y value is :"+yvalue);

		//Find the Save button color
		WebElement colour = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]"));
		String col = colour.getCssValue("background");
		System.out.println(col);

		//Find the height and width of this button
		WebElement sizeofbutton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]"));
		int height= sizeofbutton.getSize().getHeight();
		int width = sizeofbutton.getSize().getWidth();
		System.out.println("Height is "+ height +" width is "+ width);
		
		WebElement Mouseover = driver.findElement(By.id("j_idt88:j_idt100"));
		WebElement Mouseleft =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span"));
		System.out.println(Mouseover.getCssValue("background-color"));
		System.out.println(Mouseleft.getCssValue("Mouseleft"));
		
	
 
		//
	}

}
