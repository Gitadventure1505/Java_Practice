package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Display
{
 public static void main(String[] args) throws InterruptedException
 {
	 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	 
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	 
	 WebElement ele =  driver.findElement(By.xpath("//input[@id ='identifierId']"));
	 boolean b = ele.isEnabled();
	 System.out.println(b);
	 if(b)
	 {
		 System.out.println("tbox in enabled");
	 }
	 else 
	 {
		 System.out.println("tbox in disabled"); 
	 }
	 
	 
 }
}
