package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFriends 
{
 @FindBy(xpath = "(//input)[1]")
 WebElement search;
 
 SearchFriends(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void friend(String name)
 {
	 search.sendKeys(name);
 }
}
