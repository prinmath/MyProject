package Roicians;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// Step 1 to open the browser
		
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				//Step 2 type url of roician's home page
				driver.get("https://demoqa.com/droppable");
				Actions action=new Actions(driver);
				action.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();

	}

}
