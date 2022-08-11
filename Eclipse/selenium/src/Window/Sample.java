package Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample 
{
   public static void main(String[] args) throws InterruptedException
   {
	   System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	   
	   WebDriver driver = new FirefoxDriver();
	   
	   driver.navigate().to("https://www.google.com");
	   
	   String Url = driver.getCurrentUrl();
	   System.out.println(Url);
	   
	   /*driver.navigate().to("https://www.gmail.com");
	   
	   Thread.sleep(4000);
	   
	   driver.navigate().back();
	   
	   Thread.sleep(4000);

	   
	   driver.navigate().forward();
	   
	   Thread.sleep(4000);

	   
	   driver.navigate().refresh();*/
	   
	   
	   
	   
   }
}
