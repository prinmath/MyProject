package Roicians;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// Step 1 to open the browser
		
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				//Step 2 type url of roician's home page
				driver.get("https://www.roicians.com/");
				
				Actions action=new Actions(driver);
				action.moveToElement(driver.findElement(By.cssSelector("#premium-nav-menu-item-65 > a"))).build().perform();
				
				driver.findElement(By.linkText("SOFTWARE TESTING")).click();

	}

}
