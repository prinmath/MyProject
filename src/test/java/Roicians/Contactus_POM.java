package Roicians;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactus_POM {
	WebDriver driver;	
	
	//to store element in variable. this is called annotation
	@FindBy(id="text-77525447616") WebElement fname;
	@FindBy(id="text-95374915097") WebElement lname;
	@FindBy(id="text-27022866830")WebElement email; 
	
	//driver.findElement(By.
	
public Contactus_POM(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}

	
public void typefirstname (String name)  {
    fname.sendKeys (name);	
   
}
public void typelastname (String name) {
	lname.sendKeys(name);
	
}}
