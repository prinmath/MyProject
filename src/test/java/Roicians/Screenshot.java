package Roicians;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class Screenshot {

	public static void main(String[] args) throws IOException {
	// Step 1 to open the browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Step 2 type url of roician's home page
		driver.get("https://www.roicians.com");
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("‪C://Users//princ//Downloads//screenshot.jpg"));
		

	}

}
