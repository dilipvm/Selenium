package selinumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// flight from
		String optiontoselect = "New Delhi";
		WebElement from = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
		from.sendKeys("New");
		List<WebElement> option = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
		for(WebElement ele:option) {
			String  currentoption = ele.getText();
			if(currentoption.contains(optiontoselect)) {
				ele.click();
				break;	
			}				
		}

		// flight to we need to take xpath from input data not in div line
		String optiontoselect1 = "Bangkok, Thailand";
		WebElement to = driver.findElement(By.xpath("//*[@id=\"toCity\"]"));
		to.sendKeys("bangk");
		List<WebElement> option1 = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
		for(WebElement ele1:option1) {
			String  currentoption1 = ele1.getText();
			if(currentoption1.contains(optiontoselect1)) {
				ele1.click();
				break;	
			}				
		}
		Thread.sleep(3000);
		
		// depart time
//		WebElement depature = driver.findElement(By.xpath("//*[@id=\"departure\"]"));
//		String date = "27";
		List<WebElement> op1 = driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Nov 24 2022')]")); 

		

		//student fair
		
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[3]"));
		radio.click();
		
		Thread.sleep(3000);

		// travleers class
		WebElement travelbuttton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]"));
		travelbuttton.click();
		Thread.sleep(3000);

		//adult
		WebElement adultbutton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[4]"));
		adultbutton.click();
		Thread.sleep(3000);

		//children
//		WebElement child = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/div/div[1]/ul/li[3]"));
//		child.click();
//		Thread.sleep(3000);

		//primeumclass
		WebElement premium = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[2]"));
		premium.click();
		Thread.sleep(3000);

		//apply
		WebElement apply = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button"));
		apply.click();
		Thread.sleep(3000);

		// serach
		WebElement search = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a"));
		search.click();
		
			
		
	}

}
