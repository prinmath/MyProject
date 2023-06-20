package Roicians;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAutomation {

	public static void main(String[] args) throws IOException {
	//open chrome browser			
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
	//open google.com
		driver.get("https://www.google.com/");	
	//navigate to amazon.ca
		driver.navigate().to("https://www.amazon.ca/");	
	//take screenshot
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("‪C://Users//princ//Downloads//screenshot.jpg"));	
	//verify element (Amazon.ca) is displayed
		boolean result= driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		System.out.println(result);	
	//mouse hover 'Hello, Sign in' & click 'Start here'
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
		/* WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		 * WebElement startHereLink= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Start here.")));*/
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();		
	//Fill the info page and click on 'Continue' button
		driver.findElement(By.id("ap_customer_name")).sendKeys("Prince Mathews");
		driver.findElement(By.id("ap_email")).sendKeys("prinmath@gmai.com");
		driver.findElement(By.id("ap_password")).sendKeys("Abc123");
		driver.findElement(By.id("ap_password_check")).sendKeys("Abc123");
		driver.findElement(By.id("continue")).click();   
		
		
		
	}

}
