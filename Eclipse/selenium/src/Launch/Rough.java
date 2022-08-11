package Launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rough {

	public static void main(String[] args) {
		
		
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.loadLibrary("thfth");
		
		
		String Title = "hello";
		WebDriverWait wait = new WebDriverWait(driver, 12);
		wait.until(ExpectedConditions.titleContains("hello"));
		
		
	}

}
