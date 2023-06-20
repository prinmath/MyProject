package Roicians;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Career {

	public static void main(String[] args) {
		// Step 1 to open the browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Step 2 type url of roicians career page
		driver.get("https://www.roicians.com/career/");
		driver.findElement(By.id("text-248418663108")).sendKeys("Prince");
		driver.findElement(By.id("text-58969147196")).sendKeys("Mathews");
		driver.findElement(By.id("text-25931186823")).sendKeys("prinmath@gmail.com");
		driver.findElement(By.id("field-LfRVhp7sisH0kRP")).sendKeys("6479478884");
		Select obj=new Select(driver.findElement(By.id("field-jHhehcNamzHL47m")));
		//obj.selectByVisibleText("QA Trainer");
		//obj.selectByValue("QA Trainer");
		obj.selectByIndex(7);
		driver.findElement(By.id("field-U7H2lPxWxSPqWeq")).sendKeys("‪C:\\Users\\princ\\Downloads\\goldenrule.pdf");
		driver.findElement(By.id("textarea-27447478041")).sendKeys("Thanks");
		driver.findElement(By.id("button-23567600038")).click(); 
		

	}

}
