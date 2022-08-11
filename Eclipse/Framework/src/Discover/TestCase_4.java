package Discover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_4 extends Generic
{
	@Test
	static void main()
	{
		WebElement ele = driver.findElement(By.xpath("//a[. = 'help @ discoverdollar.com']"));
	}
}
