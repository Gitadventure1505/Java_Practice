package mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop1 {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/Admin/Desktop/HTML/updated%20RAm.HTML");
	
	WebElement ele = driver.findElement(By.id("LOCATION "));
	Select s = new Select(ele);
	boolean res = s.isMultiple();
	System.out.println(res);
	
    
	
	  List<WebElement> opt = s.getOptions();
	  for(WebElement o : opt)
	  {
		  String ram = o.getText();
		  if(ram.charAt(0)=='C')
		  {   
			  s.selectByVisibleText(ram);
			  System.out.println(ram);
		  }
	  }
	  
	 /* int count = opt.size();
	  for(int i = 0 ; i<count; i=i+2)
		
		  s.selectByIndex(i);*/
        
		  
	}

}
