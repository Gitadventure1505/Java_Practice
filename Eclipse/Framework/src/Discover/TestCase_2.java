package Discover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_2 extends Generic
{
	@Test
	static void main()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// To synchronize the speed
		WebElement ele = driver.findElement(By.xpath("//em[@id='zsiq_agtpic']"));
		ele.click();
		
		driver.findElement(By.xpath("//input[@id='visname']")).sendKeys("Ramkumar");
		driver.findElement(By.xpath("//input[@id='visemail']")).sendKeys("mynameisram1996@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='msgarea']")).sendKeys("hi how are you");
		
		
		driver.findElement(By.xpath("//em[@id='sqico-send']")).click();
	}
}
//input[@id='visname']
//textarea[@id='msgarea']