package Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com");
		
		driver.manage().deleteAllCookies();
		
	}

}
