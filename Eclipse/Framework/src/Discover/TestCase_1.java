package Discover;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_1 extends Generic
{
@Test
static void main()
{
	String Url = driver.getCurrentUrl();
    Assert.assertEquals(Url,"https://www.discoverdollar.com/");
    System.out.println("hi");
	
	}

}
