package Facebook;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic 
{
	
	public WebDriver driver;
 @BeforeMethod
  public void OpenApp() 
  {
	  System.setProperty("webdriver.gecko.driver", "./Library/geckodriver.exe");
	  
	   driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
        
  }
  
  @AfterMethod(enabled = false)
  public void closeApp()
  {
	  driver.quit();
  }
  

  
  
}
