package Roicians;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	WebDriver driver;
	Contactus_POM pom;
@BeforeMethod	
public void openbrowser() {
}{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	
	driver=new ChromeDriver();
	pom=new Contactus_POM(driver);
	driver.get("https://www.roicians.com/contact-us/");
}
	
@Test(priority=1)
public void validcase() throws InterruptedException {  

	pom.typefirstname("Prince"); 
	Thread.sleep(5000);

}
@Test(priority=2)
public void invalidcase() {
	pom.typelastname("Mathews");
}
@AfterMethod
public void closebrowser() {
	driver.close(); 
}

}
