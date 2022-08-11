package Facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Main extends Generic
{
  @Test
  public void script() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, Exception
  {
	  
	  LoginPage l =new LoginPage(driver);
	  Thread.sleep(2000);
	  FbDatas.dummy();
   	  l.UserName(FbDatas.getUn());
	  Thread.sleep(2000);
	  l.passWord(FbDatas.getPwd());
	  Thread.sleep(2000);
	  l.login();
	  Thread.sleep(6000);
	  //Robot rob = new Robot();
	  //rob.keyPress(KeyEvent.VK_ESCAPE);
	  //rob.keyRelease(KeyEvent.VK_ESCAPE);
	 
	// driver.findElement(By.xpath("(//input)[1]")).sendKeys("hiiiiiii");  
  }
  
}
