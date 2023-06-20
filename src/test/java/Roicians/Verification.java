package Roicians;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) {
		// Step 1 to open the browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://ca.yahoo.com/");
	//boolean result=	driver.findElement(By.linkText("Sign in")).isDisplayed();
	//boolean result=	driver.findElement(By.linkText("Sign in")).isEnabled();
	//boolean result=	driver.findElement(By.linkText("Sign in")).isSelected();
	boolean result=	driver.findElement(By.cssSelector("._yb_18wt7")).isDisplayed();

	
	System.out.println(result);

	}

}
