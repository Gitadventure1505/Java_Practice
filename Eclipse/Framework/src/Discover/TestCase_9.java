package Discover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_9 extends Generic
{
	@Test
	static void main()
	{
		WebElement ele = driver.findElement(By.xpath("//i[@class='fa fa-twitter']"));
		ele.click();
	}
	
}
