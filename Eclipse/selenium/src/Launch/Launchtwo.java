package Launch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchtwo 
{
public static void main(String[] args)
{
	String key = "webdriver.gecko.driver";
	String value = "./softwares/geckodriver.exe";
	System.setProperty(key, value);
	
	FirefoxDriver driver = new FirefoxDriver();
	
	
	String key1 = "webdriver.chrome.driver";
	String value1 = "./softwares/chromedriver.exe";
	System.setProperty(key, value);
	
	ChromeDriver driver1 = new ChromeDriver();
	
	
}
}