package Discover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_7 extends Generic 
{
	@Test
	static void main()
	{
		WebElement ele = driver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]"));
		ele.click();
	}
}
