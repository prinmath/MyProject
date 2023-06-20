package Roicians;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus {

	public static void main(String[] args) {
		// Step 1 to open the browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Contactus_POM pom=new Contactus_POM(driver);
		
		//Step 2 open contactus page
		driver.get("https://www.roicians.com/contact-us/");

		pom.typefirstname("Prince");
		pom.typelastname("Mathews");
		
		/*
		 * driver.findElement(By.id("text-77525447616")).sendKeys("Prince");
		 * driver.findElement(By.id("text-95374915097")).sendKeys("Mathews");
		 * driver.findElement(By.id("text-27022866830")).sendKeys("prinmath@gmail.com");
		 * driver.findElement(By.id("field-kJfKGbPLNi5yFI7")).sendKeys("Hello");
		 * driver.findElement(By.id("field-tIgxvmTMez6ibt1")).sendKeys("6479478884");
		 * driver.findElement(By.id("button-18782068913")).click();
		 */
		 
		

	}

}
