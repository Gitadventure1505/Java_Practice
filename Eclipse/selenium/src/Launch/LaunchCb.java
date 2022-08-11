package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchCb 
{
public static void main(String[] args) throws InterruptedException
{
	String key = "webdriver.chrome.driver";
	String value = "./softwares/chromedriver.exe";
	System.setProperty(key, value);
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/n/all-categories#ebay-motors");
	WebElement ele = driver.findElement(By.xpath("//td[@id = 'gh-cat-td']/../td[3]"));
	Thread.sleep(3000);
	ele.click();
	
}
}
