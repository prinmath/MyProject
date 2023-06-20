package Roicians;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
	// Step 1 to open the browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demoqa.com/alerts");
		/*driver.findElement(By.id("alertButton")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		*/
		
		/*
		 * driver.findElement(By.id("timerAlertButton")).click(); WebDriverWait wait=new
		 * WebDriverWait(driver,Duration.ofSeconds(5));
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert
		 * a=driver.switchTo().alert(); a.accept();
		 */
		
		/*
		 * driver.findElement(By.id("confirmButton")).click(); Alert
		 * a=driver.switchTo().alert(); a.dismiss();
		 */
		
		/*
		 * driver.findElement(By.id("promtButton")).click(); Alert
		 * a=driver.switchTo().alert(); a.sendKeys("Hello"); a.accept();
		 */
	//Authentication popup
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	

	}

}
