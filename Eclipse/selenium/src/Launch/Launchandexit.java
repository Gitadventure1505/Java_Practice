package Launch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Launchandexit 
{
public static void main(String[] args)
{
	String key = "webdriver.gecko.driver";
	String value = "./softwares/geckodriver.exe";
	System.setProperty(key, value);
	
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.quit();
	
	
	String key1 = "webdriver.chrome.driver";
	String value1 = "./softwares/chromedriver.exe";
	System.setProperty(key1, value1);
	
	ChromeDriver driver1 = new ChromeDriver();
	driver1.close();
	
	
	
}
}
