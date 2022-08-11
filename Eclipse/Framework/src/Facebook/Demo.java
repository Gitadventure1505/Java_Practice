package Facebook;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "./Library/geckodriver.exe");
		  
		   FirefoxDriver driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
	        
	  }
	

}
