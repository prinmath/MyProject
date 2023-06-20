package Roicians;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;

public class Waitevent {

	public static void main(String[] args) {
		// Step 1: open the browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.roicians.com/career/");
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
WebElement fname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text-248418663108")));
           fname.sendKeys("Prince");
           
         //Fluent wait
		 Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(20))
				 .pollingEvery(Duration.ofMillis(10))
				 .ignoring(NoSuchElementException.class);
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("text-248418663108"))).sendKeys("Prince"); 
		

	}

}
