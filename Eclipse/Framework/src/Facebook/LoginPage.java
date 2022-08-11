package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  @FindBy(name = "email")
  private WebElement unbox;
  
 @FindBy(name="pass")
 private WebElement pwd;
 
 
 //@FindBy(xpath = "//input[@value='Log In']")
 @FindBy(name="login")
 private WebElement button;
 
 
 
 
  LoginPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 
 
 public void UserName(String un)
 {
	 unbox.sendKeys(un);
 }
 public void passWord(String pd)
 
 {
	 pwd.sendKeys(pd);
 }
 public void login() 
 {
	 button.click();
 }
 
 }

