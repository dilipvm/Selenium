package selinum_project;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		EventFiringWebDriver ef = new EventFiringWebDriver(driver);
		//clicking the language button
		WebElement languagebutton = driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[12]/a"));
		languagebutton.click();


		for(int i= 1; i<=4; i++){	
			List<WebElement> alllanguage = driver.findElements(By.xpath("//*[@id=\"intl-region-container\"]/div[1]/table/tbody/tr/td[1]/ul/li"));

			for(int j=1; j<= alllanguage.size();j++) {
				driver.findElement(By.xpath("//*[@id=\"intl-region-container\"]/div[1]/table/tbody/tr/td[" + i + "]/ul/li[" + j + "]/div/a")).click();

				driver.navigate().refresh();

				File f1= ef.getScreenshotAs(OutputType.FILE);

				File f2 =new File("C:\\Users\\dilip\\Pictures\\facebook\\fb"+driver.findElement(By.xpath
						("//*[@id=\"globalContainer\"]/div[2]/div/div/ul/li[1]")).getText()+".png");

				FileUtils.copyFile(f1, f2);
				
				driver.navigate().refresh();
				
				driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[12]/a")).click();


			}

		}

	}
}

