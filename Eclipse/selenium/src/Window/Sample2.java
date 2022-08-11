package Window;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com");
		
		
		Dimension d = new Dimension(1000,800);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Point p = new Point(187,189);
		
		driver.manage().window().setPosition(p);
		
		
		
		
	}
}
