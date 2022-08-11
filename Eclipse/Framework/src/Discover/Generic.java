package Discover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic 
{
 static WebDriver driver;
 @BeforeMethod
 static void open() throws InterruptedException
 {
	System.setProperty("webdriver.gecko.driver", "./Library/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.discoverdollar.com/");
	Thread.sleep(5000); 
 }
 
 @AfterMethod
 static void close() 
 {
    driver.quit();
 }
}
