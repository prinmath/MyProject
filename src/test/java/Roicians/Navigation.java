package Roicians;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// Step 1 to open the browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Step 2 type url of roician's home page
		driver.get("https://www.roicians.com/career");
		driver.navigate().to("https://www.roicians.com/contact-us/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		driver.quit();

	}

}
