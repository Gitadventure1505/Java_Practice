package Discover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_10 extends Generic
{
	@Test
	static void main() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//a[. = 'Solutions']"));
		ele.click();
		
		Thread.sleep(2500);
		WebElement ele2 = driver.findElement(By.xpath("//section[@id='features']//div[4]//div[1]//a[1]"));
	    ele2.click();
	    
	}
}
 