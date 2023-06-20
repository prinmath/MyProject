package Roicians;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.collect.ImmutableMap;

public class TestngOne {
	WebDriver driver;
	SoftAssert obj;
	
@BeforeSuite
    public void driversetup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }
	/*
	 * @BeforeTest public void initialsetup() { // This method will run before each
	 * test tag in the testng.xml file ChromeOptions options=new ChromeOptions();
	 * options.setCapability("timeouts", ImmutableMap.of("implicit",10)); driver=new
	 * ChromeDriver(options); }
	 */

@BeforeMethod
    public void before() {
    	ChromeOptions options=new ChromeOptions();
    	options.setCapability("timeouts", ImmutableMap.of("implicit",10));
    	driver=new ChromeDriver(options);	
    	driver.get("https://www.google.com/");
    	obj=new SoftAssert();
    }
@DataProvider (name="getdata")
    public Object[][]search(){
	return new Object[][] {{"Roicians"},{"Roicians QA"},{"Roicians Careers"}};
}

@Test(dataProvider="getdata")
public void Display(String Keywords) throws InterruptedException{
	driver.findElement(By.cssSelector(".gLFyf")).sendKeys(Keywords);
	Thread.sleep(5000);
}

@Test(priority=1, groups="title")
    public void gettitle() {
        String Title= driver.getTitle();
        System.out.println(Title);
        obj.assertEquals(Title, "yahoo");
        driver.close();
        obj.assertAll();
    }

@Test(priority=2,groups="verify",dependsOnMethods= {"gettitle"})
    public void gmaildisplay() {
    boolean a=driver.findElement(By.linkText("Gmail")).isDisplayed();
        System.out.println(a);
    }
@AfterMethod public void afterMethod() {
		  driver.close(); }
	  }
	 
    

    