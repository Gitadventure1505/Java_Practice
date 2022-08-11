package Discover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;





public class TestCase_3  extends Generic

{
	@Test
	static void main()
	{
		WebElement ele = driver.findElement(By.xpath("//a[. = 'Team']"));
		ele.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// To synchronize the speed
		
		WebElement ele2 = driver.findElement(By.xpath("//p[contains(text(),'A serial entrepreneur since 19, he has started and')]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele2).perform();
		
		WebElement ele3 = driver.findElement(By.xpath("//a[href='https://www.linkedin.com/in/subrahmanyarao/']"));
		ele3.click();
		
		
		String Url = driver.getCurrentUrl();
		Assert.assertEquals(Url, "https://www.linkedin.com/in/subrahmanyarao/");
	}
	
}
