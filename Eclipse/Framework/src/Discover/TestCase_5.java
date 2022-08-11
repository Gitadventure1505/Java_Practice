package Discover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_5 extends Generic

{
	@Test
	static void main() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Careers')]"));
		ele.click();
		Thread.sleep(2500);
        String Url = driver.getCurrentUrl();
        
        Assert.assertEquals(Url, "https://www.discoverdollar.com/careers/");
	}
}
