package selinum_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testleafe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		
		WebElement errormessage = driver.findElement(By.xpath("//*[@id=\"j_idt106:thisform:age\"]"));
		errormessage.sendKeys(Keys.ENTER);
		
		WebElement firstname = driver .findElement(By.name("j_idt88:name"));
		firstname.sendKeys("dilip");
				
		WebElement append = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
		append.sendKeys(" Tamilnadu");

		
		WebElement cleartext = driver.findElement(By.name("j_idt88:j_idt95"));
		cleartext.clear();
		
		WebElement retrive = driver.findElement(By.name("j_idt88:j_idt97"));
		String value = retrive.getAttribute("value");
		System.out.println(value);
		
		WebElement enabled = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		Boolean text = enabled.isEnabled();
		System.out.println(text);
			
		WebElement emailtab = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt99\"]"));
		emailtab.sendKeys("dilip100@gmail.com" + Keys.TAB);
		
	    WebElement about = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]"));
	    about.sendKeys("hi ");
	    
	    WebElement  LabelPosition = driver.findElement(By.xpath("//*[@id=\"j_idt106:float-input\"]"));
	    LabelPosition.sendKeys(Keys.ENTER);
	    
	    WebElement slider = driver.findElement(By.xpath("//*[@id=\"j_idt106:slider\"]"));
	    slider.sendKeys("14");
		
	    WebElement Keyboard = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt122\"]"));
	    Keyboard.click();
	    
	    //name and choose the third option
	    WebElement nameandchoose = driver.findElement(By.id("j_idt106:auto-complete"));
	    nameandchoose.sendKeys("dilip");
	   // Select select = new Select(nameandchoose);
	}

}
