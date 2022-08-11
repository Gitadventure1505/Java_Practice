package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchurl
{
  public static void main(String[] args)
  {
	  String key = "webdriver.gecko.driver";
			  String value = "./softwares/geckodriver.exe";
			  
			  System.setProperty(key, value);
			  
			  WebDriver driver = new FirefoxDriver();
			  driver.get("https://www.facebook.com/");
			  
  }
}
